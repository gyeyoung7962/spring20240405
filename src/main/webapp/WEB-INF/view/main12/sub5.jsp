<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach varStatus="status" items="${myList}" var="item">
    <div style="border: 1px solid black; margin:5px">
        <p>${status.begin}</p>
        <p>${status.end}</p>
        <p>${status.index}</p>
        <p>${status.count}</p>
        <p>${status.first}</p>
        <p>${status.last}</p>
        <p>${status.current}</p>
    </div>
</c:forEach>

<hr/>

<p>
    <c:forEach items="${myList}" varStatus="status" var="item">
        ${item}<c:if test="${! status.last}">,</c:if>


    </c:forEach>
</p>


<p>
    <c:forEach items="${myList}" varStatus="status" var="item">

        <c:if test="${status.index == 0}">기술들:</c:if>
        ${item}
        <c:if test="${! status.last}">,</c:if>

    </c:forEach>
</p>

</body>
</html>
