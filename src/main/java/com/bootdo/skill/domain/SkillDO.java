package com.bootdo.skill.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 14:56:24
 */
public class SkillDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Integer id;
	//
	private String skill;

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
	public void setSkill(String skill) {
		this.skill = skill;
	}
	/**
	 * 获取：
	 */
	public String getSkill() {
		return skill;
	}
}
