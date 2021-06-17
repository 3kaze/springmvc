<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2021/6/18
  Time: 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/hello/listType" method="post">
    用户1ID：<input type="text" name="users[0].id"/><br/>
    用户1姓名：<input type="text" name="users[0].name"/><br/>
    用户2ID：<input type="text" name="users[1].id"/><br/>
    用户2姓名：<input type="text" name="users[1].name"/><br/>
    用户3ID：<input type="text" name="users[2].id"/><br/>
    用户3姓名：<input type="text" name="users[2].name"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
