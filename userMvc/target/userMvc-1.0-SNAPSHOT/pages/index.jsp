<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../css/main.css">
</head>
<body>
    <form action="/save" method="post">
        <input type="text" name="name" placeholder="name">
        <input type="number" name="age" placeholder="age">
        <input type="submit" value="save">
    </form>


all list:
<br>
    <c:forEach items="${list}" var="item">
        <tr>
            <td><c:out value="${item.name}" /></td>
            <td><c:out value="${item.age}" /></td>
            <br>
        </tr>
    </c:forEach>
</body>
</html>
