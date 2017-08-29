package com.liyimaster.controller.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.liyimaster.entity.instrument.ResponseUtil;
import com.liyimaster.entity.user.user;
import com.liyimaster.service.user.UserSerivce;
import com.liyimaster.util.config.myMV;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserSerivce userSerivce;
	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@RequestMapping(value = "/quer", method = RequestMethod.GET)
	public ResponseEntity<?> quer() {
		List<user> userList = userSerivce.query();
		log.debug("debug====");
		log.info("info====");
		log.error("error====");
		System.out.println("over");
		return ResponseUtil.requestok(userList);
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<?> test() {
		Object object = new Object();
		System.out.println("ok");
		return ResponseUtil.requestok(object);
	}

	@RequestMapping(value = "/init", method = RequestMethod.GET)
	public ModelAndView init() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/login.jsp");
		mv.addObject("update", "over");
		return mv;
	}

	public myMV test1() {
		myMV mv = new myMV();
		mv.addValue("update", "over");
		return mv;
	}

}
