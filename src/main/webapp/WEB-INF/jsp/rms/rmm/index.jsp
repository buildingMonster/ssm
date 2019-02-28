<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>哇娃哇</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/basic/layui/css/layui.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/basic/layui/layui.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/basic/jquery.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/static/rms/js/rmm/indexTree.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">CRM 后台管理</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item"><a href="javascript:;"> ${user.usr_name}
            </a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="javascript:;" onclick="sss()">安全设置</a>
                    </dd>
                </dl></li>
            <li class="layui-nav-item"><a href="login.jsp">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-blue">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul id="indexTree"></ul>
        </div>
    </div>

    <!--   <div class="layui-body"> -->
    <div class="layui-body" id="container">
        <div class="layui-tab" lay-filter="tabs" id="tabs"
             lay-allowClose="true">
            <ul class="layui-tab-title">
                <li class="layui-this">首页</li>
            </ul>
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show"
                     style="background-image: url('sysImg/5.jpg');">
                    <iframe width="900" scrolling="no" height="100" frameborder="0"
                            allowtransparency="true"
                            src="//i.tianqi.com/index.php?c=code&id=2&color=%23&icon=2&py=yueluqu&num=3&site=19"></iframe>
                    <span id="myclock"
                          style="font-size: 46px; color: #9FB6CD; text-align: center">
					    </span>
                </div>
                <!--  -->
            </div>
        </div>
    </div>


</div>
<div id="userPwdForm" style="display: none;">
    <form style="margin-left: 28px;" class="layui-form" action="" onsubmit="return false;">
        <div class="layui-form-item" style="margin-top: 20px;">
            <label class="layui-form-label layui-bg-gray">登录名</label>
            <div style="margin-left: 8px;" class="layui-input-inline">
                <input type="text" id="eusr_name" name="usr_name" required  lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="margin-top: 20px;">
            <label class="layui-form-label layui-bg-gray">密码</label>
            <div style="margin-left: 8px;" class="layui-input-inline">
                <input type="password" id="eusr_password" name="usr_password" required  lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="margin-top: 20px;">
            <div class="layui-input-block">
                <button class="layui-btn" id="btn1" lay-submit lay-filter="userPwd">保存</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>

    </form>
</div>

</body>
<style type="text/css">
    .layui-tree li i {
        color: rgba(119, 136, 153, .7);
        display: none;
    }

    .layui-tree li a cite {
        color: #fffffb;
    }

    .layui-tree li .layui-tree-spread {
        display: block;
        position: absolute;
        right: 30px;
    }

    .layui-tree li {
        line-height: 45px;
        position: relative;
    }

    .layui-tree li ul {
        margin-left: 0;
        background: rgba(108,166,205, .7);
    }

    .layui-tree li ul a {
        padding-left: 20px;
    }

    .layui-tree li a {
        height: 45px;
        border-left: 5px solid transparent;
        box-sizing: border-box;
        width: 100%;
    }

    .layui-tree li a:hover {
        background: #9FB6CD;
        color: #fff;
        border-left: 5px solid #fffffb;
    }

    .layui-tree li a.active {
        background: #4A708B;
    }
</style>
</html>