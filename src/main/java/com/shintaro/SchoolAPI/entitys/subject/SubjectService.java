package com.shintaro.SchoolAPI.entitys.subject;

import com.shintaro.SchoolAPI.generic.Service;

@org.springframework.stereotype.Service
public class SubjectService extends Service<SubjectEntity,SubjectRepository>{

	protected SubjectService(SubjectRepository repository) {
		super(repository);
	}

}
