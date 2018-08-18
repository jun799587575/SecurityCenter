package com.bootdo.fraction.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 17:45:59
 */
public class FractionDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String name;
	//
	private String ido;
	//
	private Integer achievement;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setIdo(String ido) {
		this.ido = ido;
	}
	/**
	 * 获取：
	 */
	public String getIdo() {
		return ido;
	}
	/**
	 * 设置：
	 */
	public void setAchievement(Integer achievement) {
		this.achievement = achievement;
	}
	/**
	 * 获取：
	 */
	public Integer getAchievement() {
		return achievement;
	}
}
