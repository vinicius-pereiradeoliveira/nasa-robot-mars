package com.nasarobot.nasarobotmars.output;

public class RobotOutput {
	
	private String initialPosition;
	private String positionAfterCommand;
	
	public RobotOutput(String initialPosition, String positionAfterCommand) {
		this.initialPosition = initialPosition;
		this.positionAfterCommand = positionAfterCommand;
	}

	public String getInitialPosition() {
		return initialPosition;
	}

	public String getPositionAfterCommand() {
		return positionAfterCommand;
	}

	@Override
	public String toString() {
		return "LocationRobotOutput {"
				+ "initialPosition=" + initialPosition + "," 
				+ "positionAfterCommand=" + positionAfterCommand + ","
				+ "}";
	}
	
	
}
