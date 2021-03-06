package com.example.exampleschedule.controller;

import com.example.exampleschedule.entity.User;
import com.example.exampleschedule.repository.UserRepository;
import com.example.exampleschedule.repository.UserRepositoryCDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;



import java.util.Map;

@RestController
public class UserController {

    private UserRepository userRepository;
    @Autowired
    private UserRepositoryCDB userRepositoryCDB;

    public UserController(UserRepository s){
        this.userRepository=s;
    }

    @GetMapping("/users")
    public Map<String, User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable String id){
        return userRepository.findBy(id);
    }

    @PostMapping("/user")
    public Mono<User> createUser(@RequestBody User user){
       userRepository.save(user);
       return userRepositoryCDB.save(user);

    }

    @PutMapping("/user/{email}")
    public Mono<User> updateUser(@PathVariable("email") String email,@RequestBody User userNew) {

        Mono<User> userOld = userRepositoryCDB.findByEmail(email);
        return userOld.flatMap(p -> {
          p.setName(userNew.getName());
          userRepository.update(p);
          return userRepositoryCDB.save(p);
        });
    }
//        Mono.just(userOld);
//        userOld.setName(userNew.getName());
//        userRepository.save(userOld);
//       return userRepositoryCDB.save(userOld);


}
