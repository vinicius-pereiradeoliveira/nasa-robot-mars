package com.nasarobot.nasarobotmars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nasarobot.nasarobotmars.businessrules.CurrentRobotPosition;
import com.nasarobot.nasarobotmars.entity.Robot;
import com.nasarobot.nasarobotmars.output.RobotOutput;

@Service
public class RobotWalkingService {

	@Autowired
	private CurrentRobotPosition currentRobotPosition;
	
	public RobotOutput newCommandForRobot(String commandInput) {
		return new RobotOutput(new Robot().initialPosition(), commandForRobot(commandInput));
	}

	private String commandForRobot(String commandInput) {
		return currentRobotPosition.searchPositionRobot(commandInput);
	}
}
