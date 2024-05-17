package com.sutdy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Map;

@Controller
@RequestMapping("/api/main45")
@RequiredArgsConstructor
public class Controller45 {

    private final JwtEncoder jwtEncoder;

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody Map<String, Object> map) {

        //사용자 이름
        String username = map.get("username").toString();

        //권한
        String scope = (String) map.get("scope");

        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("self")
                .issuedAt(Instant.now())
                .expiresAt(Instant.now().plusSeconds(60 * 60 * 24))
                .subject(username)
                .claim("scope", scope)
                .build();


        return jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }

    @GetMapping("/all")
    @ResponseBody
    public String all() {
        return "누구나 접근 가능한 경로";
    }

    @GetMapping("/user")
    @ResponseBody
    @PreAuthorize("isAuthenticated()")
    public String user() {
        return " 로그인한 유저만 접근 가능한 경로";
    }

    @GetMapping("admin")
    @ResponseBody
    @PreAuthorize("hasAuthority('SCOPE_admin')")
    public String admin() {
        return "어드민만 접근 가능한 경로";
    }

    @GetMapping("manager")
    @ResponseBody
    @PreAuthorize("hasAuthority('SCOPE_manager')")
    public String manager() {
        return "매너지만 접근가능";
    }

    @GetMapping("ma")
    @ResponseBody
    @PreAuthorize("hasAnyAuthority('SCOPE_manager', 'SCOPE_admin')")
    public String ma() {
        return "매니저 또는 어드민이 접근 가능한 경로";
    }
}
