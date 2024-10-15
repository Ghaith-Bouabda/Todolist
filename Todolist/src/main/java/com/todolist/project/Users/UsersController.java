package com.todolist.project.Users;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
 private final UserRepository userRepository ;
private final UserService userService ;
    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }
    @GetMapping("/{id}")
    public User getuser(@PathVariable("id") Integer id){
        return userService.findUser(id);

    }
    @PostMapping("/createuser")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
