package com.bootdo.fractionTo.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 23:08:41
 */
public class FractiontoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Integer id;
	//
	private String achievement;
	//
	private String ability;
	//
	private String attitude;
	//
	private String improve;
	//
	private String duty;

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
	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}
	/**
	 * 获取：
	 */
	public String getAchievement() {
		return achievement;
	}
	/**
	 * 设置：
	 */
	public void setAbility(String ability) {
		this.ability = ability;
	}
	/**
	 * 获取：
	 */
	public String getAbility() {
		return ability;
	}
	/**
	 * 设置：
	 */
	public void setAttitude(String attitude) {
		this.attitude = attitude;
	}
	/**
	 * 获取：
	 */
	public String getAttitude() {
		return attitude;
	}
	/**
	 * 设置：
	 */
	public void setImprove(String improve) {
		this.improve = improve;
	}
	/**
	 * 获取：
	 */
	public String getImprove() {
		return improve;
	}
	/**
	 * 设置：
	 */
	public void setDuty(String duty) {
		this.duty = duty;
	}
	/**
	 * 获取：
	 */
	public String getDuty() {
		return duty;
	}
}
