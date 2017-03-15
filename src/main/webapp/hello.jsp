<%@ page import="lv.ctco.javaschool.firstweb.User" %><%--
  Created by IntelliJ IDEA.
  User: dima
  Date: 10/3/17
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
//
<jsp:useBean id="user" scope="session" type="lv.ctco.javaschool.firstweb.User"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% User user = (User) session.getAttribute("r"); %>
<h1>Have a nice day!:) </h1>
<table>
    <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Age</th>
    </tr>
    <tr>
        <td><%=user.getUserName()%>
        </td>
        <td><%=user.getUserSurname()%>
        </td>
        <td><%=user.getUserDate()%>
        </td>
    </tr>
</table>

</body>
</html>
