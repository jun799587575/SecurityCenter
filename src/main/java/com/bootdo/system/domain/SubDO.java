package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:20:08
 */
public class SubDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String serveId;
	//子服务名称
	private String serveName;
	//服务
	private String serve;
	//服务状态
	private String serveState;
	//服务类型
	private String serveStyle;
	//供应商
	private String serveSupplier;

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
	 * 设置：子服务名称
	 */
	public void setServeName(String serveName) {
		this.serveName = serveName;
	}
	/**
	 * 获取：子服务名称
	 */
	public String getServeName() {
		return serveName;
	}
	/**
	 * 设置：服务
	 */
	public void setServe(String serve) {
		this.serve = serve;
	}
	/**
	 * 获取：服务
	 */
	public String getServe() {
		return serve;
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
	 * 设置：服务类型
	 */
	public void setServeStyle(String serveStyle) {
		this.serveStyle = serveStyle;
	}
	/**
	 * 获取：服务类型
	 */
	public String getServeStyle() {
		return serveStyle;
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
