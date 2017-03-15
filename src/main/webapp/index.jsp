<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello, web!</title>
</head>
<body>
<form method="post" action="/hello">
    <label for="user-name">Please enter your name: </label>
    <input id="user-name" type="text" name="userName">
    <label for="user-surname">surname: </label>
    <input id="user-surname" type="text" name="userSurname">
    <label for="user-date">your age: </label>
    <input id="user-date" type="date" name="userDate">
    <input type="submit" value="SEND!">
</form>
</body>
</html>
