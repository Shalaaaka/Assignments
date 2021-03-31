package com.shalaka.Question3.config;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class SpringSecurity extends WebSecurityConfigurerAdapter 
{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().
		antMatchers("/app/secure/**").
		access("hasRole('ROLE_ADMIN')");
		
		http.formLogin().  
        loginPage("/app").
        loginProcessingUrl("/appLogin").
        usernameParameter("app_username").
        passwordParameter("app_password").
        defaultSuccessUrl("/app/secure/home");
		
		http.rememberMe(). 
        key("rem-me-key").
        rememberMeParameter("remember-me-param").
        rememberMeCookieName("my-remember-me").
        tokenValiditySeconds(86400);
		
		//logout configuration
        http.logout().    
		logoutUrl("/appLogout"). 
		logoutSuccessUrl("/app");
	} 
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("shalaka").password("admin").roles("ADMIN");
	}	
}  