package com.sutdy.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application12 {
    public static void main(String[] args) {

        BeanFactory beanFactory = SpringApplication.run(Application12.class, args);
        MyClass122 bean1 = beanFactory.getBean(MyClass122.class);
        MyClass121 field = bean1.getField();
        System.out.println("field = " + field);
    }
}

@Component
class MyClass121 {

}

@Component
@Getter
@RequiredArgsConstructor
class MyClass122 {

    private final MyClass121 field;
}
