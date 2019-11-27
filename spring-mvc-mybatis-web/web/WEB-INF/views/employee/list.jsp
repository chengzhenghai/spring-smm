<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 程正海
  Date: 2019/11/21
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>id</th>
        <th>salary</th>
        <th>hiredate</th>
        <th>gender</th>
        <th>username</th>
        <th>deptid</th>
    </tr>
    <c:forEach items="${list.list}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.salary}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.gender}</td>
            <td>${emp.username}</td>
            <td>${emp.deptid}</td>
        </tr>
    </c:forEach>
</table>

<a href="/list?pageNum=1">首页</a>
<a href="/list?pageNum=${list.prePage}">上一页</a>
<c:forEach items="${list.navigatepageNums}" var="page">
    <a href="/list?pageNum=${page}">${page}</a>
</c:forEach>
<a href="/list?pageNum=${list.nextPage}">下一页</a>
<a href="/list?pageNum=${list.pages}">尾页</a>


<a href="/add">添加员工</a>

</body>
</html>
