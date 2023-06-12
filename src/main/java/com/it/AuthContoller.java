package com.it;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.controller.AppResponse;
import com.it.controller.UserDTO;


@RestController
@RequestMapping("/v4")
@CrossOrigin("*")
public class AuthContoller {
	
	@PostMapping("/auth")
	public AppResponse authUser(@RequestBody UserDTO userDTO) {
		AppResponse appResponse=new AppResponse();
		if("jack".equalsIgnoreCase(userDTO.getUsername())  && "jill".equalsIgnoreCase(userDTO.getPassword())) {
			appResponse.setCode("200");
			appResponse.setMessage("Hey username and password are correct!");			
		}else {
			appResponse.setCode("400");
			appResponse.setMessage("Sorry username and password are not correct!");
		}
		return appResponse;
	}

}
