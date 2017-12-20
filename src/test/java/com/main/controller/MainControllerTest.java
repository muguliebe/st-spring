package com.main.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainControllerTest {

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	public void main() {

		ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);

		int                    statusCodeValue = response.getStatusCodeValue();
		assertThat(statusCodeValue, equalTo(200));

	}

}
