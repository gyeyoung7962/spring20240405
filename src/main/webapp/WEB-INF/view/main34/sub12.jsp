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
<div class="row col-md-12" style="position: absolute; top:50%; left:50%; transform: translate(-50%, -50%);">

    <div class="col-md-6" style="text-align: center;">
        <form action="/main34/sub12/insert" method="post">

            <div class="d-flex col-md-8" style="align-items: center; text-align: center; margin: 0 auto;">
                <div class="col-md-2" style="align-items: center; text-align:right;">
                    title
                </div>
                <div class="col-md-6">
                    <input type="text" class="form-control" name="title">
                </div>
            </div>

            <div class="d-flex col-md-8" style="align-items: center; text-align: center; margin: 0 auto;">
                <div class="col-md-2" style="align-items: center; text-align:right;">
                    name
                </div>
                <div class="col-md-6">
                    <input type="text" class="form-control" name="name">
                </div>
            </div>

            <div class="d-flex col-md-8" style="align-items: center; text-align: center; margin: 0 auto;">
                <div class="col-md-2" style="align-items: center; text-align:right;">
                    age
                </div>
                <div class="col-md-6">
                    <input type="text" class="form-control" name="age">
                </div>
            </div>

            <div class="d-flex col-md-8" style="align-items: center; text-align: center; margin: 0 auto;">
                <div class="col-md-2" style="align-items: center; text-align:right;">
                    price
                </div>
                <div class="col-md-6">
                    <input type="text" class="form-control" name="price">
                </div>
            </div>

            <div class="d-flex col-md-8" style="align-items: center; text-align: center; margin: 0 auto;">
                <div class="col-md-2" style="align-items: center; text-align:right;">
                    inserted
                </div>
                <div class="col-md-6">
                    <input type="date" class="form-control" name="inserted">
                </div>
            </div>

            <div class="d-flex col-md-8" style="align-items: center; text-align: center; margin: 0 auto;">
                <div class="col-md-2" style="align-items: center; text-align:right;">
                    published
                </div>
                <div class="col-md-6">
                    <input type="datetime-local" class="form-control" name="published">
                </div>
            </div>
            <div class="d-flex col-md-12 justify-content-center"
                 style="align-items: center; text-align: center; margin: 0 auto;">
                <div class="" style="align-items: center;">
                    <button class="btn btn-primary">확인</button>
                </div>

                <div class="col-md-6">
                    <c:if test="${not empty msg}">
                        <div class="text-primary">
                            <p class="text-primary">${msg}</p>
                        </div>
                    </c:if>
                </div>

            </div>
        </form>
    </div>

    <div class="col-md-6">

        <form action="/main34/sub12/search" method="post">
            <div class="row col-md-12">
                <div class="col-md-8">
                    <input type="text" name="keyword" class="form-control" placeholder="검색할 도서명을 입력하세요">
                </div>
                <div class="col-md-4">
                    <button class="btn btn-success">검색</button>
                </div>
            </div>
        </form>

        <table class="table table-dark">
            <thead class="table-primary">
            <tr>
                <th class="col-2">title</th>
                <th>name</th>
                <th>age</th>
                <th>price</th>
                <th>inserted</th>
                <th>published</th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${not empty add}">
                <td colspan="6">${add}</td>
            </c:if>
            <c:forEach items="${list}" var="list">
                <tr>
                    <td class="col-md-2">${list.title}</td>
                    <td>${list.name}</td>
                    <td>${list.age}</td>
                    <td>${list.price}</td>
                    <td>${list.inserted}</td>
                    <td>${list.published}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
