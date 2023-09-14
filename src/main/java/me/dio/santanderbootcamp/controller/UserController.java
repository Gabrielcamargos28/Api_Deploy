package me.dio.santanderbootcamp.controller;

import me.dio.santanderbootcamp.domain.User;
import me.dio.santanderbootcamp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        var user = userService.findById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping("create")
    public  ResponseEntity<User> create(@RequestBody User userToCreate){
        var userCreated = userService.create(userToCreate);

        return ResponseEntity.ok(userCreated);
    }

}
