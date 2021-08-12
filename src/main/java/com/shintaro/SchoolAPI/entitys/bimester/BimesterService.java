package com.shintaro.SchoolAPI.entitys.bimester;

import com.shintaro.SchoolAPI.generic.Service;

@org.springframework.stereotype.Service
public class BimesterService extends Service<BimesterEntity, BimesterRepository> {

	protected BimesterService(BimesterRepository repository) {
		super(repository);
	}
}
