package com.sutdy.core3;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Application3 {
    public static void main(String[] args) {

        BeanFactory factory = SpringApplication.run(Application3.class);

        Dao3 bean1 = factory.getBean(Dao3.class);
        Controller3 bean2 = factory.getBean(Controller3.class);

        System.out.println(bean1);
        System.out.println(bean2);

        System.out.println(bean2.getDao3());
    }
}

@Component
class Dao3 {

}

@Component
@Getter
@Setter
class Controller3 {

    @Autowired  //dependency Injection(DI) 스캔헤서 의존관계에 있는것이 역어주는 역활을 한다
    private Dao3 dao3; //Controller가 Dao에 의존

}
