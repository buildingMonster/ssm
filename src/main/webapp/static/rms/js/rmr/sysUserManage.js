window.onload = function(){
layui.config({
        base: '/ssm/static/basic/layui/extends/'
}).extend({
        treetable: 'treetable-lay/treetable'
}).use(['table','form','layer','jquery','treetable'], function(){
	var table = layui.table;
	var form = layui.form;
	var layer = layui.layer;
	var treetable = layui.treetable;
	
	var url = location.search;//获取上一页面传过来的参数
	var usr_id_index = url.indexOf("ID")+3;
	var ifbf_usr_id = url.substring(usr_id_index);


	
	//用户管理主页数据表格渲染
	table.render({
		elem : '#sysUserTable',
		url : '/ssm/rms/rmu/listSysUser',
		title : '用户表',
		page : true,
		toolbar : '#userToolBar',
		 cols: [[
			 	{checkbox : true}
	            ,{field: 'user_id', title: '编号', width: 150}
	            , {field: 'user_name', title: '用户名', width: 400}
	            , {field: 'user_password', title: '用户密码', width: 213}
	            , {field: 'user_role_id', title: '用户角色ID', width: 210}
	            , { title: '用户角色名称', width: 400,templet:function(d){return d.sysRole.role_name}}
	            , {field: 'user_flag', title: '是否可用', templet: '#checkboxStartFlag', width: 135, unresize: true}
	            , {title: '操作', toolbar: '#userRowToolBar', width: 100}
	        ]]
		,id : 'userReload',

	});


  //页面自动刷新下拉框按钮
	loadSelectRole();
	//加载用户管理用户角色下拉框
	function loadSelectRole(){//data是 form表单里input标签输入的值，如要获取到每个不同标签的值，通过data.field再指向标签名就可获取值
		$.ajax({
			url : '/ssm/rms/rmr/listSysRole',
			type : 'post',
			dataType : 'json',
			success : function(data){
				var xx = data.data;
				var root = $('#eQueryUser_role_id');//获取select标签
				for(var i=0;i < xx.length; i++){
					var option = document.createElement("option");//创建页面dom元素
					if(option.getAttribute("value") == null){
						option.setAttribute("value",xx[i].role_id);
						option.innerText = xx[i].role_name;
						root.append(option);//select标签追加option元素
					}
				}
				form.render('select');//渲染表单，添加元素
			}
		});
	}
	//监听锁定操作
	form.on('checkbox(flagChange)', function(obj){
		var role_flag;
		if(obj.elem.checked){
			role_flag = 1;
		}else{
			role_flag = 0;
		}
		updateSysUserFlag(this.value,role_flag);
		return false;
	});
	//更新角色信息为是否可用
	function updateSysUserFlag(id,flag) {
		$.post('/maven_ssh/privilege/sysUserAction_updateSysUserFlag.action', {
			"sysUser.usr_id" : id,
			"sysUser.usr_flag" : flag,
		},function(ryther){
			if(ryther){
				layer.msg("保存成功！",{time : 1000}, function(){
					layer.closeAll();
					userTableReload();
				});
			}else{
				layer.msg("保存失败");
			}
	   });
	}
	//通过用户ID按钮ID查出中间表主键
	function getBf_id(bf_usr_id, bf_btn_id) {
		var bf_id = "";
		$.ajax({
			url : '/maven_ssh/privilege/sysUserButtonAction_findBf_id.action',
			type : 'get',
			dataType : 'json',
			data : {
				'sysUserButton.bf_usr_id' : bf_usr_id,
				'sysUserButton.bf_btn_id' : bf_btn_id
			},
			async : false,
			success : function(data){
				bf_id = data;
			}
		});
		return bf_id;
	}
	//表单监听checkbox，权限按钮是否授权
	form.on('checkbox(btnAuthFlagChange)', function(obj){
		var bf_usr_id = $('#eusr_id').val();
		var bf_btn_id = this.value.substring(this.value.indexOf(",")+1,this.value.length);
		//添加是授权，删除也是授权
		if(obj.elem.checked){
			btn_flag = 1;//为1时做添加
			addUserButtonAuth(bf_usr_id, bf_btn_id);
		}else{
			var bf_id = getBf_id(bf_usr_id, bf_btn_id);
			btn_flag = 0;//为0时做删除
			delUserButtonAuth(bf_id);
		}
		return false;
	});
	//给用户授权按钮（添加）
	function addUserButtonAuth(bf_usr_id, bf_btn_id) {
		$.post('/maven_ssh/privilege/sysUserButtonAction_addUserButtonAuth.action', {
			"sysUserButton.bf_usr_id" : bf_usr_id,
			"sysUserButton.bf_btn_id" : bf_btn_id
		});
	}
	//给用户授权按钮（删除）
	function delUserButtonAuth(bf_id) {
		$.post('/maven_ssh/privilege/sysUserButtonAction_delUserButtonAuth.action', {
			"sysUserButton.bf_id" : bf_id
		});
	}
	//用户按钮授权treetable展示
	function viewTreeTalbe(usr_role_id,buttonRightCodes){
		treetable.render({
        	elem: '#userTreeTable',
        	url: '/maven_ssh/privilege/sysRightAction_queryListTreeRight.action?sysRoleRight.rf_role_id='+usr_role_id,
            treeColIndex: 1,
            treeSpid: -1,
            treeIdName: 'id',
            treePidName: 'right_parent_code',
            treeDefaultClose: true,
            treeLinkage: false,
//            page: true,
            cols: [[
            	{type:'numbers'},
            	{field: 'name', title: '菜单名称', width : '30%'},
                {field: 'name', title: '节点名称', width : '13%'},
                {field: 'id', title: '按钮权限', width: '57%',
                	templet : function(d) {
                		var sx = "";
                		//加载权限对应的按钮
                		$.ajax({
                			url : '/maven_ssh/privilege/sysButtonAction_listSysButton2.action',
                			type : 'post',
                			dataType : 'json',
                			async : false,
                			data : {
                				"sysRight.id" : d.id
                			},
                			success : function(data){
                				var data = data.data;
                				//将查出的按钮菜单ID切割成字符数组，与菜单树形查询的菜单ID进行匹配，逐后加值
                				var strs = buttonRightCodes.split(",");
                				//如果传过来的data按钮数据不为空，则进入判断，且循环遍历按钮数据
                				if (data != "" && data != null) {
    								for (i in data) {
    									var f = false;
    									if(strs != null && strs != "") {
    										for(j in strs){
    											if(strs[j] == data[i].btn_id){
    												if (i == 0) {
    													sx += "&nbsp;&nbsp;<input type='checkbox' name='buttonAuth' lay-filter='btnAuthFlagChange' title='"+data[i].btn_name+"' value='"+data[i].btn_right_code+","+data[i].btn_id+"' checked>";
    												}
    												else{
    													sx += "&nbsp;&nbsp;&nbsp;&nbsp;<input type='checkbox' lay-filter='btnAuthFlagChange' name='buttonAuth' title='"+data[i].btn_name+"' value='"+data[i].btn_right_code+","+data[i].btn_id+"' checked>";
    												}
    												f = true;
    											}
    										}
    									}
    									if (!f) {
    										if (i == 0) {
    											sx += "&nbsp;&nbsp;<input type='checkbox' name='buttonAuth' lay-filter='btnAuthFlagChange' title='"+data[i].btn_name+"' value='"+data[i].btn_right_code+","+data[i].btn_id+"'>";
    										}
    										else{
    											sx += "&nbsp;&nbsp;&nbsp;&nbsp;<input type='checkbox' name='buttonAuth' lay-filter='btnAuthFlagChange' title='"+data[i].btn_name+"' value='"+data[i].btn_right_code+","+data[i].btn_id+"'>";
    										}
    									}
    								}
    							}
                			}
                		});
                		if (sx == "") {
                			return "";
                		}else{
                			return sx;
                		}
                	}
                }
            ]]
		});
	}
	//监听锁定操作
	table.on('tool(sysUserTable)', function(obj){
		
		if(obj.event == 'userAuth'){
			//关于角色是否可用设置过滤方法
			if(obj.data.usr_flag != '1') {
				layer.msg('很抱歉,该角色已经被停用,不可对其进行操作');
				return false;
			}
			if(obj.data.usr_id == ifbf_usr_id) {
				layer.msg("不可对自己进行按钮授权");
				return false;
			}
			$('#eusr_id').val(obj.data.usr_id);
			var usr_id = obj.data.usr_id;
			var usr_role_id = obj.data.usr_role_id;
			var buttonRightCodes = getCurUserBtn(usr_id);
			viewTreeTalbe(usr_role_id,buttonRightCodes);
			layer.open({
				  type: 1,
//				  skin: 'layui-layer-rim', //加上边框
				  title : '按钮授权',
				  area: ['1150px', '700px'], //宽高
				  content: $('#changeUserForm'),
				  btn: '关闭'
					    ,btnAlign: 'c' //按钮居中
					    ,shade: 0 //不显示遮罩
					    ,yes: function(index){
					    	layer.close(index);
					    }
				});
		}
		
		return false;
	});
	
	//根据用户id查询用户在按钮中间表的按钮权限
	function getCurUserBtn(bf_usr_id){
		var buttonAuths = "";
		$.ajax({
			url: '/maven_ssh/privilege/sysButtonAction_listSysButton.action',
			data : {
				'sysUserButton.bf_usr_id' : bf_usr_id
			},
			async : false,
			dataType: 'json',
			success: function(data){
				var dyther = data.data;
				if(dyther != null){
					for(i in dyther){
						buttonAuths += dyther[i].btn_id + ",";
					}
					buttonAuths = buttonAuths.substring(0,buttonAuths.length-1);
				}
	        }
	    });
		return buttonAuths;
	}
	
	//模糊查form表单提交
	form.on('submit(selectUser)', function(data){
		table.reload('userReload', {
	        page: {
	        	curr: 1 //重新从第 1 页开始
	        }
			,url : '/ssm/rms/rmu/listSysUser'
	        ,where: {//模糊查重载表单条件
	        	"user_name" : data.field.queryUser_name,
	        	"user_role_id" : data.field.queryUser_role_id
	        }
	    });
	  });
	
	//修改打开页面绑值
	function openVal(data){//遍历json数组对象，通过下标对应的键取值
		for(var i=0;i<data.length;i++) {
			$('#eusr_id').val(data[i].usr_id);
			$('#eusr_name').val(data[i].usr_name);
			$('#eusr_password').val(data[i].usr_password);
			$('#eusr_role_id2').val(data[i].usr_role_id);
			$('#eusr_role_name').val(data[i].usr_role_name);
		}
		form.render();
	}
	//添加，更新 用户提交
	function subSysUser(url,data) {
			$.post(url, {
				"sysUser.usr_id" : data.field.usr_id,
				"sysUser.usr_name" : data.field.usr_name,
				"sysUser.usr_password" : data.field.usr_password,
				"sysUser.usr_role_id" : data.field.usr_role_id2
			},function(ryther){
				console.log(ryther);
				if(ryther){
					layer.msg("保存成功！",{time : 1000}, function(){
						layer.closeAll();
						userTableReload();
					});
				}else{
					layer.msg("保存失败", function(){
						layer.closeAll();
						userTableReload();
					});
				}
		   });
		form.render();
	}
	// form表单监听 头部工具栏  事务提交
	form.on('submit(subUser)', function(data){
		var url;
		if(data.field.usr_id == null || data.field.usr_id == ""){
			url = '/maven_ssh/privilege/sysUserAction_addSysUser.action';
		}else {
			url = '/maven_ssh/privilege/sysUserAction_updateSysUser.action';
		}
		subSysUser(url,data);
	});
	//删除用户
	function deleteSysUser(data){
		for(i in data){
			del_usr_id = data[i].usr_id;
			$('#delusr_id').val(data[i].usr_id);
		}
		$.ajax({
			url : '/maven_ssh/privilege/sysUserAction_deleteSysUser.action',
			type : 'post',
			dataType : 'json',
			data : {
				"sysUser.usr_id" : $('#delusr_id').val()
			},
			success : function(ryther){
				console.log("保存结果" + ryther);
				if(ryther){
					layer.msg("删除成功",{time : 1000}, function(){
						userTableReload();
					});
				}else{
					layer.msg("删除失败", function(){
						userTableReload();
					});
				}
			}
		});
	}
	
	//头工具栏事件   添加，更新
	table.on('toolbar(sysUserTable)', function(obj){
		var checkStatus = table.checkStatus(obj.config.id);//数据表格指令，获取表格某行的选中状态
		var data = checkStatus.data;
		//jquery表单重置   之后渲染
		$('#formUserHadle')[0].reset();
		form.render();
		
		if(obj.event == 'userAdd'){
			//添加用户弹出层
			layer.open({
				type: 1
			    ,title: '添加用户'
			    ,area: ['750px', '350px']//第一个参数为宽，第二个参数为高
			    ,id: 'sysUserAddOpen' //防止重复弹出
			    ,content: $('#userForm')
			    ,btn: '关闭'
			    ,btnAlign: 'c' //按钮居中
			    ,shade: 0 //不显示遮罩
			    ,yes: function(index){
			    	layer.close (index);
			    }
			});
		}else if(obj.event == 'userUpdate'){
			if(checkStatus.data == null || checkStatus.data == ""){
				layer.msg('请先选中需要更新的角色信息');
				return false;
			}
			if(data.length >= 2){
        		layer.msg('请勿同时操作多个角色');
        		return false;
        	}
			//关于角色是否可用设置过滤方法
			var usr_flag;
			for(i in data){
				usr_flag = data[i].usr_flag;
			}
			if(usr_flag != '1') {
				layer.msg('很抱歉,该角色已经被停用,不可对其进行操作');
				return false;
			}
			//更新用户弹出层
			layer.open({
				type: 1
			    ,title: '更新用户'
			    ,area: ['750px', '350px']//第一个参数为宽，第二个参数为高
			    ,id: 'sysUserUpdateOpen' //防止重复弹出
			    ,content: $('#userForm')
			    ,btn: '关闭'
			    ,btnAlign: 'c' //按钮居中
			    ,shade: 0 //不显示遮罩
			    ,yes: function(index){
			    	layer.close(index);
			    }
				,success : function(layero,index){
					openVal(data);
				}
			});
		}else if(obj.event == 'userDelete') {
			if(checkStatus.data == null || checkStatus.data == ""){
				layer.msg('请先选中需要删除的角色信息');
				return false;
			}
			//关于角色是否可用设置过滤方法
			var usr_flag;
			for(i in data){
				usr_flag = data[i].usr_flag;
			}
			if(usr_flag != '1') {
				layer.msg('很抱歉,该角色已经被停用,不可对其进行操作');
				return false;
			}
			layer.confirm('真的删除行么', function(index) {
				deleteSysUser(data);
				layer.closeAll();
			});
		}
	});

	//清空角色按钮    点击清空用户的角色信息供用户信息的添加,更新
	$(document).on('click', '#emakeRoleEmptyBtn', function() {
		$("#eusr_role_name").val("");
		$("#eusr_role_id2").val("");
	});
	//选择角色按钮    点击弹出角色信息供用户信息的添加
	$(document).on('click', '#echangeRoleBtn', function() {
				layer.open({
				type : 1,
				title: '选择角色',
				maxmin : true,
				area : [ '45%', '50%' ],
				shade : 0, // 不显示遮罩
				id: 'changeRoleOpen', //防止重复弹出
				content : $('#changeRoleForm'),
				success : function() {
					table.render({
						elem : '#changeSysRoleTable',
						url : '/maven_ssh/privilege/sysRoleAction_listSysRole.action',
						type : 'post',
						title : '选择角色',
						cols : [[ 
							{field : 'role_id',title : '编号',width : '120'}, 
							{field : 'role_name',title : '角色名称',width : '120'}, 
							{field : 'role_desc',title : '角色描述',width : '170'},
							{field : 'role_flag',title : '角色是否可用',width : '100'}
						]],
						id : 'changeSysRoleTable'
					});//表格的渲染end
				}
			 });
	});
	//角色表格监听行    双击行赋值
	table.on('rowDouble(changeSysRoleTable)', function(obj){
		var data = obj.data;//获取到行数据信息
		if(obj.data.role_flag != '1' || obj.data.role_flag == 0) {
			layer.msg("抱歉,该角色已被停用不可进行授权",{time : 2000});
			return false;
		}
		//usr_role_id2 是用来装载添加的角色ID的，真正添加到数据库的是usr_role_id
		//layer.index关闭最新打开的弹出层页面
		if ($("#eusr_role_id2").val() == "" || $("#eusr_role_name").val() == ""){
			
			$("#eusr_role_name").val(obj.data.role_name);
			$("#eusr_role_id2").val(obj.data.role_id);
			layer.close(layer.index);
		}else if($("#eusr_role_id2").val() != "" || $("#eusr_role_name").val() != ""){
//			进来这边证明用户进行的是修改操作，
			//如果表单上的值与将进行赋值的值相同则取消辅助
			if($("#eusr_role_id2").val().indexOf(obj.data.role_id) != -1 || $("#eusr_role_name").val().indexOf(obj.data.role_name) != -1){
				layer.close(layer.index);
				return false;
			}
			
			var roleName = "," + obj.data.role_name;
			var roleID = "," + obj.data.role_id;
			$("#eusr_role_name").val($("#eusr_role_name").val() + roleName);
			$("#eusr_role_id2").val($("#eusr_role_id2").val() + roleID);
			layer.close(layer.index);
		}
	});
	//用户表格重载
	function userTableReload(){
		table.reload('userReload', {page: {curr: 1 //重新从第 1 页开始
	        },url : '/maven_ssh/privilege/sysUserAction_listSysUser.action',where: {//模糊查重载表单条件
	        	"sysUser.usr_name" : "",
	        	"sysUser.usr_role_id" : ""}});
	}
	
})
}