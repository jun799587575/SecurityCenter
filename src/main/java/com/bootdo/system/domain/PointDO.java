package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 13:35:27
 */
public class PointDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer queId;
	//
	private String queName;
	//
	private Integer queOrganization;
	//
	private Integer queState;
	//
	private Integer quePriority;
	//
	private String queManage;
	//
	private String queSbumanage;
	//
	private String queDispose;
	//
	private String queQuestion;
	//
	private String quePoint;

	/**
	 * 设置：
	 */
	public void setQueId(Integer queId) {
		this.queId = queId;
	}
	/**
	 * 获取：
	 */
	public Integer getQueId() {
		return queId;
	}
	/**
	 * 设置：
	 */
	public void setQueName(String queName) {
		this.queName = queName;
	}
	/**
	 * 获取：
	 */
	public String getQueName() {
		return queName;
	}
	/**
	 * 设置：
	 */
	public void setQueOrganization(Integer queOrganization) {
		this.queOrganization = queOrganization;
	}
	/**
	 * 获取：
	 */
	public Integer getQueOrganization() {
		return queOrganization;
	}
	/**
	 * 设置：
	 */
	public void setQueState(Integer queState) {
		this.queState = queState;
	}
	/**
	 * 获取：
	 */
	public Integer getQueState() {
		return queState;
	}
	/**
	 * 设置：
	 */
	public void setQuePriority(Integer quePriority) {
		this.quePriority = quePriority;
	}
	/**
	 * 获取：
	 */
	public Integer getQuePriority() {
		return quePriority;
	}
	/**
	 * 设置：
	 */
	public void setQueManage(String queManage) {
		this.queManage = queManage;
	}
	/**
	 * 获取：
	 */
	public String getQueManage() {
		return queManage;
	}
	/**
	 * 设置：
	 */
	public void setQueSbumanage(String queSbumanage) {
		this.queSbumanage = queSbumanage;
	}
	/**
	 * 获取：
	 */
	public String getQueSbumanage() {
		return queSbumanage;
	}
	/**
	 * 设置：
	 */
	public void setQueDispose(String queDispose) {
		this.queDispose = queDispose;
	}
	/**
	 * 获取：
	 */
	public String getQueDispose() {
		return queDispose;
	}
	/**
	 * 设置：
	 */
	public void setQueQuestion(String queQuestion) {
		this.queQuestion = queQuestion;
	}
	/**
	 * 获取：
	 */
	public String getQueQuestion() {
		return queQuestion;
	}
	/**
	 * 设置：
	 */
	public void setQuePoint(String quePoint) {
		this.quePoint = quePoint;
	}
	/**
	 * 获取：
	 */
	public String getQuePoint() {
		return quePoint;
	}
}
