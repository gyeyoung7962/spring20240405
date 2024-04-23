package com.sutdy.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application6 {
    public static void main(String[] args) {
        BeanFactory beanFactory = SpringApplication.run(Application6.class, args);
        Object bean1 = beanFactory.getBean("mybean61");
        Object bean2 = beanFactory.getBean("myClass62");
        MyClass61 bean3 = beanFactory.getBean(MyClass61.class);
        MyClass62 bean4 = beanFactory.getBean(MyClass62.class);

        System.out.println("bean1 = " + bean1);
        System.out.println("bean2 = " + bean2);
        System.out.println("bean3 = " + bean3);
        System.out.println("bean4 = " + bean4);

        System.out.println(bean1 == bean3);
        System.out.println(bean2 == bean4);
    }
}

@Component("mybean61")
class MyClass61 {

}

@Component("myClass62")
class MyClass62 {

}
