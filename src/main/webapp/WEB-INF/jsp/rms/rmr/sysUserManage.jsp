<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/basic/layui/css/layui.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用戶管理</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/basic/layui/layui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/basic/jquery/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/basic/layui/extends/layui-xtree.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/rms/js/rmb/pubBtn.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/rms/js/rmr/sysUserManage.js"></script>
</head>
<style>
        /** 箭头未展开 */
        #userTreeTable + .treeTable .treeTable-icon .layui-icon-triangle-d:before {
            content: "\e602";
        }

        /** 箭头展开 */
        #userTreeTable + .treeTable .treeTable-icon.open .layui-icon-triangle-d:before {
            content: "\e61a";
        }

        /** 文件图标 */
        #userTreeTable + .treeTable .treeTable-icon .layui-icon-file:before {
            content: "\e60d";
        }

        /** 文件夹未展开 */
        #userTreeTable + .treeTable .treeTable-icon .layui-icon-layer:before {
            content: "\e637";
        }

        /** 文件夹展开 */
        #userTreeTable + .treeTable .treeTable-icon.open .layui-icon-layer:before {
            content: "\e634";
        }
    </style>
<body>

	<div class="likeQueryTable">
		<form action="" class="layui-form" onsubmit="return false;">
			用户名:
			<div class="layui-inline">
				<input class="layui-input" id="eQueryUser_name" name="queryUser_name" style="width: 190px" autocomplete="off">
			</div>&nbsp;&nbsp;&nbsp;
			用户角色:
			<div class="layui-input-inline">
					<select id="eQueryUser_role_id" name="queryUser_role_id" lay-verify="" lay-search="">
						<option value="">请选择</option>
					</select>
			</div>&nbsp;&nbsp;&nbsp;
			<div class="layui-input-inline">
				<button lay-submit class="layui-btn" data-type="reload" lay-filter="selectUser">搜索</button>
			</div>
		</form>
	</div>

	<table class="layui-table" id="sysUserTable" lay-filter="sysUserTable"></table>
	
	<!-- 角色表单form -->
	<div id="userForm" style="display: none;" >
			<form style="margin-left: 47px;" class="layui-form" id="formUserHadle" onsubmit="return false;">
				<!-- 表单第一行  用户名usr_name 和 用户密码usr_password -->
				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label layui-bg-gray">用户名</label>
						<div style="margin-left: 8px;" class="layui-input-inline">
							<input type="hidden" id="eusr_id" name="usr_id" lay-verify="" autocomplete="off" class="layui-input">
			        		<input type="text" id="eusr_name" name="usr_name" lay-verify="required" autocomplete="off" class="layui-input">
			      		</div>
		      		</div>
		      		<div class="layui-inline">
			      		<label class="layui-form-label layui-bg-gray">用户密码</label>
						<div style="margin-left: 8px;" class="layui-input-inline">
			        		<input type="text" id="eusr_password" name="usr_password" lay-verify="required" autocomplete="off" class="layui-input">
			      		</div>
		      		</div>
	      		</div>
	      		<!-- 表单第二行      角色名称usr_role_name 和  选择角色按钮changeRoleBtn -->
	      		<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label layui-bg-gray">角色名称</label>
						<div style="margin-left: 8px;" class="layui-input-inline">
							<input type="hidden" id="eusr_role_id2" name="usr_role_id2" class="layui-input">
			        		<input type="text" id="eusr_role_name" name="usr_role_name" readonly lay-verify="" autocomplete="off" class="layui-input">
			      		</div>
		      		</div>
		      		<div class="layui-inline">
			      		<label class="layui-form-label layui-bg-gray">选择角色</label>
						<div style="margin-left: 8px;" class="layui-input-inline">
								<button id="echangeRoleBtn" name="changeRoleBtn" class="layui-btn">选择角色</button>
			      		</div>
		      		</div>
	      		</div>
	      		<!-- 表单第三行    机会描述chc_desc -->
	      		<div class="layui-form-item layui-form-text">
					    <label class="layui-form-label layui-bg-gray">清空角色</label>
					    <div style="margin-left: 8px;" class="layui-input-inline">
					    	<button id="emakeRoleEmptyBtn" name="makeRoleEmptyBtn" class="layui-btn">清空角色</button>
	    				</div>
  				</div>
	      		<!-- 按钮实现  返回，保存 -->
	      		<div class="layui-form-item">
			    	<div style="margin-left: 180px;" class="layui-input-inline">
			      		<button id="saveBtn" class="layui-btn layui-btn-normal layui-btn-radius" lay-submit="" lay-filter="subUser">保存</button>
			      		<button id="resetBtn" type="reset" class="layui-btn layui-btn-danger layui-btn-radius">重置</button>
			    	</div>
			  	</div>
	      		<input type="hidden" id="delusr_id">
			</form>
	</div>
	<!-- 选择角色，角色静态表格 -->
	<div id="changeRoleForm" style="display: none;">
		<table class="layui-table" id="changeSysRoleTable" lay-filter="changeSysRoleTable"></table>
	</div>
	<!-- 用户授权，按钮权限   按钮信息，菜单树-->
	<div id="changeUserForm" style="display: none;">
		<div class="layui-card">
			<div class="layui-card-body">
				<!-- 树形表格  -->
				<table id="userTreeTable" class="layui-table layui-hidden" lay-filter="userTreeTable"></table>
			</div>
		</div>
	</div>
<!-- 用户管理头部工具栏按钮 -->
<script type="text/html" id="userToolBar" class="table_headBtn">
</script>
<!-- 表格栏Templete  是否启用 -->
<script type="text/html" id="checkboxStartFlag" class="table_templet">
	<input type='checkbox' title='"+data[i].btn_name+"' value='"+data[i].btn_input_value+"' lay-filter='"+data[i].btn_input_filter+"' "+data[i].btn_input_checked+">
</script>
<!-- 用户管理行内工具栏按钮 -->
<script type="text/html" id="userRowToolBar" class="table_rowBtn">
</script>
</body>
</html>