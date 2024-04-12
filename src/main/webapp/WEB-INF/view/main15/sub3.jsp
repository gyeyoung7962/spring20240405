<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="current1" value="sub3 value1" scope="page"/>
<c:set var="current2" value="sub3" scope="request"/>
<c:import url="navbar2.jsp"/>

<div>
    ${current1}
    ${current2}
    sub3의 내용
</div>
</body>
</html>
