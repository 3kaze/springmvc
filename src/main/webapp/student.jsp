<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2021/6/22
  Time: 0:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/converter/student" method="post">
        <input type="text" name="student" />(1-张三-22）<br/>
        <input type="submit" value="提交" />
    </form>
</body>
</html>
