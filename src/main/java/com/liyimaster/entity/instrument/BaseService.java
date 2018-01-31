package com.liyimaster.entity.instrument;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService <T extends BaseDal>{
	@Autowired
	protected T dal;

}
