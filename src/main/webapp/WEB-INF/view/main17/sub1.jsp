<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>name:${requestScope.name}</div>
<div>city:${sessionScope.city}</div>

<div>${model}</div>
<div>${requestScope.model}</div>
<div>${sessionScope.model}</div>

</body>
</html>
