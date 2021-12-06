package com.example.exampleschedule.repository;

import com.example.exampleschedule.entity.User;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.UUID;

@Repository
public class UserRepository implements RedisRepository{

    private static final String KEY="User";


    private RedisTemplate<String,User> redisTemplate;
    private HashOperations hashOperations;

    public UserRepository(RedisTemplate<String,User> redisTemplate){
        this.redisTemplate= redisTemplate;
    }

    @PostConstruct
    private void init(){
     hashOperations= redisTemplate.opsForHash();
    }

    @Override
    public Map<String, User> findAll() {
        return hashOperations.entries(KEY);
    }

    @Override
    public User findBy(String id) {
        return (User) hashOperations.get(KEY,id);
    }

    @Override
    public User findByEmail(String email) {
        return (User) hashOperations.get(KEY,email);
    }

    @Override
    public void save(User user) {
        hashOperations.put(KEY, user.getEmail(), user);
    }

    public void update(User user) {
        hashOperations.put(KEY, user.getEmail(), user);
    }
}
