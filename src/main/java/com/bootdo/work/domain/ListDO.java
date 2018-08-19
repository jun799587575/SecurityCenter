package com.bootdo.work.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author jundada
 * @email 1992lcg@163.com
 * @date 2018-08-14 16:06:13
 */
public class ListDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//工单号
	private String workId;
	//提报人
	private String workJournalist;
	//提报时间
	private Date workJournalistTime;
	//状态
	private String workState;
	//处理人员
	private String workHandlingPersonnel;
	//事件级别
	private String workEventLevel;
	//服务类别
	private String workServiceCategory;
	//来源
	private String workSource;

	/**
	 * 设置：工单号
	 */
	public void setWorkId(String workId) {
		this.workId = workId;
	}
	/**
	 * 获取：工单号
	 */
	public String getWorkId() {
		return workId;
	}
	/**
	 * 设置：提报人
	 */
	public void setWorkJournalist(String workJournalist) {
		this.workJournalist = workJournalist;
	}
	/**
	 * 获取：提报人
	 */
	public String getWorkJournalist() {
		return workJournalist;
	}
	/**
	 * 设置：提报时间
	 */
	public void setWorkJournalistTime(Date workJournalistTime) {
		this.workJournalistTime = workJournalistTime;
	}
	/**
	 * 获取：提报时间
	 */
	public Date getWorkJournalistTime() {
		return workJournalistTime;
	}
	/**
	 * 设置：状态
	 */
	public void setWorkState(String workState) {
		this.workState = workState;
	}
	/**
	 * 获取：状态
	 */
	public String getWorkState() {
		return workState;
	}
	/**
	 * 设置：处理人员
	 */
	public void setWorkHandlingPersonnel(String workHandlingPersonnel) {
		this.workHandlingPersonnel = workHandlingPersonnel;
	}
	/**
	 * 获取：处理人员
	 */
	public String getWorkHandlingPersonnel() {
		return workHandlingPersonnel;
	}
	/**
	 * 设置：事件级别
	 */
	public void setWorkEventLevel(String workEventLevel) {
		this.workEventLevel = workEventLevel;
	}
	/**
	 * 获取：事件级别
	 */
	public String getWorkEventLevel() {
		return workEventLevel;
	}
	/**
	 * 设置：服务类别
	 */
	public void setWorkServiceCategory(String workServiceCategory) {
		this.workServiceCategory = workServiceCategory;
	}
	/**
	 * 获取：服务类别
	 */
	public String getWorkServiceCategory() {
		return workServiceCategory;
	}
	/**
	 * 设置：来源
	 */
	public void setWorkSource(String workSource) {
		this.workSource = workSource;
	}
	/**
	 * 获取：来源
	 */
	public String getWorkSource() {
		return workSource;
	}
}
