<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2021/7/12
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>用户注册</h1>
<%--    <form action="register" method="post">--%>
<%--        用户名：<input type="text" name="username" value="${account.username}"><br/>--%>
<%--        密码：<input type="text" name="password" value="${account.password}"><br/>--%>
<%--        邮箱：<input type="text" name="email" value="${account.email}"><br/>--%>
<%--        电话：<input type="text" name="phone" value="${account.phone}"><br/>--%>
<%--        <input type="submit" value="提交" />--%>
<%--    </form>--%>
    <form:form modelAttribute="account" action="register" method="post">
        用户名：<form:input path="username" /><form:errors path="username" /><br/>
        密码：<form:input path="password" /><form:errors path="password" /><br/>
        邮箱：<form:input path="email" /><form:errors path="email" /><br/>
        电话：<form:input path="phone" /><form:errors path="phone" /><br/>
        <input type="submit" value="提交" />
    </form:form>

</body>
</html>
