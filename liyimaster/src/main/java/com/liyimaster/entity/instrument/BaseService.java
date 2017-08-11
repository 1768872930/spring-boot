package com.liyimaster.entity.instrument;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.liyimaster.entity.user.user;

public class BaseService <T extends BaseDal>{
	@Autowired
	protected T dal;

}
