package com.sutdy.core;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application9 {
    public static void main(String[] args) {

        BeanFactory beanFactory = SpringApplication.run(Application9.class, args);
        MyClass91 bean1 = beanFactory.getBean(MyClass91.class);
        MyClass92 bean2 = beanFactory.getBean(MyClass92.class);
        MyClass91 bean3 = bean2.getMyClass91();

        System.out.println("bean1 = " + bean1);
        System.out.println("bean2 = " + bean2);
        System.out.println("bean3 = " + bean3);
    }
}

@Component
class MyClass91 {

}

@Component
@Getter
class MyClass92 {

    //dependency Injection 방법
    //1.필드에 주입
    //2. 생성자 주입
    //3. setter주입

    @Autowired
    private MyClass91 myClass91;
}
