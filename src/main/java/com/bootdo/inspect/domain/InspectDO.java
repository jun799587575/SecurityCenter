package com.bootdo.inspect.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:35:08
 */
public class InspectDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer inspectId;
	//检查月度
	private String inspectMonthly;
	//服务类型
	private String inspectType;
	//开始时间
	private Date inspectStart;
	//结束时间
	private Date inspectEnd;
	//描述
	private String inspectDescribe;
	//客户名称
	private String inspectName;
	//服务电话号码
	private Integer serviceCallNo;
	//合同号
	private Integer contractNo;
	//机器型号
	private Integer machineModel;
	//设备序列号
	private Integer deviceSerialNumber;
	//检查的内容描述
	private String testDesdescribe;
	//本次检查发现的问题
	private String inspectProblem;
	//工作步骤与内容
	private String stepContent;
	//已经完成的工作
	private String finishWork;
	//等待完成的工作
	private String waiteWork;
	//下一步工作计划
	private String workPlan;

	/**
	 * 设置：ID
	 */
	public void setInspectId(Integer inspectId) {
		this.inspectId = inspectId;
	}
	/**
	 * 获取：ID
	 */
	public Integer getInspectId() {
		return inspectId;
	}
	/**
	 * 设置：检查月度
	 */
	public void setInspectMonthly(String inspectMonthly) {
		this.inspectMonthly = inspectMonthly;
	}
	/**
	 * 获取：检查月度
	 */
	public String getInspectMonthly() {
		return inspectMonthly;
	}
	/**
	 * 设置：服务类型
	 */
	public void setInspectType(String inspectType) {
		this.inspectType = inspectType;
	}
	/**
	 * 获取：服务类型
	 */
	public String getInspectType() {
		return inspectType;
	}
	/**
	 * 设置：开始时间
	 */
	public void setInspectStart(Date inspectStart) {
		this.inspectStart = inspectStart;
	}
	/**
	 * 获取：开始时间
	 */
	public Date getInspectStart() {
		return inspectStart;
	}
	/**
	 * 设置：结束时间
	 */
	public void setInspectEnd(Date inspectEnd) {
		this.inspectEnd = inspectEnd;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getInspectEnd() {
		return inspectEnd;
	}
	/**
	 * 设置：描述
	 */
	public void setInspectDescribe(String inspectDescribe) {
		this.inspectDescribe = inspectDescribe;
	}
	/**
	 * 获取：描述
	 */
	public String getInspectDescribe() {
		return inspectDescribe;
	}
	/**
	 * 设置：客户名称
	 */
	public void setInspectName(String inspectName) {
		this.inspectName = inspectName;
	}
	/**
	 * 获取：客户名称
	 */
	public String getInspectName() {
		return inspectName;
	}
	/**
	 * 设置：服务电话号码
	 */
	public void setServiceCallNo(Integer serviceCallNo) {
		this.serviceCallNo = serviceCallNo;
	}
	/**
	 * 获取：服务电话号码
	 */
	public Integer getServiceCallNo() {
		return serviceCallNo;
	}
	/**
	 * 设置：合同号
	 */
	public void setContractNo(Integer contractNo) {
		this.contractNo = contractNo;
	}
	/**
	 * 获取：合同号
	 */
	public Integer getContractNo() {
		return contractNo;
	}
	/**
	 * 设置：机器型号
	 */
	public void setMachineModel(Integer machineModel) {
		this.machineModel = machineModel;
	}
	/**
	 * 获取：机器型号
	 */
	public Integer getMachineModel() {
		return machineModel;
	}
	/**
	 * 设置：设备序列号
	 */
	public void setDeviceSerialNumber(Integer deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}
	/**
	 * 获取：设备序列号
	 */
	public Integer getDeviceSerialNumber() {
		return deviceSerialNumber;
	}
	/**
	 * 设置：检查的内容描述
	 */
	public void setTestDesdescribe(String testDesdescribe) {
		this.testDesdescribe = testDesdescribe;
	}
	/**
	 * 获取：检查的内容描述
	 */
	public String getTestDesdescribe() {
		return testDesdescribe;
	}
	/**
	 * 设置：本次检查发现的问题
	 */
	public void setInspectProblem(String inspectProblem) {
		this.inspectProblem = inspectProblem;
	}
	/**
	 * 获取：本次检查发现的问题
	 */
	public String getInspectProblem() {
		return inspectProblem;
	}
	/**
	 * 设置：工作步骤与内容
	 */
	public void setStepContent(String stepContent) {
		this.stepContent = stepContent;
	}
	/**
	 * 获取：工作步骤与内容
	 */
	public String getStepContent() {
		return stepContent;
	}
	/**
	 * 设置：已经完成的工作
	 */
	public void setFinishWork(String finishWork) {
		this.finishWork = finishWork;
	}
	/**
	 * 获取：已经完成的工作
	 */
	public String getFinishWork() {
		return finishWork;
	}
	/**
	 * 设置：等待完成的工作
	 */
	public void setWaiteWork(String waiteWork) {
		this.waiteWork = waiteWork;
	}
	/**
	 * 获取：等待完成的工作
	 */
	public String getWaiteWork() {
		return waiteWork;
	}
	/**
	 * 设置：下一步工作计划
	 */
	public void setWorkPlan(String workPlan) {
		this.workPlan = workPlan;
	}
	/**
	 * 获取：下一步工作计划
	 */
	public String getWorkPlan() {
		return workPlan;
	}
}
