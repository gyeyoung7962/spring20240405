package com.sutdy.core;

import lombok.Getter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Application10 {
    public static void main(String[] args) {

        BeanFactory beanFactory = SpringApplication.run(Application10.class);
        MyClass101 bean1 = beanFactory.getBean(MyClass101.class);

        MyClass102 filed = bean1.getFiled();
        System.out.println("filed = " + filed);

    }
}

@Configuration
class App10 {

    @Bean
    public MyClass101 myClass101() {
        return new MyClass101();
    }

    @Bean
    public MyClass102 myClass102() {
        return new MyClass102();
    }
}

@Getter
class MyClass101 {

    @Autowired
    private MyClass102 filed;
}

class MyClass102 {

}


//@Getter
//@Component
//class MyClass101 {
//
//    @Autowired
//    private MyClass102 filed;
//}
//
//@Component
//class MyClass102 {
//
//}
