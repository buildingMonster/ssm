<%--
  Created by IntelliJ IDEA.
  User: Administrator Lip·Gallager
  Date: 2019/2/15 
  Time: 10:36
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/zking" prefix="z" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    <script type="text/javascript">
        function add() {
            // window.location.href = "bookEdit.jsp";
            window.location.href = "${pageContext.request.contextPath}/skip/pageUrl?pageUrl=studentAdd";
        }

        function update(sid) {
            window.location.href = "${pageContext.request.contextPath}/student/findOne?sid=" + sid;
        }

        function del(sid) {
            window.location.href = "${pageContext.request.contextPath}/student/delete/" + sid;
        }
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/student/list"
      method="post">
    姓名：<input type="text" name="sname"> <input type="submit"
                                               value="确定">
</form>
<button onclick="add();">新增</button>
<table border="1" width="100%">
    <thead>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>图片</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody><c:forEach items="${studentList }" var="student">
        <tr>
            <td>${student.sid }</td>
            <td>${student.sname }</td>
            <td>${student.sex }</td>
            <td><img src="/uploadImages/${student.stu_image_id}" height="50px" width="50px"></td>
            <td>
                <button onclick="update(${student.sid  });">修改</button>&nbsp;&nbsp;&nbsp;
                <button onclick="del(${student.sid  });">删除</button>
            </td>
        </tr>
    </c:forEach></tbody>
</table>
<z:page pageBean="${pageBean}"></z:page>
</body>
</html>
