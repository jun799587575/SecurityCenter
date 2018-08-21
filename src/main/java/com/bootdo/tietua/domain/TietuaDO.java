package com.bootdo.tietua.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:13:25
 */
public class TietuaDO implements Serializable {
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
