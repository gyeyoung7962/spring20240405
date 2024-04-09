<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>choose, when, otherwise</h3>

<c:choose>
    <c:when test="${true}">
        <p>첫번째 when</p>
    </c:when>

    <c:when test="${false}">
        <p>두번째 when</p>
    </c:when>

    <c:otherwise>
        <p>otherwise부분</p>
    </c:otherwise>

</c:choose>

<c:choose>
    <c:when test="${age < 10}">
        <p>어린이용 콘텐츠</p>
    </c:when>

    <c:when test="${age <20}">
        <p>청소년용 콘텐츠</p>
    </c:when>

    <c:when test="${age < 40}">
        <p>성인용 콘텐츠</p>
    </c:when>

    <c:otherwise>
        <p>null</p>
    </c:otherwise>
</c:choose>
</body>
</html>
