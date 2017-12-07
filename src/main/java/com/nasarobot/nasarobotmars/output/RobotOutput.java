package com.nasarobot.nasarobotmars.output;

public class RobotOutput {
	
	private String positionAfterCommand;

	public RobotOutput(String positionAfterCommand) {
		this.positionAfterCommand = positionAfterCommand;
	}

	public String getPositionAfterCommand() {
		return positionAfterCommand;
	}

	@Override
	public String toString() {
		return "("+positionAfterCommand+")";
	}
	
	
}
