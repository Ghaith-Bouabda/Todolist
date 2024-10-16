package com.todolist.project.Users;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUser(
            @PathVariable("id") Integer id)

    {
        return userRepository.findById(id).orElse(null);
    }
}
