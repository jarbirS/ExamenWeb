package com.examen.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter  {
	
	@Autowired
    DataSource dataSource;
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/", "/login", "/index/**", "/css/**", "/img/**", "/js/**").permitAll()
		.antMatchers("/materia/**").hasRole("ADMIN")
		.antMatchers("/user/**").hasRole("USER")
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
			.loginPage("/login")
			.permitAll()
		.and()
		.logout()
			.invalidateHttpSession(true)
			.clearAuthentication(true)
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/index");
		
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	//	auth.inMemoryAuthentication()
	//		.withUser("user").password("{noop}pass").roles("USER");
		auth.jdbcAuthentication()
        .dataSource(dataSource)
        .usersByUsernameQuery("select id as username, clave as password, enabled" + " from usuario" + " where id=?")
        .authoritiesByUsernameQuery("select username, authority " + "from authorities " + "where username = ? ");
			
		
	}
	
	@Bean
    public PasswordEncoder getPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
        
        
    }
		

}
