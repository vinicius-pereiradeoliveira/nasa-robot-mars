package com.nasarobot.nasarobotmars.entity;

public enum Location {
	
	NORTH("N"), SOUTH("S"), EAST ("E"), WEST("W");
	
	private String location;

	private Location(String location) {
		this.location = location;
	}

	public String getLocation() {
		return this.location;
	}
}
