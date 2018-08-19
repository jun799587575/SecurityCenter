package com.bootdo.event.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 09:46:07
 */
public class ProcessingDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer eventId;
	//工单号
	private Integer jobNumber;
	//投资人
	private String person;
	//投报时间
	private Date reportingTime;
	//状态
	private String state;
	//处理人员
	private String handlingPersonnel;
	//事件级别   1（一级），2（二级），3（三级），4（四级）
	private Integer eventLevel;
	//服务类型
	private String type;
	//来源
	private String source;
	//处理内容
	private String processingContent;
	//附件
	private String enclosure;
	//任务人员
	private String missionPersonnel;
	//任务完成时间
	private Date missionCompletionTime;
	//描述
	private String describe;

	/**
	 * 设置：ID
	 */
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	/**
	 * 获取：ID
	 */
	public Integer getEventId() {
		return eventId;
	}
	/**
	 * 设置：工单号
	 */
	public void setJobNumber(Integer jobNumber) {
		this.jobNumber = jobNumber;
	}
	/**
	 * 获取：工单号
	 */
	public Integer getJobNumber() {
		return jobNumber;
	}
	/**
	 * 设置：投资人
	 */
	public void setPerson(String person) {
		this.person = person;
	}
	/**
	 * 获取：投资人
	 */
	public String getPerson() {
		return person;
	}
	/**
	 * 设置：投报时间
	 */
	public void setReportingTime(Date reportingTime) {
		this.reportingTime = reportingTime;
	}
	/**
	 * 获取：投报时间
	 */
	public Date getReportingTime() {
		return reportingTime;
	}
	/**
	 * 设置：状态
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 获取：状态
	 */
	public String getState() {
		return state;
	}
	/**
	 * 设置：处理人员
	 */
	public void setHandlingPersonnel(String handlingPersonnel) {
		this.handlingPersonnel = handlingPersonnel;
	}
	/**
	 * 获取：处理人员
	 */
	public String getHandlingPersonnel() {
		return handlingPersonnel;
	}
	/**
	 * 设置：事件级别   1（一级），2（二级），3（三级），4（四级）
	 */
	public void setEventLevel(Integer eventLevel) {
		this.eventLevel = eventLevel;
	}
	/**
	 * 获取：事件级别   1（一级），2（二级），3（三级），4（四级）
	 */
	public Integer getEventLevel() {
		return eventLevel;
	}
	/**
	 * 设置：服务类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：服务类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：来源
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * 获取：来源
	 */
	public String getSource() {
		return source;
	}
	/**
	 * 设置：处理内容
	 */
	public void setProcessingContent(String processingContent) {
		this.processingContent = processingContent;
	}
	/**
	 * 获取：处理内容
	 */
	public String getProcessingContent() {
		return processingContent;
	}
	/**
	 * 设置：附件
	 */
	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}
	/**
	 * 获取：附件
	 */
	public String getEnclosure() {
		return enclosure;
	}
	/**
	 * 设置：任务人员
	 */
	public void setMissionPersonnel(String missionPersonnel) {
		this.missionPersonnel = missionPersonnel;
	}
	/**
	 * 获取：任务人员
	 */
	public String getMissionPersonnel() {
		return missionPersonnel;
	}
	/**
	 * 设置：任务完成时间
	 */
	public void setMissionCompletionTime(Date missionCompletionTime) {
		this.missionCompletionTime = missionCompletionTime;
	}
	/**
	 * 获取：任务完成时间
	 */
	public Date getMissionCompletionTime() {
		return missionCompletionTime;
	}
	/**
	 * 设置：描述
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * 获取：描述
	 */
	public String getDescribe() {
		return describe;
	}
}
