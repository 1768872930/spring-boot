package com.liyimaster.controller.user;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liyimaster.entity.instrument.ResponseUtil;
import com.liyimaster.entity.user.user;
import com.liyimaster.service.user.UserSerivce;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserSerivce userSerivce;

	@RequestMapping(value = "/quer", method = GET)
	public ResponseEntity<?> quer() {
		List<user> userList = userSerivce.quer();
		ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<String, Object>();
		return ResponseUtil.requestok(userList);
	}

	@RequestMapping(value = "/test", method = GET)
	public String test() {
		return "ok";
	}
}
