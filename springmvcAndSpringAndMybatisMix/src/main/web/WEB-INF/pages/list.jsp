<%--
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  Created by IntelliJ IDEA.
  User: lwz
  Date: 2019/8/6
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>展示所有联系人</title>
</head>
<body>
<table border="1" cellspacing="0" width="800">
    <tr>
        <th>id</th>
        <th>username</th>
        <th>birthday</th>
        <th>sex</th>
        <th>address</th>
    </tr>
    <%--遍历出每一个联系人--%>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.birthday}</td>
            <td>${user.sex}</td>
            <td>${user.address}</td>
        </tr>
    </c:forEach>
</table>
<h3>添加用户</h3>
<form action="/user/add" method="post"><br/>
    姓名:<input type="text" name="username"><br/>
    出生日期:<input type="text" name="birthday"><br/>
    性别:<input type="text" name="sex"><br/>
    地址:<input type="text" name="address"><br/>
    <input type="submit" value="提交"><br/>
</form>
<h3>根据id删除用户</h3>
<form action="/user/delete" method="post">
    请输入要删除的用户id:<input type="text" name="id">
    <input type="submit" value="提交">
</form>
<h3>修改用户</h3>
<form action="/user/update" method="post"><br/>
    ID:<input type="text" name="id"><br/>
    姓名:<input type="text" name="username"><br/>
    出生日期:<input type="text" name="birthday"><br/>
    性别:<input type="text" name="sex"><br/>
    地址:<input type="text" name="address"><br/>
    <input type="submit" value="提交"><br/>
</form>
</body>
</html>
