package com.liyimaster.dal.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.liyimaster.entity.user.user;
/**
 * 登陆接口
 * @author hand
 *
 */
@Repository
public interface UserDal {

	List<user> query();

}
