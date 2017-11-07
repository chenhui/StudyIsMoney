package com.chenhui.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import  org.junit.Assert;
import  org.hamcrest.Matchers;

import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {

	
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;
	
	private URL base;
	
	@Before
	public void setup() throws Exception{
		this.base=new URL("http://localhost:"+port+"/hellow");
	}
	
	@Test
	public void AddTest(){
		System.out.println("1+1=2");
		Assert.assertEquals(2,1+1);
	}

	@Test
	public void HelloTest(){
		ResponseEntity<String> response = restTemplate.getForEntity(base.toString(), String.class);
		Assert.assertThat(response.getBody(), Matchers.equalTo("hello world test my swap!"));
	}
}
