package com.todolist.project.Users;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class userController {
 private final UserRepository userRepository ;
private final userService userService ;
    public userController(UserRepository userRepository, com.todolist.project.Users.userService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }
    @GetMapping("/{id}")
    public Users getuser(@PathVariable("id") Integer id){
        return userService.findUser(id);

    }
    @PostMapping("/createuser")
    public Users createUser(@RequestBody Users user) {
        return userRepository.save(user);
    }
}
