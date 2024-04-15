<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<style>
    .stylediv {
        padding: 10px;
    }

</style>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-3"></div>
        <form action="/main20/sub4" method="get">
            <div class="col-md-6 text-align-center p-2">
                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">이름</div>
                    <div class="col-md-10">
                        <input type="text" name="name" class="form-control">
                    </div>
                </div>
                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">주소</div>
                    <input type="text" class="form-control" name="address">
                </div>

                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">나이</div>
                    <input type="number" min="1" max="100" name="age" class="form-control">
                </div>

                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">생일</div>
                    <input type="date" name="birth" class="form-control">
                </div>

                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">도시</div>
                    <input type="text" name="city" class="form-control">
                </div>

                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">제목</div>
                    <input type="text" name="title" class="form-control">
                </div>

                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">내용</div>
                    <textarea name="content" class="form-control"></textarea>
                </div>


                <div class="col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2"></div>
                    <input type="checkbox" name="foods" value="pizza">
                    피자
                    <input type="checkbox" name="foods" value="noodle">
                    누들
                    <input type="checkbox" name="foods" value="burger">
                    햄버거
                </div>


                <div class="col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">타입</div>
                    <select name="type">
                        <option value="a">a</option>
                        <option value="b">b</option>
                        <option value="c">c</option>
                    </select>
                </div>

                <div class="col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-4">핸드폰</div>
                    <div class="col-md-10">
                        <input type="radio" name="phone" value="01012345678">
                        선택
                    </div>
                </div>

                <div class="col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">책</div>
                    <input type="checkbox" name="book" value="책1">
                    책1
                    <input type="checkbox" name="book" value="책2">
                    책2
                    <input type="checkbox" name="book" value="책3">
                    책3
                </div>

                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">아이디</div>
                    <input type="text" name="id" class="form-control">
                </div>

                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">비밀번호</div>
                    <input type="password" name="password" class="form-control">
                    </textarea>
                </div>

                <div class="d-flex col-md-4 stylediv" style="align-items: center;">
                    <div class="col-md-2">자기소개</div>
                    <textarea name="describe" class="form-control"></textarea>
                </div>

                <div class=" col-md-4 stylediv" style="text-align: end;">
                    <input type="submit" class="btn btn-success">
                </div>


            </div>
        </form>

        <hr/>
        <p>이름 ${name}</p>
        <p>주소 ${address}</p>
        <p>나이 ${age}</p>
        <p>생일 ${birth}</p>
        <p>도시 ${city}</p>
        <p>제목 ${title}</p>
        <p>내용 ${content}</p>
        <p>푸드 :${foods}</p>
        <p>타입 :${type}</p>
        <p>핸드폰:${phone}</p>
        <p>책:${book}</p>
        <p>아이디:${id}</p>
        <p>비밀번호:${password}</p>
        <textarea>${describe}</textarea>
        <div class="col-md-3"></div>
    </div>
    <div class="col-md-3"></div>
</body>
</html>
