package com.sutdy.config;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@Configuration //스프링이 스캔할수있으며 아래와 같은 빈을 스프링이 관리할수있는 객체로 등록 및 관리 정의하겠다
@EnableMethodSecurity //메서드에 대해 보안검사를 수행 //보안관련 클래스를 정의할거라서 SecurityConfiguration에 사용
public class SecurityConfiguration {

    @Value("${jwt.public.key}") //application.properties의 값을 읽음
    RSAPublicKey key;

    @Value("${jwt.private.key}")
    RSAPrivateKey priv;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        //SecurityFilterChain: 보안필터를 연결하여 Http요청에 대한 보안을 적용하는 일을한다
        //HttpSecurity : 보안 규칙정하는 클래스

        //보안 필터의 적용이다
        http.csrf(csrf -> csrf.disable()); //방어기법 사용 안함
        http.formLogin(form -> form.loginPage("/login")); //로그인페이지 url 설정, 인증안되었으면 login으로 돌아옴

        // jwt로 인증을 요청할때 필터를 추가하는 역활
        http.oauth2ResourceServer(httpSecurityOAuth2ResourceServerConfigurer -> httpSecurityOAuth2ResourceServerConfigurer.jwt(Customizer.withDefaults()));

        return http.build(); //실행
    }


    @Bean //해당 메서드가 생성하는 객체를 스프링 관리한다 passwordEncoder가 실행되면 bcryptpasswordEncoder가 반환
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withPublicKey(this.key).build();
    }

    @Bean
    JwtEncoder jwtEncoder() {
        JWK jwk = new RSAKey.Builder(this.key).privateKey(this.priv).build();
        JWKSource<SecurityContext> jwks = new ImmutableJWKSet<>(new JWKSet(jwk));
        return new NimbusJwtEncoder(jwks);
    }
}


