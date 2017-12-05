package com.nasarobot.nasarobotmars.service;

import org.springframework.stereotype.Service;

import com.nasarobot.nasarobotmars.entity.Robot;
import com.nasarobot.nasarobotmars.output.RobotOutput;

@Service
public class RobotWalkingService {

	public RobotOutput newCommandForRobot(String commandInput) {
		return new RobotOutput(initialPosition(), commandForRobot(commandInput));
	}

	private String initialPosition() {
		return new Robot().initialPosition();
	}
	
	private String commandForRobot(String commandInput) {
		// TODO Auto-generated method stub
		return null;
	}
}
