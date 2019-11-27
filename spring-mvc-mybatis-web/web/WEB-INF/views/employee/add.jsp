<%--
  Created by IntelliJ IDEA.
  User: 程正海
  Date: 2019/11/21
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/add" method="post">
    salary:<input type="text" name="salary"/><span>${salary}</span><br>
    hiredate:<input type="date" name="hiredate"/><span>${hiredate}</span><br>
    gender:<input type="text" name="gender"/><span>${gender}</span><br>
    username:<input type="text" name="username"/><span>${username}</span><br>
    deptid:<input type="text" name="deptid"/><span>${deptid}</span><br>
    <input type="submit" value="添加员工"/>
</form>

</body>
</html>
