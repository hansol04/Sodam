package com.sodam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sodam.domain.MemberDomain;
import com.sodam.service.MemberService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberService member_service;
	
	@PostMapping("/add")
	public int add(@Valid@RequestBody MemberDomain member_domain) {
		
		return 0;
	}
	
}
