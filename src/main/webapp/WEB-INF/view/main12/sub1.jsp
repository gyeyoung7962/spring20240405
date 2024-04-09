<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>if</h3>

<c:if test="${age >= 20}">
    <p>투표 가능</p>
</c:if>

<c:if test="${age < 20}">
    <p>투표 불가능</p>
</c:if>

<c:if test="${empty products}">
    <p>상품이 없습니다</p>
</c:if>

<c:if test="${!empty products}">
    <ul>
        <li>${products[0]}</li>
        <li>${products[1]}</li>
    </ul>
</c:if>

<c:if test="${5 <8 && 9 >2}" var="result">
    <p>출력1${result}</p>
</c:if>

<c:if test="${not result}">
    <p>출력2</p>
</c:if>

<c:if test="${member['country'] eq 'korea'  && member['age'] >= 20}" var="result1">
    <p>투표가능</p>
</c:if>

<c:if test="${! result1}">
    <p>투표불가능</p>
</c:if>

</body>
</html>
