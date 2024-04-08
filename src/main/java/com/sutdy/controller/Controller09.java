package com.sutdy.controller;


import com.sutdy.domain.Car;
import com.sutdy.domain.MyBean;
import com.sutdy.domain.MyBean2;
import com.sutdy.domain.MyBean3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main9")
public class Controller09 {

    @RequestMapping("/sub1")
    public void sub1(Model model) {
        MyBean myBean = new MyBean();
        model.addAttribute("person", myBean);
    }

    @RequestMapping("/sub2")
    public void sub2(Model model) {
        MyBean2 obj = new MyBean2();

        obj.setAge(20);
        obj.setName("흥민");

        model.addAttribute("person", obj);

        MyBean2 obj2 = new MyBean2();
        obj2.setAge(60);
        obj2.setName("차범근");

        model.addAttribute("person2", obj2);

    }

    @RequestMapping("/sub3")
    public void sub3(Model model) {
        MyBean3 obj1 = new MyBean3();
        obj1.setAge(20);
        obj1.setAddress("신촌");
        obj1.setCity("서울");
        MyBean3 obj2 = new MyBean3();
        obj2.setAge(60);
        obj2.setAddress("해운대");
        obj2.setCity("부산");

        model.addAttribute("member1", obj1);
        model.addAttribute("member2", obj2);
    }

    @RequestMapping("/sub4")
    public void sub4(Model model) {

        Car car = new Car();

        car.setModelNumber("k5");
        car.setProductPrice(5000);
        car.setName("kia");
        car.setWeight(2400.50);

        model.addAttribute("car", car);
    }
}
