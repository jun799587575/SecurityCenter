package com.bootdo.complaintl.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 10:06:01
 */
public class ComplaintlDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Integer id;
	//
	private String title;
	//
	private String content;
	//
	private Date times;
	//
	private String configure;
	//
	private String service;
	//
	private String user;

	/**
	 * 设置：编号
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：编号
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：
	 */
	public void setTimes(Date times) {
		this.times = times;
	}
	/**
	 * 获取：
	 */
	public Date getTimes() {
		return times;
	}
	/**
	 * 设置：
	 */
	public void setConfigure(String configure) {
		this.configure = configure;
	}
	/**
	 * 获取：
	 */
	public String getConfigure() {
		return configure;
	}
	/**
	 * 设置：
	 */
	public void setService(String service) {
		this.service = service;
	}
	/**
	 * 获取：
	 */
	public String getService() {
		return service;
	}
	/**
	 * 设置：
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * 获取：
	 */
	public String getUser() {
		return user;
	}
}
