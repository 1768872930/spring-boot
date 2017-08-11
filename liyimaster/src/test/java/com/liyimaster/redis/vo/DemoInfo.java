package com.liyimaster.redis.vo;

import java.io.Serializable;

import com.liyimaster.entity.instrument.BaseModel;


public class DemoInfo extends BaseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private String name;

	private String pwd;

}