<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div>
    <input type="text" value="jordan" class="form-control">
</div>

<div>
    <input type="text" value="messi" class="form-control" readonly>
</div>

<div>
    <input type="text" size="5" class="form-control">
</div>

<div>
    <input type="text" maxlength="5" class="form-control">
</div>

<div>
    <input type="number" min="10" max="20" class="form-control">
</div>

<div>
    <input type="file" multiple>
</div>

<div>
    <input type="text" placeholder="입력값 힌트 주기">
</div>
</body>
</html>
