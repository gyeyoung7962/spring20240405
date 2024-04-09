<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach begin="1" end="3">
    <p>반복 출력 할 코드</p>
</c:forEach>

<hr/>

<c:forEach begin="5" end="7" var="num">
    <p>${num}</p>
</c:forEach>

<hr/>

<c:forEach begin="1" end="9" var="num">
    <p> 2 * ${num} = ${2 * num}</p>
</c:forEach>

<p>${dan}</p>
<c:forEach begin="1" end="9" var="num">
    <p> ${dan} * ${num} = ${dan * num}</p>
</c:forEach>

<p>${dan}거꾸로</p>
<c:forEach begin="1" end="9" var="num">
    <p> ${dan} * ${10-num} = ${dan * (10 -num)}</p>
</c:forEach>
</body>
</html>
