package com.nasarobot.nasarobotmars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nasarobot.nasarobotmars.entity.Location;
import com.nasarobot.nasarobotmars.entity.Robot;

@SpringBootApplication
public class NasaRobotApplication {

	public static void main(String[] args) {
		SpringApplication.run(NasaRobotApplication.class, args);
	}
}
