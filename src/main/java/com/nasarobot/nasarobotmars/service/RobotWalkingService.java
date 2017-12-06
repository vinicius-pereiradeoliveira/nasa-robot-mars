package com.nasarobot.nasarobotmars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nasarobot.nasarobotmars.business.rules.CurrentRobotPosition;
import com.nasarobot.nasarobotmars.entity.Robot;
import com.nasarobot.nasarobotmars.output.RobotOutput;
import com.nasarobot.nasarobotmars.utils.ValidateUtil;

@Service
public class RobotWalkingService {

	@Autowired
	private CurrentRobotPosition currentRobotPosition;
	
	public RobotOutput newCommandForRobot(String commandInput) throws Exception {
		if (!ValidateUtil.validCommand(commandInput)) {
			throw new Exception("Only accept command with M, L or R!");
		}
		return new RobotOutput(new Robot().initialPosition(), commandForRobot(commandInput));
	}

	private String commandForRobot(String commandInput) throws Exception {
		return currentRobotPosition.searchPositionRobot(commandInput);
	}
}
