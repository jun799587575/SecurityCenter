package com.bootdo.deploy.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:36
 */
public class NasDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer nasId;
	//名称
	private String nasName;
	//组织
	private String organization;
	//状态
	private String state;
	//业务级别
	private String businessLevel;
	//地理位置
	private String geographicalPosition;
	//机柜
	private String cabinet;
	//机箱
	private String chassis;
	//品牌
	private String brand;
	//型号
	private String model;
	//管理IP
	private String managingIp;
	//机箱高度
	private Double chassisHeight;
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
	//电源A
	private String powerA;
	//电源B
	private String powerB;
	//冗余
	private String redundancy;
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
	private String contactsDuty;
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
	//解决方案
	private String solution;
	//（解决方案）组织
	private String solutionOrganization;
	//（解决方案）业务级别
	private String soultionBusinessLevel;
	//（解决方案）投产日期 
	private Date soultionStartingDate;
	//网卡名称
	private String networkName;
	//IP地址
	private String networkIp;
	//Mac地址
	private String networkMac;
	//注释
	private String networkNotes;
	//网关
	private String networkGateway;
	//掩码
	private String networkMask;
	//名称（光纤端口）
	private String opticalFiberName;
	//速率
	private String rate;
	//TOPOLOGY
	private String topology;
	//WWN
	private String wwn;
	//本地网口
	private String localNetworkPort;
	//设备类型
	private String equipmentNetMouth;
	//连接类型
	private String lineType;
	//网络设备
	private String networkEquipment;
	//组织（网络设备）
	private String networkEquipmentOrganize;
	//状态（网络设备）
	private String networkEquipmentState;
	//业务级别（网络设备）
	private String networkEquipmentLevel;
	//地理位置（网络设备）
	private String networkEquipmentPosition;
	//品牌（网络设备）
	private String networkEquipmentBrand;
	//型号（网络设备）
	private String networkEquipmentModel;
	//序列号（网络设备）
	private Integer networkEquipmentNumber;
	//姓名（文件系统）
	private String fileSystemName;
	//描述（文件系统）
	private String fileSystemDescribe;
	//列阵级别（文件系统）
	private String fileSystemArrayLevel;
	//大小（文件系统）
	private Integer fileSystemSize;
	//供应商合同
	private String supplierContract;
	//状态（供应商合同）
	private String supplierState;
	//客户（供应商合同）
	private String supplierCustomer;
	//开始时间（供应商合同）
	private Date supplierStart;
	//结束时间（供应商合同）
	private Date supplierEnd;
	//供应商
	private String supplier;
	//SLA
	private String supplierSla;
	//服务时间
	private Date serviceTime;
	//描述（供应商合同）
	private String supplierDescribe;
	//服务
	private String service;
	//服务供应商
	private String serviceSupplier;
	//服务状态
	private String serviceState;
	//服务族
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
	public void setNasId(Integer nasId) {
		this.nasId = nasId;
	}
	/**
	 * 获取：ID
	 */
	public Integer getNasId() {
		return nasId;
	}
	/**
	 * 设置：名称
	 */
	public void setNasName(String nasName) {
		this.nasName = nasName;
	}
	/**
	 * 获取：名称
	 */
	public String getNasName() {
		return nasName;
	}
	/**
	 * 设置：组织
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	/**
	 * 获取：组织
	 */
	public String getOrganization() {
		return organization;
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
	 * 设置：业务级别
	 */
	public void setBusinessLevel(String businessLevel) {
		this.businessLevel = businessLevel;
	}
	/**
	 * 获取：业务级别
	 */
	public String getBusinessLevel() {
		return businessLevel;
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
	 * 设置：机柜
	 */
	public void setCabinet(String cabinet) {
		this.cabinet = cabinet;
	}
	/**
	 * 获取：机柜
	 */
	public String getCabinet() {
		return cabinet;
	}
	/**
	 * 设置：机箱
	 */
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	/**
	 * 获取：机箱
	 */
	public String getChassis() {
		return chassis;
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
	 * 设置：管理IP
	 */
	public void setManagingIp(String managingIp) {
		this.managingIp = managingIp;
	}
	/**
	 * 获取：管理IP
	 */
	public String getManagingIp() {
		return managingIp;
	}
	/**
	 * 设置：机箱高度
	 */
	public void setChassisHeight(Double chassisHeight) {
		this.chassisHeight = chassisHeight;
	}
	/**
	 * 获取：机箱高度
	 */
	public Double getChassisHeight() {
		return chassisHeight;
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
	 * 设置：电源A
	 */
	public void setPowerA(String powerA) {
		this.powerA = powerA;
	}
	/**
	 * 获取：电源A
	 */
	public String getPowerA() {
		return powerA;
	}
	/**
	 * 设置：电源B
	 */
	public void setPowerB(String powerB) {
		this.powerB = powerB;
	}
	/**
	 * 获取：电源B
	 */
	public String getPowerB() {
		return powerB;
	}
	/**
	 * 设置：冗余
	 */
	public void setRedundancy(String redundancy) {
		this.redundancy = redundancy;
	}
	/**
	 * 获取：冗余
	 */
	public String getRedundancy() {
		return redundancy;
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
	public void setContactsDuty(String contactsDuty) {
		this.contactsDuty = contactsDuty;
	}
	/**
	 * 获取：联系人职责
	 */
	public String getContactsDuty() {
		return contactsDuty;
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
	 * 设置：解决方案
	 */
	public void setSolution(String solution) {
		this.solution = solution;
	}
	/**
	 * 获取：解决方案
	 */
	public String getSolution() {
		return solution;
	}
	/**
	 * 设置：（解决方案）组织
	 */
	public void setSolutionOrganization(String solutionOrganization) {
		this.solutionOrganization = solutionOrganization;
	}
	/**
	 * 获取：（解决方案）组织
	 */
	public String getSolutionOrganization() {
		return solutionOrganization;
	}
	/**
	 * 设置：（解决方案）业务级别
	 */
	public void setSoultionBusinessLevel(String soultionBusinessLevel) {
		this.soultionBusinessLevel = soultionBusinessLevel;
	}
	/**
	 * 获取：（解决方案）业务级别
	 */
	public String getSoultionBusinessLevel() {
		return soultionBusinessLevel;
	}
	/**
	 * 设置：（解决方案）投产日期 
	 */
	public void setSoultionStartingDate(Date soultionStartingDate) {
		this.soultionStartingDate = soultionStartingDate;
	}
	/**
	 * 获取：（解决方案）投产日期 
	 */
	public Date getSoultionStartingDate() {
		return soultionStartingDate;
	}
	/**
	 * 设置：网卡名称
	 */
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	/**
	 * 获取：网卡名称
	 */
	public String getNetworkName() {
		return networkName;
	}
	/**
	 * 设置：IP地址
	 */
	public void setNetworkIp(String networkIp) {
		this.networkIp = networkIp;
	}
	/**
	 * 获取：IP地址
	 */
	public String getNetworkIp() {
		return networkIp;
	}
	/**
	 * 设置：Mac地址
	 */
	public void setNetworkMac(String networkMac) {
		this.networkMac = networkMac;
	}
	/**
	 * 获取：Mac地址
	 */
	public String getNetworkMac() {
		return networkMac;
	}
	/**
	 * 设置：注释
	 */
	public void setNetworkNotes(String networkNotes) {
		this.networkNotes = networkNotes;
	}
	/**
	 * 获取：注释
	 */
	public String getNetworkNotes() {
		return networkNotes;
	}
	/**
	 * 设置：网关
	 */
	public void setNetworkGateway(String networkGateway) {
		this.networkGateway = networkGateway;
	}
	/**
	 * 获取：网关
	 */
	public String getNetworkGateway() {
		return networkGateway;
	}
	/**
	 * 设置：掩码
	 */
	public void setNetworkMask(String networkMask) {
		this.networkMask = networkMask;
	}
	/**
	 * 获取：掩码
	 */
	public String getNetworkMask() {
		return networkMask;
	}
	/**
	 * 设置：名称（光纤端口）
	 */
	public void setOpticalFiberName(String opticalFiberName) {
		this.opticalFiberName = opticalFiberName;
	}
	/**
	 * 获取：名称（光纤端口）
	 */
	public String getOpticalFiberName() {
		return opticalFiberName;
	}
	/**
	 * 设置：速率
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}
	/**
	 * 获取：速率
	 */
	public String getRate() {
		return rate;
	}
	/**
	 * 设置：TOPOLOGY
	 */
	public void setTopology(String topology) {
		this.topology = topology;
	}
	/**
	 * 获取：TOPOLOGY
	 */
	public String getTopology() {
		return topology;
	}
	/**
	 * 设置：WWN
	 */
	public void setWwn(String wwn) {
		this.wwn = wwn;
	}
	/**
	 * 获取：WWN
	 */
	public String getWwn() {
		return wwn;
	}
	/**
	 * 设置：本地网口
	 */
	public void setLocalNetworkPort(String localNetworkPort) {
		this.localNetworkPort = localNetworkPort;
	}
	/**
	 * 获取：本地网口
	 */
	public String getLocalNetworkPort() {
		return localNetworkPort;
	}
	/**
	 * 设置：设备类型
	 */
	public void setEquipmentNetMouth(String equipmentNetMouth) {
		this.equipmentNetMouth = equipmentNetMouth;
	}
	/**
	 * 获取：设备类型
	 */
	public String getEquipmentNetMouth() {
		return equipmentNetMouth;
	}
	/**
	 * 设置：连接类型
	 */
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	/**
	 * 获取：连接类型
	 */
	public String getLineType() {
		return lineType;
	}
	/**
	 * 设置：网络设备
	 */
	public void setNetworkEquipment(String networkEquipment) {
		this.networkEquipment = networkEquipment;
	}
	/**
	 * 获取：网络设备
	 */
	public String getNetworkEquipment() {
		return networkEquipment;
	}
	/**
	 * 设置：组织（网络设备）
	 */
	public void setNetworkEquipmentOrganize(String networkEquipmentOrganize) {
		this.networkEquipmentOrganize = networkEquipmentOrganize;
	}
	/**
	 * 获取：组织（网络设备）
	 */
	public String getNetworkEquipmentOrganize() {
		return networkEquipmentOrganize;
	}
	/**
	 * 设置：状态（网络设备）
	 */
	public void setNetworkEquipmentState(String networkEquipmentState) {
		this.networkEquipmentState = networkEquipmentState;
	}
	/**
	 * 获取：状态（网络设备）
	 */
	public String getNetworkEquipmentState() {
		return networkEquipmentState;
	}
	/**
	 * 设置：业务级别（网络设备）
	 */
	public void setNetworkEquipmentLevel(String networkEquipmentLevel) {
		this.networkEquipmentLevel = networkEquipmentLevel;
	}
	/**
	 * 获取：业务级别（网络设备）
	 */
	public String getNetworkEquipmentLevel() {
		return networkEquipmentLevel;
	}
	/**
	 * 设置：地理位置（网络设备）
	 */
	public void setNetworkEquipmentPosition(String networkEquipmentPosition) {
		this.networkEquipmentPosition = networkEquipmentPosition;
	}
	/**
	 * 获取：地理位置（网络设备）
	 */
	public String getNetworkEquipmentPosition() {
		return networkEquipmentPosition;
	}
	/**
	 * 设置：品牌（网络设备）
	 */
	public void setNetworkEquipmentBrand(String networkEquipmentBrand) {
		this.networkEquipmentBrand = networkEquipmentBrand;
	}
	/**
	 * 获取：品牌（网络设备）
	 */
	public String getNetworkEquipmentBrand() {
		return networkEquipmentBrand;
	}
	/**
	 * 设置：型号（网络设备）
	 */
	public void setNetworkEquipmentModel(String networkEquipmentModel) {
		this.networkEquipmentModel = networkEquipmentModel;
	}
	/**
	 * 获取：型号（网络设备）
	 */
	public String getNetworkEquipmentModel() {
		return networkEquipmentModel;
	}
	/**
	 * 设置：序列号（网络设备）
	 */
	public void setNetworkEquipmentNumber(Integer networkEquipmentNumber) {
		this.networkEquipmentNumber = networkEquipmentNumber;
	}
	/**
	 * 获取：序列号（网络设备）
	 */
	public Integer getNetworkEquipmentNumber() {
		return networkEquipmentNumber;
	}
	/**
	 * 设置：姓名（文件系统）
	 */
	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}
	/**
	 * 获取：姓名（文件系统）
	 */
	public String getFileSystemName() {
		return fileSystemName;
	}
	/**
	 * 设置：描述（文件系统）
	 */
	public void setFileSystemDescribe(String fileSystemDescribe) {
		this.fileSystemDescribe = fileSystemDescribe;
	}
	/**
	 * 获取：描述（文件系统）
	 */
	public String getFileSystemDescribe() {
		return fileSystemDescribe;
	}
	/**
	 * 设置：列阵级别（文件系统）
	 */
	public void setFileSystemArrayLevel(String fileSystemArrayLevel) {
		this.fileSystemArrayLevel = fileSystemArrayLevel;
	}
	/**
	 * 获取：列阵级别（文件系统）
	 */
	public String getFileSystemArrayLevel() {
		return fileSystemArrayLevel;
	}
	/**
	 * 设置：大小（文件系统）
	 */
	public void setFileSystemSize(Integer fileSystemSize) {
		this.fileSystemSize = fileSystemSize;
	}
	/**
	 * 获取：大小（文件系统）
	 */
	public Integer getFileSystemSize() {
		return fileSystemSize;
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
	 * 设置：状态（供应商合同）
	 */
	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}
	/**
	 * 获取：状态（供应商合同）
	 */
	public String getSupplierState() {
		return supplierState;
	}
	/**
	 * 设置：客户（供应商合同）
	 */
	public void setSupplierCustomer(String supplierCustomer) {
		this.supplierCustomer = supplierCustomer;
	}
	/**
	 * 获取：客户（供应商合同）
	 */
	public String getSupplierCustomer() {
		return supplierCustomer;
	}
	/**
	 * 设置：开始时间（供应商合同）
	 */
	public void setSupplierStart(Date supplierStart) {
		this.supplierStart = supplierStart;
	}
	/**
	 * 获取：开始时间（供应商合同）
	 */
	public Date getSupplierStart() {
		return supplierStart;
	}
	/**
	 * 设置：结束时间（供应商合同）
	 */
	public void setSupplierEnd(Date supplierEnd) {
		this.supplierEnd = supplierEnd;
	}
	/**
	 * 获取：结束时间（供应商合同）
	 */
	public Date getSupplierEnd() {
		return supplierEnd;
	}
	/**
	 * 设置：供应商
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	/**
	 * 获取：供应商
	 */
	public String getSupplier() {
		return supplier;
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
	 * 设置：描述（供应商合同）
	 */
	public void setSupplierDescribe(String supplierDescribe) {
		this.supplierDescribe = supplierDescribe;
	}
	/**
	 * 获取：描述（供应商合同）
	 */
	public String getSupplierDescribe() {
		return supplierDescribe;
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
	 * 设置：服务族
	 */
	public void setServiceFamily(String serviceFamily) {
		this.serviceFamily = serviceFamily;
	}
	/**
	 * 获取：服务族
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
	public String getUrgentChange() {
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
