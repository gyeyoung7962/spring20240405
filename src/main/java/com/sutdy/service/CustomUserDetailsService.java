package com.sutdy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //스프링이 스캔할수있음
@RequiredArgsConstructor //주입방식 설정 생성자
public class CustomUserDetailsService implements UserDetailsService {

    //UserDetailsService
    //UserDetailsService를 구현하는 클래스는 loadUserByUsername() 메서드를 오버라이딩하여
    // 사용자 이름을 기반으로 사용자 정보를 로드합니다. 이 메서드는 인증 프로세스 중에 사용되어 사용자의 인증 및 권한 부여를 처리합니다.
    //사용자 정보를 구성하는 클래스이므로 보안정보설정은 아니므로 EnableMethodSecurity 어노테이션은 SecurityConfiguration에 설정한다(보안과 관련있으므로 보기쉽게 하기위해)

    private final BCryptPasswordEncoder encoder;//주입객체 설정(자동으로 객체 생성및 관리 엮어주는 역활)
    //bean에 encoder를 CustomUserDetailService가
    //의존하기때문에 엮어서 사용할수있도록 의존성주입을한다(DI)
    //bean에 등록된객체는 빈으도 등록한 객체가 필요로하는곳에 주입


    //사용자 이름을 기반으로 사용자 정보를 로드합니다
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.equals("son")) {
            String encoded = encoder.encode("son7");
            return new User("son", encoded, List.of(new SimpleGrantedAuthority("user")));
        } else if (username.equals("lee")) {
            String encoded = encoder.encode("lee9");
            return new User("lee", encoded, List.of(new SimpleGrantedAuthority("admin"),
                    new SimpleGrantedAuthority("user")));
        } else {
            throw new UsernameNotFoundException(username + "not found");
        }

    }


}
