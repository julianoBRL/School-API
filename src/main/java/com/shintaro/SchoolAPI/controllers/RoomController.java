package com.shintaro.SchoolAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.SchoolAPI.entitys.room.RoomEntity;
import com.shintaro.SchoolAPI.entitys.room.RoomRepository;
import com.shintaro.SchoolAPI.entitys.room.RoomService;
import com.shintaro.SchoolAPI.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/room")
@Api(tags = "Room",description = " ")
public class RoomController implements Controller<RoomEntity,RoomRepository,RoomService>{
	
	private final RoomService service;

	@Override
	public RoomService getService() {
		return service;
	}
	
	@Autowired
	public RoomController(RoomService service) {
		this.service = service;
	}

}
