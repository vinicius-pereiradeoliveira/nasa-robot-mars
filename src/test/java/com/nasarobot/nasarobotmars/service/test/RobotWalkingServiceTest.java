package com.nasarobot.nasarobotmars.service.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;

import com.nasarobot.nasarobotmars.business.rules.CurrentRobotPosition;
import com.nasarobot.nasarobotmars.service.RobotWalkingService;

@RunWith(SpringRunner.class)
@WebMvcTest(RobotWalkingService.class)
public class RobotWalkingServiceTest {

	@Autowired
	private RobotWalkingService walkingService;
	
	@MockBean
	private CurrentRobotPosition currentRobotPosition;
	
	@Test
    public void mockNewCommandForRobotTest() throws Exception {
		given(currentRobotPosition.searchPositionRobot(anyString())).willReturn("0,2,W");
        String validOutput = walkingService.newCommandForRobot("MML");
        Assert.assertEquals("0,2,W",validOutput);
    }
	
	@SuppressWarnings("unused")
	@Test(expected=Exception.class)
    public void ExceptionNewCommandForRobotTest() throws Exception {
        String validOutput = walkingService.newCommandForRobot("MMAA");
    }
}
