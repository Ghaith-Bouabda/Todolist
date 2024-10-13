package com.todolist.project.Users;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class userController {
 private final UserRepository userRepository ;

    public userController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/{id}")
    public Optional<Users> findUser(
            @PathVariable("id") Integer id)

 {
    return userRepository.findById(id);
    }
    @PostMapping("/createuser")
    public Users createUser(@RequestBody Users user) {
        return userRepository.save(user);
    }
}
