package com.sutdy.controller;


import com.sutdy.domain.MyBean101;
import com.sutdy.domain.MyBean102;
import com.sutdy.domain.MyBean103;
import com.sutdy.domain.MyBean104;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/main10")
public class Controller10 {

    @RequestMapping("/sub1")
    public void method1(Model model) {

        var data = new HashMap<>();


        data.put("key1", List.of("java", "css"));
        data.put("key2", List.of("react", "vue"));
        data.put("key 삼", List.of("spring", "node"));

        model.addAttribute("myList", data);

    }

    @RequestMapping("/sub2")
    public void method2(Model model) {
        var data = new ArrayList<Map>();
        data.add(Map.of("son", 7, "lee", 19, "kim", 30));
        data.add(Map.of("korea", "seoul", "japan", "tokyo", "미국", "워싱턴"));

        model.addAttribute("myAttr", data);
    }

    @RequestMapping("/sub3")
    public void method3(Model model) {

        var data = new HashMap<String, String>();
        data.put("흥민", "런던");
        data.put("민재", "뭔헨");
        data.put("강인", "파리");
        data.put("jh", "샌프란시스코");

        model.addAttribute("myAttr1", data);
        model.addAttribute("myAttr2", "흥민");
        model.addAttribute("myAttr3", "민재");
        model.addAttribute("jh", "강인");
    }

    @RequestMapping("/sub4")
    public void method4(Model model) {
        var data = new ArrayList<Map>();

        data.add(Map.of("son", "london", "lee", "paris"));
        data.add(Map.of("korea", "seoul", "uk", "london"));
        data.add(Map.of("부산", "해운대"));
        data.add(Map.of("서울", "강남"));

        model.addAttribute("list1", data);
        model.addAttribute("number1", 1);
        model.addAttribute("two", 2);
        model.addAttribute("three", "3");
        model.addAttribute("data1", "son");
        model.addAttribute("data2", "lee");
    }

    @RequestMapping("/sub5")
    public void method5(Model model) {
    }

    @RequestMapping("/sub6")
    public void method6(Model model) {

        var data = new ArrayList<MyBean101>();

        MyBean101 e1 = new MyBean101();
        MyBean101 e2 = new MyBean101();
        MyBean101 e3 = new MyBean101();

        e1.setName("흥민");
        e1.setAge(18);
        e1.setAddress("런던");

        e1.setName("강인");
        e1.setAge(30);
        e1.setAddress("파리");

        e1.setName("정후");
        e1.setAge(40);
        e1.setAddress("샌프란시스코");

        data.add(e1);
        data.add(e2);
        data.add(e3);

        model.addAttribute("myList", data);
    }

    @RequestMapping("/sub7")
    public void method7(Model model) {

        var list = new ArrayList<MyBean102>();

        MyBean102 e1 = new MyBean102();
        e1.setColor("초록");
        e1.setPrice(1000);
        e1.setModelName("초록차");

        MyBean102 e2 = new MyBean102();
        e2.setModelName("보라차");
        e2.setColor("보라");
        e2.setPrice(2000);

        MyBean102 e3 = new MyBean102();
        e3.setModelName("파랑차");
        e3.setPrice(3000);
        e3.setColor("파랑");

        list.add(e1);
        list.add(e2);
        list.add(e3);

        model.addAttribute("cars", list);

    }

    @RequestMapping("/sub8")
    public void method8(Model model) {
        var list = new ArrayList<MyBean103>();

        MyBean103 e1 = new MyBean103();
        MyBean103 e2 = new MyBean103();

        e1.setName("한국");
        e1.setCities(List.of("서울", "인천", "부산"));

        e2.setName("미국");
        e2.setCities(List.of("뉴욕", "LA"));

        list.add(e1);
        list.add(e2);

        model.addAttribute("myList", list);
    }

    @RequestMapping("/sub9")
    public void method9(Model model) {

        var data = new ArrayList<MyBean104>();

        MyBean104 e1 = new MyBean104();

        e1.setCity("서울");
        e1.setFoods(List.of("치킨", "피자", "햄버거"));

        MyBean104 e2 = new MyBean104();
        e2.setCity("목동");
        e2.setFoods(List.of("사과", "고기", "바나나"));

//        data.add(e1);
//        data.add(e2);

        var obj = List.of(e1, e2);


        model.addAttribute("data", obj);
    }

}
