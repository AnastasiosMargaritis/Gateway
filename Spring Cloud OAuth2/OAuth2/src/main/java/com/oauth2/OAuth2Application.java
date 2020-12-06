package com.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class OAuth2Application extends WebSecurityConfigurerAdapter {

	@GetMapping("/user")
	public String message(@AuthenticationPrincipal OAuth2User principal){
		return "Hi " + principal.getName() + " you are authenticated via Github.";
	}

	

	@Override
	public void configure(HttpSecurity http) throws Exception {

		http
				.csrf().disable()
				.authorizeRequests()
				.anyRequest().authenticated()
				.and().logout().logoutSuccessUrl("/").permitAll()
				.and()
				.oauth2Login();
	}

	public static void main(String[] args) {
		SpringApplication.run(OAuth2Application.class, args);
	}

}
