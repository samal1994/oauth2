package com.oauthphonepe.partner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class PhonePeAccount {

	@GetMapping(value = "/{accountNo}/balance")
	public String getAccountBalance(@PathVariable("accountNo") String accountNo) {
		return "789844.49";
	}
}
