package com.bootdo.engineer.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 09:59:46
 */
public class EngineerDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Integer id;
	//姓名
	private String engineerName;
	//工号
	private Integer workNumber;
	//
	private String deptId;
	//
	private String post;
	//
	private String grade;
	//
	private String phone;
	//
	private String email;
	//
	private Integer engineerMatching;
	//
	private String adress;
	//
	private String engineerState;
	//
	private String sex;
	//
	private String brithday;
	//
	private Integer judge;

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
	 * 设置：姓名
	 */
	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}
	/**
	 * 获取：姓名
	 */
	public String getEngineerName() {
		return engineerName;
	}
	/**
	 * 设置：工号
	 */
	public void setWorkNumber(Integer workNumber) {
		this.workNumber = workNumber;
	}
	/**
	 * 获取：工号
	 */
	public Integer getWorkNumber() {
		return workNumber;
	}
	/**
	 * 设置：
	 */
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	/**
	 * 获取：
	 */
	public String getDeptId() {
		return deptId;
	}
	/**
	 * 设置：
	 */
	public void setPost(String post) {
		this.post = post;
	}
	/**
	 * 获取：
	 */
	public String getPost() {
		return post;
	}
	/**
	 * 设置：
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * 获取：
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * 设置：
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setEngineerMatching(Integer engineerMatching) {
		this.engineerMatching = engineerMatching;
	}
	/**
	 * 获取：
	 */
	public Integer getEngineerMatching() {
		return engineerMatching;
	}
	/**
	 * 设置：
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	/**
	 * 获取：
	 */
	public String getAdress() {
		return adress;
	}
	/**
	 * 设置：
	 */
	public void setEngineerState(String engineerState) {
		this.engineerState = engineerState;
	}
	/**
	 * 获取：
	 */
	public String getEngineerState() {
		return engineerState;
	}
	/**
	 * 设置：
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：
	 */
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	/**
	 * 获取：
	 */
	public String getBrithday() {
		return brithday;
	}
	/**
	 * 设置：
	 */
	public void setJudge(Integer judge) {
		this.judge = judge;
	}
	/**
	 * 获取：
	 */
	public Integer getJudge() {
		return judge;
	}
}
