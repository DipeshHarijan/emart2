package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entities.Seller;
import com.cts.entities.User;
import com.cts.service.SellerService;
import com.cts.service.UserService;

@RestController
@RequestMapping(value = "/seller")
public class SellerController {
	

	@Autowired
	SellerService sellerService;
	
	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.POST, value = "/signup")
	void addSeller(@RequestBody Seller seller) {
		seller.setUser(new User("","","SELLER"));
		sellerService.addSeller(seller);
	}

}
