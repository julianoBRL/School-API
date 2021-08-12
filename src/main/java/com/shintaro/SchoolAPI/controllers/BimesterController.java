package com.shintaro.SchoolAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.SchoolAPI.entitys.bimester.BimesterEntity;
import com.shintaro.SchoolAPI.entitys.bimester.BimesterRepository;
import com.shintaro.SchoolAPI.entitys.bimester.BimesterService;
import com.shintaro.SchoolAPI.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/bimester")
@Api(tags = "Bimester",description = " ")
public class BimesterController implements Controller<BimesterEntity, BimesterRepository, BimesterService> {
	
	private final BimesterService service;
	
	@Autowired
	public BimesterController(BimesterService service) {
		this.service = service;
	}

	@Override
	public BimesterService getService() {
		return service;
	}

}
