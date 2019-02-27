<%--
  Created by IntelliJ IDEA.
  User: Administrator Lip·Gallager
  Date: 2019/2/15 
  Time: 10:57
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript">
        function doSubmit(bid) {
            var studentForm = document.getElementById("studentForm");
            if (bid) {
                //修改时候执行
                studentForm.action = '${pageContext.request.contextPath}/student/update';
            } else {
                //新增时候执行
                studentForm.action = '${pageContext.request.contextPath}/student/add';
            }
            studentForm.submit();
        }
    </script>
</head>
<body>
<form id="studentForm" action="" method="post" enctype="multipart/form-data">
    sid:<input type="text" name="sid" value="${student.sid }"><br>
    sname:<input type="text" name="sname" value="${student.sname }"><br>
    sex:<input type="text" name="sex" value="${student.sex }"><br>
    image:<input type="file" name="file"> <img src="/uploadImages/${student.stu_image_id}" alt="赶紧上传图片吧！" height="50px"
                                               width="50px"><br/>
    <input type="submit" value="提交" onclick="doSubmit('${student.sid }');"><br>
</form>
</body>
</html>
