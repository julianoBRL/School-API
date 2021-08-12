package com.shintaro.SchoolAPI.entitys.history;

import java.util.List;
import java.util.UUID;

import com.shintaro.SchoolAPI.generic.Service;
import com.shintaro.SchoolAPI.utils.ClassUtils;

@org.springframework.stereotype.Service
public class HistoryService extends Service<HistoryEntity, HistoryRepository> {
	
	private HistoryRepository repository;

	protected HistoryService(HistoryRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
	@Override
	public List<HistoryEntity> list() {
		if(ClassUtils.hasRole("TEACHER"))
			return repository.findByTeacher(ClassUtils.getCourentUserID());
		return repository.findAll();
	}

}
