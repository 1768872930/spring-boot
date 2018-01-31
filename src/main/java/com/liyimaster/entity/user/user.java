package com.liyimaster.entity.user;

import java.io.Serializable;

public class user implements Serializable {

	/**
	 * @Data By 2017年7月6日 下午5:20:16
	 */
	private static final long serialVersionUID = -7387035020409490229L;

	private String uuid;

	private String name;

	private String eamil;

	private String password;

	private String salt;

	private Integer mobilenumber;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Integer getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Integer mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	

}
