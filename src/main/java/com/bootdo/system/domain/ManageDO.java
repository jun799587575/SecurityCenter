package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:20:05
 */
public class ManageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//服务编号
	private String serveId;
	//服务名称
	private String serveName;
	//服务族
	private String serveGroup;
	//服务状态
	private String serveState;
	//服务描述
	private String serveDescribe;
	//供应商
	private String serveSupplier;

	/**
	 * 设置：服务编号
	 */
	public void setServeId(String serveId) {
		this.serveId = serveId;
	}
	/**
	 * 获取：服务编号
	 */
	public String getServeId() {
		return serveId;
	}
	/**
	 * 设置：服务名称
	 */
	public void setServeName(String serveName) {
		this.serveName = serveName;
	}
	/**
	 * 获取：服务名称
	 */
	public String getServeName() {
		return serveName;
	}
	/**
	 * 设置：服务族
	 */
	public void setServeGroup(String serveGroup) {
		this.serveGroup = serveGroup;
	}
	/**
	 * 获取：服务族
	 */
	public String getServeGroup() {
		return serveGroup;
	}
	/**
	 * 设置：服务状态
	 */
	public void setServeState(String serveState) {
		this.serveState = serveState;
	}
	/**
	 * 获取：服务状态
	 */
	public String getServeState() {
		return serveState;
	}
	/**
	 * 设置：服务描述
	 */
	public void setServeDescribe(String serveDescribe) {
		this.serveDescribe = serveDescribe;
	}
	/**
	 * 获取：服务描述
	 */
	public String getServeDescribe() {
		return serveDescribe;
	}
	/**
	 * 设置：供应商
	 */
	public void setServeSupplier(String serveSupplier) {
		this.serveSupplier = serveSupplier;
	}
	/**
	 * 获取：供应商
	 */
	public String getServeSupplier() {
		return serveSupplier;
	}
}
