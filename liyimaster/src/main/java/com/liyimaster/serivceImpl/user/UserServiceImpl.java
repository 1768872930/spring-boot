package com.liyimaster.serivceImpl.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.liyimaster.entity.instrument.BaseDal;
import com.liyimaster.entity.user.user;

@Repository
public class UserServiceImpl extends BaseDal {
	public List<user> quer() {
		List<user> user = new ArrayList<user>();
		return user;
	}

}
