package com.example.exampleschedule;

import com.example.exampleschedule.entity.User;
import com.example.exampleschedule.repository.UserRepositoryCDB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import reactor.core.publisher.Mono;

@SpringBootTest
class ExamplescheduleApplicationTests {

	//@Autowired
	//UserRepositoryCDB userRepositoryCDB;

	@Test
	public void contextLoads() {

		//User user = new User();
		//user.setName("Carolina");
		//user.setEmail("caroponcemar@gmail.com");

		//Mono<User> save = userRepositoryCDB.save(user);
		//Assert.notNull(save,"Retrieved Product is Null");

	}

}
