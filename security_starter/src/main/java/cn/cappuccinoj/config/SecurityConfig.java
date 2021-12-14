package cn.cappuccinoj.config;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * WebSecurityConfigurerAdapter 配置要求所有用户进行身份认证，且支持基于表单的身份验证。
 * 1、确保对我们应用程序的任何请求都需要对用户进行身份验证
 * 2、允许用户使用基于表单的登录进行身份验证
 * 3、允许用户使用 HTTP Basic 身份验证进行身份验证
 *
 * @Author cappuccino
 * @Date 2021-12-14 21:40
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //@Override
    //protected void configure(HttpSecurity http) throws Exception {
    //    http
    //            .formLogin(Customizer.withDefaults()) //不检查权限，只要认证过的即可访问
    //            .authorizeHttpRequests(req -> req.antMatchers("/api/greeting").authenticated()); //指定任何经过身份验证的用户都允许url。
    //}
}
