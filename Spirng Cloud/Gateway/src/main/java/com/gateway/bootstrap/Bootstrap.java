package com.gateway.bootstrap;

import com.gateway.model.User;
import com.gateway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("AnasMarg");
        user.setOrganizationId("1234");

        this.userRepository.save(user);
    }
}

