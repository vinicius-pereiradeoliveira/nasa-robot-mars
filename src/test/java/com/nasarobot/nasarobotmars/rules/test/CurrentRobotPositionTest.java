package com.nasarobot.nasarobotmars.rules.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nasarobot.nasarobotmars.business.rules.CurrentRobotPosition;

@RunWith(SpringRunner.class)
@WebMvcTest(CurrentRobotPosition.class)
public class CurrentRobotPositionTest {

	@Autowired
	private CurrentRobotPosition currentRobotPosition;
	
	@SuppressWarnings("unused")
	@Test(expected=Exception.class)
    public void ExceptionLimitTerrainTest() throws Exception {
        String validOutput = currentRobotPosition.searchPositionRobot("MMMMMMM");
    }
	
}
