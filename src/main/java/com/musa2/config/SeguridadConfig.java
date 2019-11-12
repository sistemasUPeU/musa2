package com.musa2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.musa2.serviceImp.UserLogin;



@Configuration
@EnableWebSecurity
public class SeguridadConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private UserLogin userLogin;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.userDetailsService(userLogin).passwordEncoder(passwordEncoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/usuarios/**").permitAll()
		.antMatchers("/requisitos/**").permitAll()
		.antMatchers("/vehiculos/**").permitAll()
		.antMatchers("/propietarios/**").permitAll()
		.antMatchers("/conductores/**").permitAll()
		.antMatchers("/roles/**").permitAll()
		.antMatchers("/vinculos/**").permitAll()
		.antMatchers("/vinrequi/**").permitAll()
		.antMatchers("/acciones/**").permitAll()
		.antMatchers("/propietarios/**").permitAll()
		.antMatchers("/soats/**").permitAll()
		.antMatchers("/tarjetac/**").permitAll()
		.antMatchers("/vehiculos/**").permitAll()
		.antMatchers("/requisitos/**"). permitAll()
		.antMatchers("/personas/**").permitAll()
		.antMatchers("/cursos/**").permitAll()
		.anyRequest()
		.authenticated()
		.and()
        .formLogin().loginPage("http://localhost:4200/login").permitAll()
        .and()
        .logout().permitAll()
		.and()
		.httpBasic();		
	}
}
