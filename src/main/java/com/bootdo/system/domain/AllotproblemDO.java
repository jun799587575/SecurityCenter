package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 17:08:46
 */
public class AllotproblemDO implements Serializable {
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
	private String queAllot;

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
	public void setQueAllot(String queAllot) {
		this.queAllot = queAllot;
	}
	/**
	 * 获取：
	 */
	public String getQueAllot() {
		return queAllot;
	}
}
