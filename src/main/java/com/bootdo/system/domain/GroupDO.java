package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:19:38
 */
public class GroupDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String serveId;
	//
	private String serveName;
	//
	private String serveRemark;

	/**
	 * 设置：
	 */
	public void setServeId(String serveId) {
		this.serveId = serveId;
	}
	/**
	 * 获取：
	 */
	public String getServeId() {
		return serveId;
	}
	/**
	 * 设置：
	 */
	public void setServeName(String serveName) {
		this.serveName = serveName;
	}
	/**
	 * 获取：
	 */
	public String getServeName() {
		return serveName;
	}
	/**
	 * 设置：
	 */
	public void setServeRemark(String serveRemark) {
		this.serveRemark = serveRemark;
	}
	/**
	 * 获取：
	 */
	public String getServeRemark() {
		return serveRemark;
	}
}
