<%--
  Created by IntelliJ IDEA.
  User: wei
  Date: 2021/6/22
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/course/update" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <table>
        <tr>
            <td>编号:</td>
            <td>
                <input type="text" name="id" readonly
                       value="${courser.id}"/>
            </td>
        </tr>
        <tr>
            <td>名称:</td>
            <td>
                <input type="text" name="name" value="${courser.name}"/>
            </td>
        </tr>
        <tr>
            <td>价格:</td>
            <td>
                <input type="text" name="price" value="${courser.price}"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="修改"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
