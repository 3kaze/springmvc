<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2021/6/19
  Time: 2:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="<%=request.getContextPath()%>/converter/date" method="post">
      <label>
          <input type="text" name="date" />
      </label>(2021-01-01)
    <input type="submit" value="提交" />
  </form>
</body>
</html>
