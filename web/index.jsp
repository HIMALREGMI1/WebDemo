<%--
  Created by IntelliJ IDEA.
  User: himal
  Date: 8/1/2019
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>WEB_Demo</title>
</head>
<body>
<table>
    <form action="${pageContext.request.contextPath}/login" method="post">
<%--        Enter Username<input type="text" name="user">--%>
<%--        Password <input type="password" name="pass">--%>
<%--        <input type="submit" value="login">--%>
    <tr>
        <td>Enter Username </td>
        <td><label>
            <input type="text" name="user">
        </label></td>
    </tr>
    <tr>
        <td>Password</td>
        <td><label>
            <input type="password" name="pass">
        </label></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="login"></td>
    </tr>
    </form>
</table>
<p style="color: darkred">${errormsg}</p>

</body>
</html>
