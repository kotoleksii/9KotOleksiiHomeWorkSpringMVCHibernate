<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="">
    <tr>
        <th>Name</th>
        <th>Phone</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <c:forEach var="number" items="${numbers}">
            <tr>
                <td>${user.name}</td>
                <td>${number.phone}</td>
            </tr>
        </c:forEach>
    </c:forEach>


</table>
</body>
</html>
