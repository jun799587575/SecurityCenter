package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:59:38
 */
public class AmanageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String slaId;
	//
	private String slaName;
	//sla供应商
	private String slaSupplier;
	//sla描述
	private String slaDescribe;

	/**
	 * 设置：
	 */
	public void setSlaId(String slaId) {
		this.slaId = slaId;
	}
	/**
	 * 获取：
	 */
	public String getSlaId() {
		return slaId;
	}
	/**
	 * 设置：
	 */
	public void setSlaName(String slaName) {
		this.slaName = slaName;
	}
	/**
	 * 获取：
	 */
	public String getSlaName() {
		return slaName;
	}
	/**
	 * 设置：sla供应商
	 */
	public void setSlaSupplier(String slaSupplier) {
		this.slaSupplier = slaSupplier;
	}
	/**
	 * 获取：sla供应商
	 */
	public String getSlaSupplier() {
		return slaSupplier;
	}
	/**
	 * 设置：sla描述
	 */
	public void setSlaDescribe(String slaDescribe) {
		this.slaDescribe = slaDescribe;
	}
	/**
	 * 获取：sla描述
	 */
	public String getSlaDescribe() {
		return slaDescribe;
	}
}
