<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--el의 내장 객체 param: request parameter 를 key,value 쌍으로 저장한map --%>
<div>name :${param.name}</div>
<div>age :${param.id}</div>
<div>city :${param.city}</div>
<div>address :${param.address}</div>
<div>mode :${param.model}</div>

<hr/>

<div>title :${param.title}</div>
<div>content :${param.content}</div>
<div>car :${param.car}</div>

<hr/>

<div>q :${param.q}</div>
<div>song :${param.song}</div>
<div>company :${param.company}</div>


</body>
</html>
