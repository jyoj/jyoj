package com.firststep.studentproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firststep.studentproject.registrationModel.User;
import com.firststep.studentproject.service.UserService;

@Controller
public class UserController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping("/index")
	@ResponseBody
	public String home() {
		System.out.println("mycontroller");
		
		return " student details";
	}
	@RequestMapping("/indexpage")
	public String homepage() {
		return "student";
	}
	@RequestMapping("/simplepage")
	public String simple() {
		return "simpleform";
	}
	@RequestMapping("/myform")
	public String myformpage(String user,String usermobile) {
		System.out.println(user+" "+usermobile);
		return "simpleform";
	}
	
	@RequestMapping("reg")
	public String register() {
		return "registration";
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User result = this.userService.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
		
	}
	
	@RequestMapping("searching")
	public String search() {
		return "searchingPage";
	}

	@RequestMapping("/searchUserById/{userId}")
	public ResponseEntity<User> searchUserReg(@PathVariable int userId) {
		Optional<User> findUserById = this.userService.findById(userId);
		if(findUserById.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(findUserById.get());
		
		
	}
	
}
