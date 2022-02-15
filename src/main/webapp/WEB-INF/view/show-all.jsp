<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All contacts</title>
</head>
<body>
<header>
    <jsp:include page="/WEB-INF/view/header.jsp"/>
</header>
<table>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.name}</td>
        </tr>
        <c:forEach var="number" items="${numbers}">
            <tr>
                <td></td>
                <td>${number.phone}</td>
            </tr>
        </c:forEach>
    </c:forEach>
</table>
</body>
</html>



