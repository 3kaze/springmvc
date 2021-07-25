<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2021/7/25
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="index?lang=en_US">English</a>
    <a href="index?lang=zh_CN">中文</a>
    <h1><spring:message code="info"></spring:message></h1>
    <form>
        <spring:message code="username" />:<input type="text" /><br/>
        <spring:message code="password" />:<input type="password" /><br/>
        <spring:message code="repassword" />:<input type="password" /><br/>
        <spring:message code="tel" />:<input type="text" /><br/>
        <spring:message code="email" />:<input type="text" /><br/>
        <input type="submit" value="<spring:message code="submit" /> " />
        <input type="reset" value="<spring:message code="reset" /> " />
    </form>
</body>
</html>
