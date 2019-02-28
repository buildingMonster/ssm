$(function(){
layui.use(['layer','jquery'], function(){
//	var form = layui.form;
	var layer = layui.layer;
	var $ = layui.jquery;
	
	var url = location.search;//获取上一页面传过来的参数
	var id_index = url.indexOf("key")+4;
	var end_index = url.indexOf("&");
	var menuID_rightCode = url.substring(id_index, end_index);
	
	var usr_id_index = url.indexOf("ID")+3;
	var bf_usr_id = url.substring(usr_id_index);
	
	
	function getBf_btn_id(bf_usr_id){
		var bf_btn_id = "";
		$.ajax({
			url : '/maven_ssh/privilege/sysUserButtonAction_findBf_btn_id.action',
			type : 'post',
			dataType : 'json',
			data : {
				"sysUserButton.bf_usr_id" : bf_usr_id
			},
			async : false,
			success : function(data){
				for(i in data.data){
					bf_btn_id += data.data[i].bf_btn_id + ",";
				}
				bf_btn_id = bf_btn_id.substring(0, bf_btn_id.length-1);
			}
		});
		return bf_btn_id;
	}
	var bf_btn_id = getBf_btn_id(bf_usr_id);
	if(bf_btn_id != null && bf_btn_id != ""){
		//获取当前登录用户相关按钮权限
		$.ajax({
			url : '/maven_ssh/privilege/sysButtonAction_listSysButton2.action',
			type : 'post',
			dataType : 'json',
			data : {
				"sysRight.id" : menuID_rightCode,
				"bf_BtnID" : bf_btn_id
			},
			async : false,
			success : function(data){
				var data = data.data;//获取按钮数据
				console.log(data);
				var table_headBtn = "";//定义头部按钮接收
				var table_rowBtn = "";//定义行内按钮接收
				var table_templet = "";//表格templet按钮接收
				var otherBtn = "";//其它按钮接收
				if (data != "" && data != null) {
					for (i in data) {
						if(menuID_rightCode == data[i].btn_right_code){
							//按钮放置的地方  1头部，2行内，3templet，4其它
							if(data[i].btn_place == '1') {
								table_headBtn += "<button class='"+data[i].btn_code+"' lay-event='"+data[i].btn_class+"'>"+data[i].btn_name+"</button>";
							}
							if(data[i].btn_place == '2') {
								table_rowBtn += "<button class='"+data[i].btn_code+"' lay-event='"+data[i].btn_class+"'>"+data[i].btn_name+"</button>";
							}
							if(data[i].btn_place == '3') {
								table_templet += "<input type='checkbox' title='"+data[i].btn_name+"' value='"+data[i].btn_input_value+"' lay-filter='"+data[i].btn_input_filter+"' "+data[i].btn_input_checked+">";
							}
							if(data[i].btn_place == '4') {
								otherBtn += "<button class='"+data[i].btn_code+"' lay-event='"+data[i].btn_class+"' lay-filter='"+data[i].btn_input_value+"' >"+data[i].btn_name+"</button>";
							}
						}
						if(table_headBtn != ""){
							$('.table_headBtn').html(table_headBtn);
						}
						if(table_rowBtn != ""){
							$('.table_rowBtn').html(table_rowBtn);
						}
						if(table_templet != ""){
							$('.table_templet').html(table_templet);
						}
						if(otherBtn != ""){
							$('.out_otherBtn').html(otherBtn);
						}
					}
				}
			}
		});
	}
	
});
})