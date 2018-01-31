package com.liyimaster.entity.instrument;

import java.io.Serializable;
import java.util.Date;

/**
 * 继承实体类
 * @author hand
 * @Data By 2017年7月4日 下午6:17:47
 */
public class BaseModel implements Serializable {

	/**
	 * @Data By 2017年7月4日 下午5:37:02
	 */
	private static final long serialVersionUID = 4294541717043250480L;

	private String id;
	private String createBy;
	private String updateBy;
	private Date crateById;
	private Date updateById;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getCrateById() {
		return crateById;
	}

	public void setCrateById(Date crateById) {
		this.crateById = crateById;
	}

	public Date getUpdateById() {
		return updateById;
	}

	public void setUpdateById(Date updateById) {
		this.updateById = updateById;
	}

}
