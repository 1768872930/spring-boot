package com.liyimaster.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liyimaster.entity.instrument.BaseService;
import com.liyimaster.entity.user.user;
import com.liyimaster.serivceImpl.user.UserServiceImpl;

@Service
public class UserSerivce extends BaseService<UserServiceImpl> {

	public List<user> quer() {
		return super.dal.quer();
	}

}
