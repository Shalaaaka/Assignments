package com.shalaka.Question1.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity //To enable assigned user name and password on web
public class SecurityConfiguration extends WebSecurityConfigurerAdapter
{
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		//assigning user name and password
		auth.inMemoryAuthentication().withUser("shalaka").password("user").roles("USER")
		.and().withUser("shala").password("admin").roles("ADMIN");//Multiple user names and passwords: 
	}
	
	//Encoding
	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		//return NoOpPasswordEncoder.getInstance();
		return Bc
	}
	
	//Spring Security filter chain
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests().antMatchers("/admin").hasAnyRole("ADMIN")//if localhost:8082/admin- only admin is allowed
		.antMatchers("/user").hasAnyRole("USER","ADMIN")//when /user - both user and admin are allowed
		.antMatchers("/").permitAll()//when / - everyone is allowed
		.and().formLogin().and()
		.rememberMe().key("rem-em-key").rememberMeParameter("remember")
		.rememberMeCookieName("rememberlogin").tokenValiditySeconds(5).and().logout().permitAll();	}
}