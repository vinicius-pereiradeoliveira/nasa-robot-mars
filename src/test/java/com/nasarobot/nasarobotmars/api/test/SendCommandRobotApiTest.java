package com.nasarobot.nasarobotmars.api.test;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.nasarobot.nasarobotmars.NasaRobotApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@ComponentScan(basePackageClasses=NasaRobotApplication.class)
public class SendCommandRobotApiTest {
	
	@Autowired
    private TestRestTemplate restTemplate;
	
	final String BASE_PATH = "/rest/mars";
	
	@Test 
	public void sendCommandTestIntegration() {
		ResponseEntity<String> currentLocal = this.restTemplate.postForEntity(BASE_PATH+"/MMRMMRMM", null, String.class);
		Assert.assertEquals("(2,0,S)", currentLocal.getBody());
	}
	
	@Test 
	public void
	sendCommandTestIntegrationError(){
		ResponseEntity<String> returnPosition = this.restTemplate.postForEntity(BASE_PATH+"/CCCMML", null, String.class);
		Assert.assertEquals(HttpStatus.BAD_REQUEST, returnPosition.getStatusCode());
	}
	
	@Test 
	public void
	sendCommandTestIntegrationErrorLimitTerrain(){
		ResponseEntity<String> returnPosition = this.restTemplate.postForEntity(BASE_PATH+"/MMMMMM", null, String.class);
		Assert.assertEquals(HttpStatus.BAD_REQUEST, returnPosition.getStatusCode());
	}
	
}
