package com.liyimaster.entity.instrument;

import java.io.Serializable;
/**
 * 公共返回bean
 * @author hand
 *
 */
public class BaseResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1486203823549293081L;
	private Object body;
	private String meaasge;
	private String code;
	private Object object;

	
	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public String getMeaasge() {
		return meaasge;
	}

	public void setMeaasge(String meaasge) {
		this.meaasge = meaasge;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
