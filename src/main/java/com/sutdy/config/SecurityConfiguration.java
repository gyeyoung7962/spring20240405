package com.sutdy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //아래와 같은 빈을 정의하겠다
@EnableMethodSecurity //메서드에 대해 보안검사를 수행 //보안관련 클래스를 정의할거라서 SecurityConfiguration에 사용
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        //SecurityFilterChain: 보안필터를 연결하여 Http요청에 대한 보안을 적용하는 일을한다
        //HttpSecurity : 보안 규칙정하는 클래스

        //보안 필터의 적용이다
        http.csrf(csrf -> csrf.disable()); //방어기법 사용 안함
        http.formLogin(form -> form.loginPage("/login")); //로그인페이지 url 설정, 인증안되었으면 login으로 돌아옴

        return http.build(); //실행
    }


    @Bean //해당 메서드가 생성하는 객체를 스프링 관리한다 passwordEncoder가 실행되면 bcryptpasswordEncoder가 반환
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}


