//package com.cts.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cts.entities.User;
//import com.cts.service.UserService;
//
//@RestController
//public class UserController {
//
//	@Autowired
//	UserService service;
//
//	void addBuyer(@RequestBody User user) {
//		user.setRole("BUYER");
//		service.addUser(user);
//	}
//
//	void addSeller(@RequestBody User user) {
//		user.setRole("SELLER");
//		service.addUser(user);
//	}
//
//}
