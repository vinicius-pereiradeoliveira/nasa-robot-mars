package com.nasarobot.nasarobotmars.businessrules;

import org.springframework.stereotype.Component;

import com.nasarobot.nasarobotmars.entity.Location;
import com.nasarobot.nasarobotmars.entity.Terrain;

@Component
public class CurrentRobotPosition {

	public String searchPositionRobot(String commandInput) {
		
		Location location = Location.NORTH;
		int positionx = 0;
		int positiony = 0;
		String position = "";
		
		for (char command : commandInput.toCharArray()) {
			
			String buildRoute = executeRoute(command, location, positionx, positiony, position);
			if (!validPosition(positionx,positiony))
				new Exception("Exceeded ground boundary!");
		}
		
		return position;
	}

	private String executeRoute(char command, Location pos, Integer positionx, Integer positiony, String position) {
		
		if(command == 'M') {
			positiony++;
			position += positionx.toString()+","+positiony.toString();
		} else if (command == 'L') {
			
		} else if (command == 'R') {
			
		}
		
		return position;
		
	}

	private boolean validPosition(int positionx, int positiony) {
		return positionx < 5 && positionx < 5
				&& positiony < 5 && positiony < 5 ? true : false;
	}
	
}
