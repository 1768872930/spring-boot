package com.liyimaster.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.liyimaster.entity.instrument.BaseResult;
import com.liyimaster.entity.instrument.ResponseResult;
import com.liyimaster.service.user.UserSerivce;
/**
 * 登陆
 * @author hand
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserSerivce userSerivce;
	
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String quer() {
        userSerivce.query();
        return null;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> test() {
    	BaseResult object = new BaseResult();
        System.out.println("ok");
        return ResponseResult.requestok(object);
    }

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public ModelAndView init() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login.jsp");
        mv.addObject("update", "over");
        return mv;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> login(){
    	return null;
    }
}
