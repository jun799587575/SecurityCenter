package com.bootdo.deploy.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:35
 */
public class IpDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer ipId;
	//名称
	private String ipName;
	//组织
	private String ipOrganization;
	//状态
	private String ipState;
	//业务级别
	private String ipLevel;
	//地理位置
	private String geographicalPosition;
	//品牌
	private String brand;
	//型号
	private String model;
	//电话号码
	private Integer telephoneNumber;
	//序列号
	private Integer serialNumber;
	//资产编号
	private Integer assetNumber;
	//投产日期
	private Date startingDate;
	//采购日期
	private Date purchaseDate;
	//过保日期
	private Date dateOfInsurance;
	//描述
	private String describe;
	//联系人
	private String contacts;
	//联系人状态
	private String contactsState;
	//联系人组织
	private String contactsOrganize;
	//联系人邮箱
	private String contactsMailbox;
	//联系人电话
	private String contactsTelephone;
	//联系人职责
	private String contactsDept;
	//文档
	private String file;
	//文档状态
	private String fileState;
	//文档组织
	private String fileOrganize;
	//文档类型
	private String fileType;
	//文档描述
	private String fileDescribe;
	//供应商合同
	private String supplierContract;
	//供应商状态
	private String supplierState;
	//供应商客户
	private String supplierCustomer;
	//供应商描述
	private String supplierDescribe;
	//供应商开始时间
	private Date supplierStartDate;
	//供应商结束时间
	private Date supplierEndTime;
	//SLA
	private String supplierSla;
	//服务时间
	private Date serviceTime;
	//服务
	private String service;
	//服务供应商
	private String serviceSupplier;
	//服务状态
	private String serviceState;
	//服务家族
	private String serviceFamily;
	//例行变更
	private String routineChange;
	//正常变更
	private String normalChange;
	//紧急变更
	private String urgentChange;
	//事件
	private String event;
	//问题
	private String problem;
	//服务请求
	private String serviceRequest;

	/**
	 * 设置：ID
	 */
	public void setIpId(Integer ipId) {
		this.ipId = ipId;
	}
	/**
	 * 获取：ID
	 */
	public Integer getIpId() {
		return ipId;
	}
	/**
	 * 设置：名称
	 */
	public void setIpName(String ipName) {
		this.ipName = ipName;
	}
	/**
	 * 获取：名称
	 */
	public String getIpName() {
		return ipName;
	}
	/**
	 * 设置：组织
	 */
	public void setIpOrganization(String ipOrganization) {
		this.ipOrganization = ipOrganization;
	}
	/**
	 * 获取：组织
	 */
	public String getIpOrganization() {
		return ipOrganization;
	}
	/**
	 * 设置：状态
	 */
	public void setIpState(String ipState) {
		this.ipState = ipState;
	}
	/**
	 * 获取：状态
	 */
	public String getIpState() {
		return ipState;
	}
	/**
	 * 设置：业务级别
	 */
	public void setIpLevel(String ipLevel) {
		this.ipLevel = ipLevel;
	}
	/**
	 * 获取：业务级别
	 */
	public String getIpLevel() {
		return ipLevel;
	}
	/**
	 * 设置：地理位置
	 */
	public void setGeographicalPosition(String geographicalPosition) {
		this.geographicalPosition = geographicalPosition;
	}
	/**
	 * 获取：地理位置
	 */
	public String getGeographicalPosition() {
		return geographicalPosition;
	}
	/**
	 * 设置：品牌
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * 获取：品牌
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * 设置：型号
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * 获取：型号
	 */
	public String getModel() {
		return model;
	}
	/**
	 * 设置：电话号码
	 */
	public void setTelephoneNumber(Integer telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	/**
	 * 获取：电话号码
	 */
	public Integer getTelephoneNumber() {
		return telephoneNumber;
	}
	/**
	 * 设置：序列号
	 */
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * 获取：序列号
	 */
	public Integer getSerialNumber() {
		return serialNumber;
	}
	/**
	 * 设置：资产编号
	 */
	public void setAssetNumber(Integer assetNumber) {
		this.assetNumber = assetNumber;
	}
	/**
	 * 获取：资产编号
	 */
	public Integer getAssetNumber() {
		return assetNumber;
	}
	/**
	 * 设置：投产日期
	 */
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	/**
	 * 获取：投产日期
	 */
	public Date getStartingDate() {
		return startingDate;
	}
	/**
	 * 设置：采购日期
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	/**
	 * 获取：采购日期
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	/**
	 * 设置：过保日期
	 */
	public void setDateOfInsurance(Date dateOfInsurance) {
		this.dateOfInsurance = dateOfInsurance;
	}
	/**
	 * 获取：过保日期
	 */
	public Date getDateOfInsurance() {
		return dateOfInsurance;
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
	/**
	 * 设置：联系人
	 */
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	/**
	 * 获取：联系人
	 */
	public String getContacts() {
		return contacts;
	}
	/**
	 * 设置：联系人状态
	 */
	public void setContactsState(String contactsState) {
		this.contactsState = contactsState;
	}
	/**
	 * 获取：联系人状态
	 */
	public String getContactsState() {
		return contactsState;
	}
	/**
	 * 设置：联系人组织
	 */
	public void setContactsOrganize(String contactsOrganize) {
		this.contactsOrganize = contactsOrganize;
	}
	/**
	 * 获取：联系人组织
	 */
	public String getContactsOrganize() {
		return contactsOrganize;
	}
	/**
	 * 设置：联系人邮箱
	 */
	public void setContactsMailbox(String contactsMailbox) {
		this.contactsMailbox = contactsMailbox;
	}
	/**
	 * 获取：联系人邮箱
	 */
	public String getContactsMailbox() {
		return contactsMailbox;
	}
	/**
	 * 设置：联系人电话
	 */
	public void setContactsTelephone(String contactsTelephone) {
		this.contactsTelephone = contactsTelephone;
	}
	/**
	 * 获取：联系人电话
	 */
	public String getContactsTelephone() {
		return contactsTelephone;
	}
	/**
	 * 设置：联系人职责
	 */
	public void setContactsDept(String contactsDept) {
		this.contactsDept = contactsDept;
	}
	/**
	 * 获取：联系人职责
	 */
	public String getContactsDept() {
		return contactsDept;
	}
	/**
	 * 设置：文档
	 */
	public void setFile(String file) {
		this.file = file;
	}
	/**
	 * 获取：文档
	 */
	public String getFile() {
		return file;
	}
	/**
	 * 设置：文档状态
	 */
	public void setFileState(String fileState) {
		this.fileState = fileState;
	}
	/**
	 * 获取：文档状态
	 */
	public String getFileState() {
		return fileState;
	}
	/**
	 * 设置：文档组织
	 */
	public void setFileOrganize(String fileOrganize) {
		this.fileOrganize = fileOrganize;
	}
	/**
	 * 获取：文档组织
	 */
	public String getFileOrganize() {
		return fileOrganize;
	}
	/**
	 * 设置：文档类型
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	/**
	 * 获取：文档类型
	 */
	public String getFileType() {
		return fileType;
	}
	/**
	 * 设置：文档描述
	 */
	public void setFileDescribe(String fileDescribe) {
		this.fileDescribe = fileDescribe;
	}
	/**
	 * 获取：文档描述
	 */
	public String getFileDescribe() {
		return fileDescribe;
	}
	/**
	 * 设置：供应商合同
	 */
	public void setSupplierContract(String supplierContract) {
		this.supplierContract = supplierContract;
	}
	/**
	 * 获取：供应商合同
	 */
	public String getSupplierContract() {
		return supplierContract;
	}
	/**
	 * 设置：供应商状态
	 */
	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}
	/**
	 * 获取：供应商状态
	 */
	public String getSupplierState() {
		return supplierState;
	}
	/**
	 * 设置：供应商客户
	 */
	public void setSupplierCustomer(String supplierCustomer) {
		this.supplierCustomer = supplierCustomer;
	}
	/**
	 * 获取：供应商客户
	 */
	public String getSupplierCustomer() {
		return supplierCustomer;
	}
	/**
	 * 设置：供应商描述
	 */
	public void setSupplierDescribe(String supplierDescribe) {
		this.supplierDescribe = supplierDescribe;
	}
	/**
	 * 获取：供应商描述
	 */
	public String getSupplierDescribe() {
		return supplierDescribe;
	}
	/**
	 * 设置：供应商开始时间
	 */
	public void setSupplierStartDate(Date supplierStartDate) {
		this.supplierStartDate = supplierStartDate;
	}
	/**
	 * 获取：供应商开始时间
	 */
	public Date getSupplierStartDate() {
		return supplierStartDate;
	}
	/**
	 * 设置：供应商结束时间
	 */
	public void setSupplierEndTime(Date supplierEndTime) {
		this.supplierEndTime = supplierEndTime;
	}
	/**
	 * 获取：供应商结束时间
	 */
	public Date getSupplierEndTime() {
		return supplierEndTime;
	}
	/**
	 * 设置：SLA
	 */
	public void setSupplierSla(String supplierSla) {
		this.supplierSla = supplierSla;
	}
	/**
	 * 获取：SLA
	 */
	public String getSupplierSla() {
		return supplierSla;
	}
	/**
	 * 设置：服务时间
	 */
	public void setServiceTime(Date serviceTime) {
		this.serviceTime = serviceTime;
	}
	/**
	 * 获取：服务时间
	 */
	public Date getServiceTime() {
		return serviceTime;
	}
	/**
	 * 设置：服务
	 */
	public void setService(String service) {
		this.service = service;
	}
	/**
	 * 获取：服务
	 */
	public String getService() {
		return service;
	}
	/**
	 * 设置：服务供应商
	 */
	public void setServiceSupplier(String serviceSupplier) {
		this.serviceSupplier = serviceSupplier;
	}
	/**
	 * 获取：服务供应商
	 */
	public String getServiceSupplier() {
		return serviceSupplier;
	}
	/**
	 * 设置：服务状态
	 */
	public void setServiceState(String serviceState) {
		this.serviceState = serviceState;
	}
	/**
	 * 获取：服务状态
	 */
	public String getServiceState() {
		return serviceState;
	}
	/**
	 * 设置：服务家族
	 */
	public void setServiceFamily(String serviceFamily) {
		this.serviceFamily = serviceFamily;
	}
	/**
	 * 获取：服务家族
	 */
	public String getServiceFamily() {
		return serviceFamily;
	}
	/**
	 * 设置：例行变更
	 */
	public void setRoutineChange(String routineChange) {
		this.routineChange = routineChange;
	}
	/**
	 * 获取：例行变更
	 */
	public String getRoutineChange() {
		return routineChange;
	}
	/**
	 * 设置：正常变更
	 */
	public void setNormalChange(String normalChange) {
		this.normalChange = normalChange;
	}
	/**
	 * 获取：正常变更
	 */
	public String getNormalChange() {
		return normalChange;
	}
	/**
	 * 设置：紧急变更
	 */
	public void setUrgentChange(String urgentChange) {
		this.urgentChange = urgentChange;
	}
	/**
	 * 获取：紧急变更
	 */
	public String getUrgenChange() {
		return urgentChange;
	}
	/**
	 * 设置：事件
	 */
	public void setEvent(String event) {
		this.event = event;
	}
	/**
	 * 获取：事件
	 */
	public String getEvent() {
		return event;
	}
	/**
	 * 设置：问题
	 */
	public void setProblem(String problem) {
		this.problem = problem;
	}
	/**
	 * 获取：问题
	 */
	public String getProblem() {
		return problem;
	}
	/**
	 * 设置：服务请求
	 */
	public void setServiceRequest(String serviceRequest) {
		this.serviceRequest = serviceRequest;
	}
	/**
	 * 获取：服务请求
	 */
	public String getServiceRequest() {
		return serviceRequest;
	}
}
