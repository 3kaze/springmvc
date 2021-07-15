<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2021/7/12
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>学生登录</h1>
    <form:form modelAttribute="student2" action="login" method="post">
        学生姓名：<form:input path="name" /><form:errors path="name" /><br/>
        学生密码：<form:input path="password" /><form:errors path="password" /><br/>
        <input type="submit" value="提交" />
    </form:form>

</body>
</html>
