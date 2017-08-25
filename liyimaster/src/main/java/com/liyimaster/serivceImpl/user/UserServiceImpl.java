package com.liyimaster.serivceImpl.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liyimaster.dal.user.UserDal;
import com.liyimaster.entity.user.user;
import com.liyimaster.service.user.UserSerivce;

@Repository
public class UserServiceImpl implements UserSerivce {
	@Autowired
	private UserDal userdal;

	@Override
	public List<user> query() {
		return userdal.query();
	}

}
