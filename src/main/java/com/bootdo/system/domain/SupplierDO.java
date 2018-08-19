package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:20
 */
public class SupplierDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer conId;
	//
	private String conName;
	//
	private Integer conState;
	//
	private Integer conType;
	//
	private String conDescribe;

	/**
	 * 设置：
	 */
	public void setConId(Integer conId) {
		this.conId = conId;
	}
	/**
	 * 获取：
	 */
	public Integer getConId() {
		return conId;
	}
	/**
	 * 设置：
	 */
	public void setConName(String conName) {
		this.conName = conName;
	}
	/**
	 * 获取：
	 */
	public String getConName() {
		return conName;
	}
	/**
	 * 设置：
	 */
	public void setConState(Integer conState) {
		this.conState = conState;
	}
	/**
	 * 获取：
	 */
	public Integer getConState() {
		return conState;
	}
	/**
	 * 设置：
	 */
	public void setConType(Integer conType) {
		this.conType = conType;
	}
	/**
	 * 获取：
	 */
	public Integer getConType() {
		return conType;
	}
	/**
	 * 设置：
	 */
	public void setConDescribe(String conDescribe) {
		this.conDescribe = conDescribe;
	}
	/**
	 * 获取：
	 */
	public String getConDescribe() {
		return conDescribe;
	}
}
