package com.nasarobot.nasarobotmars.business.rules;

import org.springframework.stereotype.Component;

import com.nasarobot.nasarobotmars.entity.CalcCurrentPosition;
import com.nasarobot.nasarobotmars.entity.Location;
import com.nasarobot.nasarobotmars.utils.ValidateUtil;

@Component
public class CurrentRobotPosition {

	public String searchPositionRobot(String commandInput) throws Exception {
		
		CalcCurrentPosition currentPosition = new CalcCurrentPosition();
		
		Location location = Location.NORTH;
		int positionx = 0;
		int positiony = 0;
		int count = 0;
		
		for (char command : commandInput.toCharArray()) {
			if (count == 0) {
				currentPosition = executeRoute(command, location, positionx, positiony);
				count++;
			} else {
				currentPosition = executeRoute(command, currentPosition.getLocation(), currentPosition.getPositionx()
						, currentPosition.getPositiony());
			}
		}
		
		return currentPosition.toString();
	}

	private CalcCurrentPosition executeRoute(char command, Location pos, Integer positionx, Integer positiony) throws Exception {
		
		if (command == 'M' && pos == Location.NORTH) {
			if (!ValidateUtil.validPosition(positionx, positiony))
				throw new Exception("Exceeded terrain boundary!");
			positiony++;
		} else if (command == 'M' && pos == Location.SOUTH) {
			if (!ValidateUtil.validPosition(positionx, positiony))
				throw new Exception("Exceeded terrain boundary!");
			positiony--;
		} else if (command == 'M' && pos == Location.EAST) {
			if (!ValidateUtil.validPosition(positionx, positiony))
				throw new Exception("Exceeded terrain boundary!");
			positionx++;
		} else if (command == 'M' && pos == Location.WEST) {
			if (!ValidateUtil.validPosition(positionx, positiony))
				throw new Exception("Exceeded terrain boundary!");
			positionx--;
		}
		
		if(command == 'L') {
			pos = changeLeft(command, pos);
		} else if(command == 'R') {
			pos = changeRight(command, pos);
		}
		
		return new CalcCurrentPosition(positionx, positiony, pos);
	}

	private Location changeRight(char command, Location pos) {
		if(pos == Location.NORTH) {
			return pos = Location.EAST;
		} else if(pos == Location.SOUTH) {
			return pos = Location.WEST;
		} else if(pos == Location.EAST) {
			return pos = Location.SOUTH;
		} else if(pos == Location.WEST) {
			return pos = Location.NORTH;
		} else {
			return pos;
		}
	}

	private Location changeLeft(char command, Location pos) {
		if(pos == Location.NORTH) {
			return pos = Location.WEST;
		} else if(pos == Location.SOUTH) {
			return pos = Location.EAST;
		} else if(pos == Location.EAST) {
			return pos = Location.NORTH;
		} else if(pos == Location.WEST) {
			return pos = Location.SOUTH;
		} else {
			return pos;
		}
	}
}
