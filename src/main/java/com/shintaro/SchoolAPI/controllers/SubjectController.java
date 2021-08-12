package com.shintaro.SchoolAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.SchoolAPI.entitys.subject.SubjectEntity;
import com.shintaro.SchoolAPI.entitys.subject.SubjectRepository;
import com.shintaro.SchoolAPI.entitys.subject.SubjectService;
import com.shintaro.SchoolAPI.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/subject")
@Api(tags = "Subject",description = " ")
public class SubjectController implements Controller<SubjectEntity,SubjectRepository,SubjectService> {
	
	private final SubjectService service;
	
	@Autowired
	public SubjectController(SubjectService service) {
		this.service = service;
	}

	@Override
	public SubjectService getService() {
		return service;
	}

}
