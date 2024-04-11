<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach begin="1" end="3" var="num">
    <p>반복 출력 코드 ${num}</p>
</c:forEach>

<hr/>

<c:forEach items="${myList}" var="elem">
    <p>${elem}</p>
</c:forEach>

<c:forEach items="${foods}" var="food" begin="1" end="2">
    <p>${food}</p>
</c:forEach>

<c:forEach items="${myMap}" var="map">
    <p>${map.key}</p>
    <p>${map.value}</p>
</c:forEach>

<c:forEach items="${cars}" var="car">
    <p>${car}</p>
</c:forEach>

<c:forEach items="${myList2}" var="elem">
    <p>${elem}</p>
</c:forEach>

<c:forEach items="${myMap2}" var="entry">
    <p>${entry.key} : ${entry.value}</p>
</c:forEach>

</body>
</html>
