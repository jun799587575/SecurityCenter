package com.bootdo.tietuc.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:47:21
 */
public class TietucDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Integer id;

	/**
	 * 设置：id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Integer getId() {
		return id;
	}
}
