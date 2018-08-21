package com.bootdo.complaintr.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 11:19:14
 */
public class ComplaintrDO implements Serializable {
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
	//解决方案
	private String programme;
	//满意度
	private String score;

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
	/**
	 * 设置：解决方案
	 */
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	/**
	 * 获取：解决方案
	 */
	public String getProgramme() {
		return programme;
	}
	/**
	 * 设置：满意度
	 */
	public void setScore(String score) {
		this.score = score;
	}
	/**
	 * 获取：满意度
	 */
	public String getScore() {
		return score;
	}
}
