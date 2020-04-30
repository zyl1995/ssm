<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vidsai009
  Date: 20-4-27
  Time: 下午3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书列表</title>
</head>
<body>
    <a href="logout">登出</a>
    <h1>图书列表</h1>
    <table>
        <thead>
            <tr>
                <th>图书ID</th>
                <th>图书名称</th>
                <th>馆藏数量</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${bookList}" var="book">
                <tr>
                    <td><c:out value="${book.bookId}"/></td>
                    <td><c:out value="${book.name}"/></td>
                    <td><c:out value="${book.number}"/></td>
                    <td><a href="">预订</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
