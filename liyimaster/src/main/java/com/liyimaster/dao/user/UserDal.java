package com.liyimaster.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.liyimaster.entity.user.user;

@Repository
public interface UserDal {

	List<user> query();

}
