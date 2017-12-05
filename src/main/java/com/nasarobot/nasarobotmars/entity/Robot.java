package com.nasarobot.nasarobotmars.entity;

public class Robot {
	
	private int positionCurrentX;
	private int positionCurrentY;
	private Location location;
	private String initialPosition = "0, 0, N";
	
	public Robot() {
	}
	
	public Robot(int positionCurrentX, int positionCurrentY, Location location) {
		this.positionCurrentX = positionCurrentX;
		this.positionCurrentY = positionCurrentY;
		this.location = location;
	}
	
	public int getPositionCurrentX() {
		return positionCurrentX;
	}

	public void setPositionCurrentX(int positionCurrentX) {
		this.positionCurrentX = positionCurrentX;
	}

	public int getPositionCurrentY() {
		return positionCurrentY;
	}

	public void setPositionCurrentY(int positionCurrentY) {
		this.positionCurrentY = positionCurrentY;
	}

	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}

	public String getInitialPosition() {
		return initialPosition;
	}

	public void setInitialPosition(String initialPosition) {
		this.initialPosition = initialPosition;
	}

	@Override
	public String toString() {
		return "RobotLocation {"
				+ "positionCurrentX=" + positionCurrentX + ", positionCurrentY=" + positionCurrentY + ", location="
				+ location + "}";
	}
	
	public String initialPosition() {
		return "Initial position Robot is: " + getInitialPosition();
	}
	
}
