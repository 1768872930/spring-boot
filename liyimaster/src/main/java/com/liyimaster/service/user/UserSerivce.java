package com.liyimaster.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liyimaster.entity.user.user;

@Service
public interface UserSerivce{
	List<user> query();
	
}
