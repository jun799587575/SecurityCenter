package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 13:57:03
 */
public class ProblemDO implements Serializable {
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
	private Date queStart;
	//
	private Date queEnd;
	//
	private String queInitiator;
	//
	private Integer queRelevance;
	//
	private Integer queScope;
	//
	private Integer queDegree;
	//
	private String queDescribe;
	//
	private String queLog;

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
	public void setQueStart(Date queStart) {
		this.queStart = queStart;
	}
	/**
	 * 获取：
	 */
	public Date getQueStart() {
		return queStart;
	}
	/**
	 * 设置：
	 */
	public void setQueEnd(Date queEnd) {
		this.queEnd = queEnd;
	}
	/**
	 * 获取：
	 */
	public Date getQueEnd() {
		return queEnd;
	}
	/**
	 * 设置：
	 */
	public void setQueInitiator(String queInitiator) {
		this.queInitiator = queInitiator;
	}
	/**
	 * 获取：
	 */
	public String getQueInitiator() {
		return queInitiator;
	}
	/**
	 * 设置：
	 */
	public void setQueRelevance(Integer queRelevance) {
		this.queRelevance = queRelevance;
	}
	/**
	 * 获取：
	 */
	public Integer getQueRelevance() {
		return queRelevance;
	}
	/**
	 * 设置：
	 */
	public void setQueScope(Integer queScope) {
		this.queScope = queScope;
	}
	/**
	 * 获取：
	 */
	public Integer getQueScope() {
		return queScope;
	}
	/**
	 * 设置：
	 */
	public void setQueDegree(Integer queDegree) {
		this.queDegree = queDegree;
	}
	/**
	 * 获取：
	 */
	public Integer getQueDegree() {
		return queDegree;
	}
	/**
	 * 设置：
	 */
	public void setQueDescribe(String queDescribe) {
		this.queDescribe = queDescribe;
	}
	/**
	 * 获取：
	 */
	public String getQueDescribe() {
		return queDescribe;
	}
	/**
	 * 设置：
	 */
	public void setQueLog(String queLog) {
		this.queLog = queLog;
	}
	/**
	 * 获取：
	 */
	public String getQueLog() {
		return queLog;
	}
}
