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
	public void setLocation(Location location) {
		this.location = location;
	}
	public Integer getPositionx() {
		return positionx;
	}
	public void setPositionx(Integer positionx) {
		this.positionx = positionx;
	}
	public Integer getPositiony() {
		return positiony;
	}
	public void setPositiony(Integer positiony) {
		this.positiony = positiony;
	}

	@Override
	public String toString() {
		return "CalcCurrentPosition [positionx=" + positionx + ", positiony=" + positiony + ", location=" + location
				+ "]";
	}
	
	
}
