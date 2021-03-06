package com.cxytiandi.eureka_server;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author chx
 * @version 1.0
 * @description: TODO
 * @date 2021/3/19 0019 8:35
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //关闭csrf
        http.csrf().disable();
        //关闭httpBasic
        http.authorizeRequests()
        .anyRequest()
        .authenticated()
        .and()
        .httpBasic();
    }
}
