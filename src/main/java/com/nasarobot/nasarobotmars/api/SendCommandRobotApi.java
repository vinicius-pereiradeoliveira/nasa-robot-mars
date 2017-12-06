package com.nasarobot.nasarobotmars.api;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nasarobot.nasarobotmars.service.RobotWalkingService;

@RestController
@RequestMapping("/rest")
public class SendCommandRobotApi {

	@Autowired
	private RobotWalkingService robotWalkingService;
	
	@PostMapping(value="/mars/{command}")
	public ResponseEntity<?> sendCommand(@PathVariable String command) throws Exception {
		return ResponseEntity.ok(robotWalkingService.newCommandForRobot(command));
	}
	
	@ExceptionHandler
	void handleIllegalArgumentException(Exception e, HttpServletResponse response) throws IOException {
	    response.sendError(HttpStatus.BAD_REQUEST.value());
	}
}
