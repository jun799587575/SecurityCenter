package com.bootdo.kaoheg.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 22:39:37
 */
public class KaohegDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Integer id;
	//
	private String name;
	//
	private String year;
	//
	private String mouth;
	//
	private Date time;
	//
	private String fraction;

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
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * 获取：
	 */
	public String getYear() {
		return year;
	}
	/**
	 * 设置：
	 */
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	/**
	 * 获取：
	 */
	public String getMouth() {
		return mouth;
	}
	/**
	 * 设置：
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	/**
	 * 获取：
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * 设置：
	 */
	public void setFraction(String fraction) {
		this.fraction = fraction;
	}
	/**
	 * 获取：
	 */
	public String getFraction() {
		return fraction;
	}
}
