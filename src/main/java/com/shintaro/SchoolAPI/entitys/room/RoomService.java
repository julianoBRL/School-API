package com.shintaro.SchoolAPI.entitys.room;

import com.shintaro.SchoolAPI.generic.Service;

@org.springframework.stereotype.Service
public class RoomService extends Service<RoomEntity,RoomRepository>{

	protected RoomService(RoomRepository repository) {
		super(repository);
	}

}
