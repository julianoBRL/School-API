package com.shintaro.SchoolAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.SchoolAPI.entitys.history.HistoryEntity;
import com.shintaro.SchoolAPI.entitys.history.HistoryRepository;
import com.shintaro.SchoolAPI.entitys.history.HistoryService;
import com.shintaro.SchoolAPI.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/history")
@Api(tags = "History",description = " ")
public class HistoryController implements Controller<HistoryEntity, HistoryRepository, HistoryService>{
	
	private final HistoryService service;
	
	@Autowired
	public HistoryController(HistoryService service) {
		this.service = service;
	}

	@Override
	public HistoryService getService() {
		return service;
	}

}
