package com.sutdy.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application7 {
    public static void main(String[] args) {
        BeanFactory beanFactory = SpringApplication.run(Application7.class, args);
        MyClass71 bean1 = beanFactory.getBean(MyClass71.class);
        System.out.println("bean1 = " + bean1);
        MyClass72 bean2 = beanFactory.getBean(MyClass72.class);
        System.out.println("bean2 = " + bean2);

        Object bean3 = beanFactory.getBean("myClass71");
        System.out.println("bean3 = " + bean3);

        Object bean4 = beanFactory.getBean("someMethod1");
        System.out.println("bean4 = " + bean4);
    }
}


@Component
class MyClass71 {

}

@Configuration
class MyConfiguration7 {


    //@Component 어노테이션을 붙일수 없는 클래스로 spring bean 만들기
    //이름은 메소드명으로 결정됨
    @Bean
    public MyClass72 someMethod1() {
        return new MyClass72();
    }

}

class MyClass72 {

}
