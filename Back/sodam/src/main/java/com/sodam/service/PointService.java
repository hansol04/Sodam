package com.sodam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sodam.repository.PointRepository;

@Service
public class PointService {
	@Autowired
	PointRepository point_repository;
}
