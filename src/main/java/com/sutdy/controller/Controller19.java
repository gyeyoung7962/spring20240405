package com.sutdy.controller;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main19")
public class Controller19 {


    @RequestMapping("/sub1")
    public void sub1() {

        System.out.println("Controller19.sub1");
    }

    @RequestMapping("/sub2")
    public void sub2(HttpSession session) {

        session.setAttribute("attr", "value");
    }

    @RequestMapping("/sub3")
    public void sub3(HttpSession session) {

        Object attr = session.getAttribute("attr");

        System.out.println("attr = " + attr);
    }

    @RequestMapping("/sub4")
    public void sub4(@RequestParam("name") String name, HttpSession session) {

        session.setAttribute("name", name);
    }

    @RequestMapping("/sub5")
    public void sub5(HttpSession session) {
        Object name = session.getAttribute("name");
        System.out.println("name = " + name);
    }

    @RequestMapping("/sub6")
    public void sub6(HttpServletResponse resp) {

        Cookie cookie = new Cookie("cookie-name1", "cookie-value1");
        resp.addCookie(cookie);
    }

    @RequestMapping("/sub7")
    public void sub7(HttpServletResponse resp) {

        Cookie cookie = new Cookie("cookieData", "cookieData");
        cookie.setHttpOnly(true); // javascript에서 볼수 없도록 함
        cookie.setPath("/"); //정의된 경로와 그 하위 경로에서 쿠키를 가지고 오도록 함
        resp.addCookie(cookie);
    }

    @RequestMapping("/sub8")
    public void sub8(HttpServletResponse resp) {
        Cookie cookie = new Cookie("sub8Cookie", "sub8Cookie");
        cookie.setPath("/");
        cookie.setHttpOnly(true);
//        cookie.setMaxAge(60 * 60 * 24 * 30); //cookie 지속 시간 결정(초 단위)
        cookie.setMaxAge(3);
        resp.addCookie(cookie);
    }

    @RequestMapping("/sub9")
    public void sub9(HttpServletResponse resp) {
        Cookie cookie = new Cookie("cookie-name4", "cookie-value4");
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        cookie.setMaxAge(60);
        resp.addCookie(cookie);
    }

    @RequestMapping("/sub10")
    public void sub10(HttpServletResponse resp, HttpSession session, HttpServletRequest req) {
        //쿠키 지우는법
        //1.요청에서 쿠키 얻기
        Cookie[] cookies = req.getCookies();

        Cookie cookie = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("cookie-name4")) {
                    {
                        cookie = c;
                    }
                }
            }
            if (cookie != null) {
                cookie.setMaxAge(0);
                cookie.setPath("/");
                resp.addCookie(cookie);

            }
        }

        //2.쿠키의 지속시간 0으로 세팅
        //3.쿠키를 응답에 추가


    }

}