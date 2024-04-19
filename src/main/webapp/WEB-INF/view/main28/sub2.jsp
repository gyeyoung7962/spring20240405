<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<div style="position: absolute; top:50%; left: 50%; transform: translate(-50%,-50%);">
    <form action="" method="post">
        <div class="row" style="padding: 20px;">
            <div class="col-md-4">LastName</div>
            <div class="col-md-6">
                <input type="text" name="lastName">
            </div>
        </div>

        <div class="row" style="padding: 20px;">
            <div class="col-md-4">FirstName</div>
            <div class="col-md-6">
                <input type="text" name="firstName">
            </div>
        </div>

        <div class="row" style="padding: 20px;">
            <div class="col-md-4">BirthDate</div>
            <div class="col-md-6">
                <input type="date" name="birthDate">
            </div>
        </div>

        <div class="row" style="padding: 20px;">
            <div class="col-md-4">Photo</div>
            <div class="col-md-6">
                <input type="file" name="photo">
            </div>
        </div>

        <div class="row" style="padding: 20px;">
            <div class="col-md-4">Notes</div>
            <div class="col-md-6">
                <input type="text" name="notes">
            </div>
        </div>

        <div style="text-align: end;">
            <input type="submit" class="btn btn-primary" value="확인">
        </div>
    </form>
    <div style="background-color: skyblue;">${message}</div>
</div>


</body>
</html>
