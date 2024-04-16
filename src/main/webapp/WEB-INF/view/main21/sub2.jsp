<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<form action="/main21/sub1">
    <input type="submit" class="btn btn-success" value="전송">
</form>
<form action="/main21/sub1">
    <input type="submit" class="btn btn-success" value="전송">
</form>

<hr/>

<form action="/main21/sub3" method="get">
    <input type="submit" class="btn btn-success" value="sub3 get">
</form>
<form action="">
    <input type="submit" class="btn btn-success" value="sub3 post">
</form>

<hr/>

<form action="/main21/sub4" method="get">
    <input type="submit" class="btn btn-success" value="get버튼">
</form>
<form action="/main21/sub4" method="post">
    <input type="submit" class="btn btn-success" value="post버튼">
</form>

<hr/>

<form action="/main21/sub5" method="get">
    <input type="submit" value="get버튼">
</form>
<form action="/main21/sub5" method="post">
    <input type="submit" value="post버튼">
</form>

</body>
</html>
