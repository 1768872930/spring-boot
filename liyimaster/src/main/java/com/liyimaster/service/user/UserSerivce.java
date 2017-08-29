package com.liyimaster.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyimaster.dao.user.UserDal;
import com.liyimaster.entity.user.user;

@Service
public class UserSerivce {
	@Autowired
	private UserDal userdal;

	public List<user> query() {
		return userdal.query();
	}

}
