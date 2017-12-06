package com.nasarobot.nasarobotmars.utils;

public class ValidateUtil {

	public static boolean validPosition(int positionx, int positiony) {
		return (positionx < 5 && positiony < 5) 
				&& (positionx > -1 && positiony > -1) ? true : false;
	}
	
	public static boolean validCommand(String command) {
		String commandValid = "^[MLR\\.\\,\\+\\-]*$";
		return command.matches(commandValid);
	}
	
}
