package com.nasarobot.nasarobotmars.api.test;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.nasarobot.nasarobotmars.api.SendCommandRobotApi;
import com.nasarobot.nasarobotmars.service.RobotWalkingService;

@WebMvcTest(SendCommandRobotApi.class)
@RunWith(SpringRunner.class)
public class SendCommandRobotApiMockTest {

	@Autowired 
	private MockMvc mockMvc;
	
	@MockBean
    private RobotWalkingService walkingService;
	
	final String BASE_PATH = "/rest/mars";
	
	@Test
    public void testPostCommandForRobotMock() throws Exception {
    	given(walkingService.newCommandForRobot((anyString()))).willReturn(anyString());

        mockMvc.perform(post(BASE_PATH+"/MML")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
	
}
