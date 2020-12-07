package com.User.user.bootstrap;

import com.User.user.domain.User;
import com.User.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Bootstrap implements CommandLineRunner {

    private final UserRepository userRepository;

    public Bootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        List<User> users = new ArrayList<>();

        User user = new User("AnasMarg", "1234");
        User user1 = new User("AnthiMolozi", "1234");

        users.add(user);
        users.add(user1);

        this.userRepository.saveAll(users);
    }
}
