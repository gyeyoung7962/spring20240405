<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<style>
    input {
        margin: 10px;
    }
</style>
<body>
<div class="row col-md-12">

    <div class="col-md-4">
        <div class="p-2 m-2">
            <form action="/main33/sub3/insert" method="post">
                <div class="row col-md-5">
                    <div class="col-md-5">
                        이름1
                    </div>
                    <div class="col-md-7">
                        <input type="text" class="form-control" name="lastName">
                    </div>
                </div>
                <div class="row col-md-5">
                    <div class="col-md-5">
                        이름2
                    </div>
                    <div class="col-md-7">
                        <input type="text" class="form-control" name="firstName">
                    </div>
                </div>
                <div class="row col-md-5">
                    <div class="col-md-5">
                        생일
                    </div>
                    <div class="col-md-7">
                        <input type="date" class="form-control" name="birthDate">
                    </div>
                </div>
                <div class="row col-md-5">
                    <div class="col-md-5">
                        사진
                    </div>
                    <div class="col-md-7">
                        <input type="file" class="form-control" name="photo">
                    </div>
                </div>
                <div class="row col-md-5">
                    <div class="col-md-5">
                        내용
                    </div>
                    <div class="col-md-7">
                <textarea class="form-control" name="notes"
                          style="width: 500px; height: 200px; resize: none;"></textarea>
                    </div>
                </div>
                <div>
                    <button class="btn btn-success">가입</button>
                    <button class="btn btn-success">수정</button>
                    <c:if test="${not empty msg}">
                        <p class="text-primary">${msg}</p>
                    </c:if>
                </div>
            </form>
        </div>
    </div>


    <div class="col-md-4">
        <form action="/main33/sub3/select" method="post">
            조회번호:
            <input type="text" name="employeeId">
            <button>조회</button>
        </form>
        <hr/>
        <div>
            id:${list.employeeId}
            <br/>
            lastName:${list.lastName}
            <br/>
            firstName:${list.firstName}
            <br/>
            birthDate:${list.birthDate}
            <br/>
            photo:${list.photo}
            <br/>
            notes:${list.notes}
            <br/>
        </div>
        <hr/>
    </div>

    <div class="col-md-4">
        <form id="form" action="/main33/sub3/update" method="post">
            <hr/>
            <div>
                id
                <input type="hidden" name="employeeId" id="employeeId" value="${list.employeeId}" readonly>
                <br/>
                lastName
                <input type="text" name="lastName" value="${list.lastName}">
                <br/>
                firstName:
                <input type="text" name="firstName" value="${list.firstName}">
                <br/>
                birthDate
                <input type="text" name="birthDate" value="${list.birthDate}">
                <br/>
                photo
                <input type="file" name="photo" value="${list.photo}">
                <br/>
                notes
                <textarea name="notes">${list.notes}</textarea>
                <br/>
            </div>
            <hr/>
            <button>수정</button>
        </form>
    </div>
</div>
</body>
</html>
