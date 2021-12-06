package com.example.exampleschedule.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.example.exampleschedule.entity.User;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public interface UserRepositoryCDB extends ReactiveCosmosRepository<User,String> {
    Mono<User> findByEmail(String email);
}
