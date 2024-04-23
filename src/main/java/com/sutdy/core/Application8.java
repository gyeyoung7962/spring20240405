package com.sutdy.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Application8 {
    public static void main(String[] args) {

        BeanFactory beanFactory = SpringApplication.run(Application8.class, args);

        MyClass81 bean1 = beanFactory.getBean(MyClass81.class);
        MyClass82 bean2 = beanFactory.getBean(MyClass82.class);
        Object bean3 = beanFactory.getBean("myBean81");
        Object bean4 = beanFactory.getBean("myBean82");
        System.out.println(bean1 == bean3);
        System.out.println(bean2 == bean4);


    }
}


class MyClass81 {

}

@Configuration
class MyClassBeanTest1 {

    @Bean("myBean81")
    public MyClass81 myBean8133() {

        return new MyClass81();
    }

    @Bean("myBean82")
    public MyClass82 myBean8233() {

        return new MyClass82();
    }
}

class MyClass82 {

}