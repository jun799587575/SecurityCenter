package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:40
 */
public class LinkmenDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer linId;
	//
	private String linName;
	//
	private Integer inState;
	//
	private Integer linType;
	//
	private String linDescribe;

	/**
	 * 设置：
	 */
	public void setLinId(Integer linId) {
		this.linId = linId;
	}
	/**
	 * 获取：
	 */
	public Integer getLinId() {
		return linId;
	}
	/**
	 * 设置：
	 */
	public void setLinName(String linName) {
		this.linName = linName;
	}
	/**
	 * 获取：
	 */
	public String getLinName() {
		return linName;
	}
	/**
	 * 设置：
	 */
	public void setInState(Integer inState) {
		this.inState = inState;
	}
	/**
	 * 获取：
	 */
	public Integer getInState() {
		return inState;
	}
	/**
	 * 设置：
	 */
	public void setLinType(Integer linType) {
		this.linType = linType;
	}
	/**
	 * 获取：
	 */
	public Integer getLinType() {
		return linType;
	}
	/**
	 * 设置：
	 */
	public void setLinDescribe(String linDescribe) {
		this.linDescribe = linDescribe;
	}
	/**
	 * 获取：
	 */
	public String getLinDescribe() {
		return linDescribe;
	}
}
