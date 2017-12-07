package com.nasarobot.nasarobotmars.entity;

public class CalcCurrentPosition {
	
	private Integer positionx;
	private Integer positiony;
	private Location location;
	
	public CalcCurrentPosition() {
	}
	
	public CalcCurrentPosition(Integer positionx, Integer positiony, Location location) {
		this.positionx = positionx;
		this.positiony = positiony;
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public Integer getPositionx() {
		return positionx;
	}
	
	public Integer getPositiony() {
		return positiony;
	}

	@Override
	public String toString() {
		return "("+positionx+","+positiony+","+location.getLocation()+")";
	}
	
	
}
