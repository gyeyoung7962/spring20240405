package com.sutdy.controller;

import com.sutdy.domain.MyBean411;
import com.sutdy.domain.MyBean412;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/main43")
public class Controller43 {

    @GetMapping("/sub1")
    @ResponseBody
    public String method1() {

        return "어떤 데이터";
    }

    @GetMapping("/sub2")
    @ResponseBody
    public String method2() {

        return "어떤 데이터2";
    }

    @GetMapping("/sub3")
    @ResponseBody
    public Map<String, Object> method3() {

        return Map.of("name", "흥민",
                "age", 35,
                "married", true,
                "info", Map.of("team", "토트넘", "location", "런던"),
                "item", List.of("축구공", "운동화", "유니폼"));
    }

    @GetMapping("/sub4")
    @ResponseBody
    public Map<String, Object> method4() {

        return Map.of("Product", "라이언 자켓",
                "type", List.of("면", "소가죽"),
                "info", Map.of("custom", "기본 재질 면100%", "size", "100L"));
    }

    @GetMapping("/sub5")
    @ResponseBody
    public MyBean411 method5() {

        MyBean411 obj = new MyBean411();

        obj.setName("이강인");
        obj.setAge(55);

        return obj; //json으로 직렬화
    }

    @GetMapping("/sub6")
    @ResponseBody
    public MyBean412 method6() {
        MyBean412 myBean412 = new MyBean412();
        myBean412.setFoods(List.of("감자", "고구마"));
        myBean412.setHeight(177.7);
        myBean412.setMarried(false);

        MyBean411 myBean411 = new MyBean411();
        myBean411.setName("흥민");
        myBean411.setAge(55);
        myBean412.setInfo(myBean411);
        myBean412.setName("강인");

        return myBean412;

    }
}
