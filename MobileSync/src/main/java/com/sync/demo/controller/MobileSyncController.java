package com.sync.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sync.demo.model.InputRequest;

import io.swagger.annotations.Api;
@Api(value = "MobileSyncApi", description = "Received All the message from Android application and Persists the data in database")
@RestController("/MobileSyncApi")
public class MobileSyncController {
	
	@PostMapping("/receiveMessage")
	public InputRequest receiveMessage(InputRequest inputRequest)
	{
		System.out.println("MessageReceived"+inputRequest.toString());
		
		return inputRequest;
	}

}
