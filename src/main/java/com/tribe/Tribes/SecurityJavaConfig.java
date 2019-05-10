/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tribe.Tribes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 *
 * @author Kristóf
 */

@Configuration 
@EnableWebSecurity 
public class SecurityJavaConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("admin").password(encoder().encode("adminPass")).roles("ADMIN")
            .and()
            .withUser("user").password(encoder().encode("userPass")).roles("USER");
    }
 
    @Bean
    public PasswordEncoder  encoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception { 
        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/**").permitAll()
                //.antMatchers("/**").hasRole("ADMIN")
                //.antMatchers("/admin/**").hasRole("ADMIN")
                //.antMatchers(HttpMethod.DELETE, "/players/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();
       
       //http.authorizeRequests().antMatchers("/").permitAll();
    }
    
    
}
