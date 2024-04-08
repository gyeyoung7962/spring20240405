package com.sutdy.controller;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import java.io.IOException;
import java.io.PrintWriter;


@Controller
public class Controller01 {

    @RequestMapping("/main1")
    public void method1(WebRequest req, HttpServletResponse resp) throws IOException {
        //1. 요청 분석/가공
        String name = req.getParameter("name");
        //2. 비즈니스 로직 실행
        String data = name + " 님 반갑습니다";

        String result = STR."""
                <html>
                    <body>
                        <h1>\{data}</h1>
                        <p>코드 수정</p>
                    </body>
                </html>
                """;

        //3. 결과응답
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.print(result);
    }

    //요청 메시지 첫줄이 다음과 같으면 실행
    //get /main1/sub1 http/1.1
    @RequestMapping(value = "/main1/sub1")
    public void method2() {
        System.out.println("Controller01.method2");
    }

    //요청 메시지 첫줄이 다음과 같으면 실행되는 메소드 작성
    //get /main1/sub2 http/1.1

    @RequestMapping("/main1/sub2")
    public void method3() {

        System.out.println("Controller01.method3");
    }
}
