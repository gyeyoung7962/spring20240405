<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:import url="/WEB-INF/fragment/navbar2.jsp"/>
<div>
    sub2
</div>

<c:import url="/WEB-INF/fragment/footer2.jsp"/>

<br/>

<c:import url="../../../fragment/navbar2.jsp"/>
<div>
    sub2
</div>

<c:import url="../../../fragment/footer2.jsp"/>


</body>
</html>
