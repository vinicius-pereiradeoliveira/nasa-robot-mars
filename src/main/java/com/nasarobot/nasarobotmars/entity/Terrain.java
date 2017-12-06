package com.nasarobot.nasarobotmars.entity;

public class Terrain {
	
	private int positionX;
	private int positionY;
	
	public Terrain(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public Terrain() {
	}

	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	@Override
	public String toString() {
		return "TerrainMarsPosition { "
				+ "positionX=" + positionX + ", positionY=" + positionY 
				+ "}";
	}
	
	
}
