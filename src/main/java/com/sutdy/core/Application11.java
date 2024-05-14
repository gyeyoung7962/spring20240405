package com.sutdy.core;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application11 {
    public static void main(String[] args) {

        BeanFactory beanFactory = SpringApplication.run(Application11.class, args);
        MyClass112 bean1 = beanFactory.getBean(MyClass112.class);
        MyClass111 filed = bean1.getField();
        System.out.println("field = " + filed);
    }
}


@Component
class MyClass111 {

}

@Component
@Getter
class MyClass112 {

    private MyClass111 field; // dependency Injection

    @Autowired //생성자가 하나일때 생략 가능
    public MyClass112(MyClass111 field) {
        this.field = field;
    }
}