<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<c:if test="${param.type eq 'fail'}">
    <div style="padding: 20px; background-color: pink">
        아이디와 패스워드를 확인하세요
    </div>
</c:if>
<form action="/main22/sub4" method="post">
    <div>
        <input type="text" name="id">
    </div>
    <div>
        <input type="password" name="password">
    </div>
    <div>
        <input type="submit" value="">
    </div>
</form>
</body>
</html>
