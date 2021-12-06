package com.example.exampleschedule.repository;

import com.example.exampleschedule.entity.User;

import java.util.Map;

public interface RedisRepository {

    Map<String, User> findAll();
    User findBy(String id);
    User findByEmail(String email);
    void save(User user);

}
