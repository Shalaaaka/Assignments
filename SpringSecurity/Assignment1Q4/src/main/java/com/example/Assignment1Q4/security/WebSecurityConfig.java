package com.example.Assignment1Q4.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.example.Assignment1Q4.loginattempts.AuthenticationFailureListener;
import com.example.Assignment1Q4.success.AuthenticationSuccessEventListener;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/login").permitAll()
            .anyRequest().authenticated()
            .formLogin()
                .loginPage("/login")
                .usernameParameter("email")
                .failureHandler(loginFailureHandler)
                .successHandler(loginSuccessHandler)               
                .permitAll()
    }
     
    @Autowired
    private AuthenticationFailureListener loginFailureHandler;
     
    @Autowired
    private AuthenticationSuccessEventListener loginSuccessHandler;
}
}
