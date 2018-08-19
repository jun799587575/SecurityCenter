package com.bootdo.worker.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 14:04:31
 */
public class ListerDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer workId;
	//工单号
	private Integer workNumber;
	//处理人
	private String processingPerson;
	//提交时间
	private Date timeOfSubmission;
	//级别
	private String level;
	//提交人
	private String submitter;
	//服务类别
	private String serviceCategory;
	//事件级别
	private String eventLevel;
	//配置项
	private String configurationItem;
	//事件描述
	private String eventDescription;
	//sla
	private String sla;

	/**
	 * 设置：ID
	 */
	public void setWorkId(Integer workId) {
		this.workId = workId;
	}
	/**
	 * 获取：ID
	 */
	public Integer getWorkId() {
		return workId;
	}
	/**
	 * 设置：工单号
	 */
	public void setWorkNumber(Integer workNumber) {
		this.workNumber = workNumber;
	}
	/**
	 * 获取：工单号
	 */
	public Integer getWorkNumber() {
		return workNumber;
	}
	/**
	 * 设置：处理人
	 */
	public void setProcessingPerson(String processingPerson) {
		this.processingPerson = processingPerson;
	}
	/**
	 * 获取：处理人
	 */
	public String getProcessingPerson() {
		return processingPerson;
	}
	/**
	 * 设置：提交时间
	 */
	public void setTimeOfSubmission(Date timeOfSubmission) {
		this.timeOfSubmission = timeOfSubmission;
	}
	/**
	 * 获取：提交时间
	 */
	public Date getTimeOfSubmission() {
		return timeOfSubmission;
	}
	/**
	 * 设置：级别
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * 获取：级别
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * 设置：提交人
	 */
	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}
	/**
	 * 获取：提交人
	 */
	public String getSubmitter() {
		return submitter;
	}
	/**
	 * 设置：服务类别
	 */
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	/**
	 * 获取：服务类别
	 */
	public String getServiceCategory() {
		return serviceCategory;
	}
	/**
	 * 设置：事件级别
	 */
	public void setEventLevel(String eventLevel) {
		this.eventLevel = eventLevel;
	}
	/**
	 * 获取：事件级别
	 */
	public String getEventLevel() {
		return eventLevel;
	}
	/**
	 * 设置：配置项
	 */
	public void setConfigurationItem(String configurationItem) {
		this.configurationItem = configurationItem;
	}
	/**
	 * 获取：配置项
	 */
	public String getConfigurationItem() {
		return configurationItem;
	}
	/**
	 * 设置：事件描述
	 */
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	/**
	 * 获取：事件描述
	 */
	public String getEventDescription() {
		return eventDescription;
	}
	/**
	 * 设置：sla
	 */
	public void setSla(String sla) {
		this.sla = sla;
	}
	/**
	 * 获取：sla
	 */
	public String getSla() {
		return sla;
	}
}
