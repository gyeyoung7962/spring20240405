package com.sutdy.core;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application4 {
    public static void main(String[] args) {
        BeanFactory beanFactory = SpringApplication.run(Application4.class, args);
        MyClass41 bean1 = beanFactory.getBean(MyClass41.class);
        MyClass42 bean2 = beanFactory.getBean(MyClass42.class);

        System.out.println("bean1 = " + bean1);
        System.out.println("bean2 = " + bean2);

        MyClass41 obj = bean2.getObj();
        System.out.println("obj = " + obj);
    }
}


@Component
class MyClass41 {

}

@Component
@Getter
class MyClass42 {


    //Dependency Injection(DI)
    @Autowired
    private MyClass41 obj; // 42클래스가 41클래스를 의존함
}
