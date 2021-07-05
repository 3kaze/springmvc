<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2021/6/29
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/file/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="img" />
    <input type="submit" value="提交" />
</form>
<img src="${src}" />
</body>
</html>
