package com.sodam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sodam.service.PointService;

@RestController
@RequestMapping("/point")
public class PointController {
	@Autowired
	PointService point_service;
	
	
}
