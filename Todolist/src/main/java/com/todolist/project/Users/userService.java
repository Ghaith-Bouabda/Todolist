package com.todolist.project.Users;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class userService {
    private final UserRepository userRepository;

    public userService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users findUser(
            @PathVariable("id") Integer id)

    {
        return userRepository.findById(id).orElse(null);
    }
}
