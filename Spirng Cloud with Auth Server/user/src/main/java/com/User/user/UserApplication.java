package com.User.user;

import com.User.user.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class UserApplication {

	@Autowired
	private ServiceConfig serviceConfig;

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
