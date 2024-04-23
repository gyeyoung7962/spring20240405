package com.sutdy.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application5 {
    public static void main(String[] args) {

        BeanFactory beanFactory = SpringApplication.run(Application5.class);

        MyClass51 bean1 = beanFactory.getBean(MyClass51.class);
        MyClass52 bean2 = beanFactory.getBean(MyClass52.class);
        Object bean3 = beanFactory.getBean("myClass51");
        Object bean4 = beanFactory.getBean("mybean1");

        System.out.println("bean1 = " + bean1);
        System.out.println("bean2 = " + bean2);
        System.out.println("bean3 = " + bean3);
        System.out.println("bean4 = " + bean4);

    }
}

//spring bean의 이름을 주지 않으면 클래스명을 lowerCamelCase로 바꾼 것을 이름으로 사용함
@Component
class MyClass51 {

}

//spring bean에 이름 부여
@Component("mybean1")
class MyClass52 {

}
