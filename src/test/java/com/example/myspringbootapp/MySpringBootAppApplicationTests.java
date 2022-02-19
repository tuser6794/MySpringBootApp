package com.example.myspringbootapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringBootAppApplicationTests {

	@Autowired
	NewsController newsController;
	
	Integer ref;
	
	@Test
	void contextLoads() {
		assertThat(newsController).isNotNull();
	}

}
