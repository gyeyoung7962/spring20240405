package com.sutdy.controller;

import com.sutdy.domain.MyBean411;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/api/main42")
public class Controller42 {

    @PostMapping("/sub1")
    public void sub1(@RequestBody Map<String, Object> map) {

        //@RequestBody
        //역직렬화(파싱,디코딩) JSON -> Map
        System.out.println("map = " + map);
    }

    @PostMapping("/sub2")
    public void sub2(@RequestBody Map<String, Object> map) {

        System.out.println("map = " + map);
    }

    @PostMapping("/sub3")
    public void sub3(@RequestBody Map<String, Object> map) {

        System.out.println("map = " + map);
    }

    @PostMapping("/sub4")
    public void sub4(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);
    }

    @PostMapping("/sub5")
    public void sub5(@RequestBody Map<String, Object> map) {
        System.out.println("map = " + map);

        System.out.println("map.name" + map.getClass());
    }

    @PostMapping("/sub6")
    public void sub6(@RequestBody MyBean411 bean411) {

        System.out.println("bean411 = " + bean411);
    }

    @PostMapping("/sub7")
    public void sub7(@RequestBody MyBean411 bean411) {

        System.out.println("bean411 = " + bean411);
    }


}
