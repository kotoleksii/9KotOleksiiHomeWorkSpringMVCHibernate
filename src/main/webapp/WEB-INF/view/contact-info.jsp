<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="saveContact" modelAttribute="user">
    <form:hidden path="id"/>
    Name<form:input path="name"/>
    <br>
    Number<form:input path="numbers"/>
    <br>
    <input type="submit" value="ok">
</form:form>
</body>
</html>
