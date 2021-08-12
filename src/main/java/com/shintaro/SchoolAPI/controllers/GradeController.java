package com.shintaro.SchoolAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.SchoolAPI.entitys.grade.GradeEntity;
import com.shintaro.SchoolAPI.entitys.grade.GradeRepository;
import com.shintaro.SchoolAPI.entitys.grade.GradeService;
import com.shintaro.SchoolAPI.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/grade")
@Api(tags = "Grade",description = " ")
public class GradeController implements Controller<GradeEntity, GradeRepository, GradeService> {

	private final GradeService service;
	
	@Autowired
	public GradeController(GradeService service) {
		this.service = service;
	}
	
	@Override
	public GradeService getService() {
		return service;
	}

}
