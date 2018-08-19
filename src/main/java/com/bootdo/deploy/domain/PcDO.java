package com.bootdo.deploy.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:37
 */
public class PcDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Integer pcId;
	//名称
	private String pcName;
	//组织
	private String organization;
	//状态
	private String state;
	//业务级别
	private String businessLevel;
	//地理位置
	private String geographicalPosition;
	//品牌
	private String brand;
	//型号
	private String model;
	//OS家族
	private String osFamily;
	//OS版本
	private String osVersion;
	//类型
	private String type;
	//CPU
	private String cpu;
	//内存
	private String memory;
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
	//软件
	private String software;
	//软件许可证
	private String softwareLicense;
	//联系人
	private String contacts;
	//组织
	private String organize;
	//邮箱
	private String mailbox;
	//电话
	private Integer telephone;
	//职责
	private String duty;
	//联系人状态
	private String contactState;
	//软件名称
	private String softwareName;
	//软件组织
	private String softwareOrganization;
	//软件状态
	private String softwareState;
	//软件业务级别
	private String softwareLevel;
	//软件路径
	private String softwareRoute;
	//软件投产日期
	private Date softwareStartingDate;
	//软件描述
	private String softwareDescribe;
	//文档
	private String file;
	//组织（文档）
	private String fileOrganize;
	//状态（文档）
	private String fileState;
	//类型（文档）
	private String fileDype;
	//描述（文档）
	private String fileDescribe;
	//名称（网卡）
	private String networkName;
	//IP地址
	private String networkIp;
	//MAC地址
	private String networkMac;
	//注释
	private String networkNotes;
	//网关
	private String networkGateway;
	//掩码
	private String networkMask;
	//速率
	private String networkSulv;
	//本地网口
	private String localNetworkPort;
	//设备网口
	private String equipmentNetMouth;
	//连接设备（网络设备）
	private String lineType;
	//网络设备
	private String networkEquipment;
	//组织（网络设备）
	private String networkOrganize;
	//状态（网络设备）
	private String networkState;
	//业务级别（网络设备）
	private String networkBusinessLevel;
	//地理位置（网络设备）
	private String networkGeographicalPosition;
	//品牌（网络设备）
	private String networkBrand;
	//型号（网络设备）
	private String networkModel;
	//序列号（网络设备）
	private Integer networkNumber;
	//供应商合同
	private String supplierContract;
	//状态（供应商合同）
	private String supplierState;
	//客户（供应商合同）
	private String supplierCustomer;
	//描述（供应商合同）
	private String supplierDescribe;
	//开始日期（供应商合同）
	private Date supplierStart;
	//结束日期（供应商合同）
	private Date supplierEnd;
	//供应商
	private String supplier;
	//SLA（供应商合同）
	private String supplierSla;
	//服务时间
	private Date serviceTime;
	//服务
	private String service;
	//供应商（服务）
	private String serviceSupplier;
	//状态（服务）
	private String serviceState;
	//服务族
	private String serviceFamily;
	//例行变更
	private String routerChange;
	//正常变更
	private String normalChange;
	//紧急变更
	private String urgentChange;
	//问题
	private String problem;
	//事件
	private String event;
	//服务请求
	private String serviceRequest;

	/**
	 * 设置：ID
	 */
	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}
	/**
	 * 获取：ID
	 */
	public Integer getPcId() {
		return pcId;
	}
	/**
	 * 设置：名称
	 */
	public void setPcName(String pcName) {
		this.pcName = pcName;
	}
	/**
	 * 获取：名称
	 */
	public String getPcName() {
		return pcName;
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
	 * 设置：OS家族
	 */
	public void setOsFamily(String osFamily) {
		this.osFamily = osFamily;
	}
	/**
	 * 获取：OS家族
	 */
	public String getOsFamily() {
		return osFamily;
	}
	/**
	 * 设置：OS版本
	 */
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	/**
	 * 获取：OS版本
	 */
	public String getOsVersion() {
		return osVersion;
	}
	/**
	 * 设置：类型
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：类型
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：CPU
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	/**
	 * 获取：CPU
	 */
	public String getCpu() {
		return cpu;
	}
	/**
	 * 设置：内存
	 */
	public void setMemory(String memory) {
		this.memory = memory;
	}
	/**
	 * 获取：内存
	 */
	public String getMemory() {
		return memory;
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
	 * 设置：软件
	 */
	public void setSoftware(String software) {
		this.software = software;
	}
	/**
	 * 获取：软件
	 */
	public String getSoftware() {
		return software;
	}
	/**
	 * 设置：软件许可证
	 */
	public void setSoftwareLicense(String softwareLicense) {
		this.softwareLicense = softwareLicense;
	}
	/**
	 * 获取：软件许可证
	 */
	public String getSoftwareLicense() {
		return softwareLicense;
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
	 * 设置：组织
	 */
	public void setOrganize(String organize) {
		this.organize = organize;
	}
	/**
	 * 获取：组织
	 */
	public String getOrganize() {
		return organize;
	}
	/**
	 * 设置：邮箱
	 */
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}
	/**
	 * 获取：邮箱
	 */
	public String getMailbox() {
		return mailbox;
	}
	/**
	 * 设置：电话
	 */
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：电话
	 */
	public Integer getTelephone() {
		return telephone;
	}
	/**
	 * 设置：职责
	 */
	public void setDuty(String duty) {
		this.duty = duty;
	}
	/**
	 * 获取：职责
	 */
	public String getDuty() {
		return duty;
	}
	/**
	 * 设置：联系人状态
	 */
	public void setContactState(String contactState) {
		this.contactState = contactState;
	}
	/**
	 * 获取：联系人状态
	 */
	public String getContactState() {
		return contactState;
	}
	/**
	 * 设置：软件名称
	 */
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	/**
	 * 获取：软件名称
	 */
	public String getSoftwareName() {
		return softwareName;
	}
	/**
	 * 设置：软件组织
	 */
	public void setSoftwareOrganization(String softwareOrganization) {
		this.softwareOrganization = softwareOrganization;
	}
	/**
	 * 获取：软件组织
	 */
	public String getSoftwareOrganization() {
		return softwareOrganization;
	}
	/**
	 * 设置：软件状态
	 */
	public void setSoftwareState(String softwareState) {
		this.softwareState = softwareState;
	}
	/**
	 * 获取：软件状态
	 */
	public String getSoftwareState() {
		return softwareState;
	}
	/**
	 * 设置：软件业务级别
	 */
	public void setSoftwareLevel(String softwareLevel) {
		this.softwareLevel = softwareLevel;
	}
	/**
	 * 获取：软件业务级别
	 */
	public String getSoftwareLevel() {
		return softwareLevel;
	}
	/**
	 * 设置：软件路径
	 */
	public void setSoftwareRoute(String softwareRoute) {
		this.softwareRoute = softwareRoute;
	}
	/**
	 * 获取：软件路径
	 */
	public String getSoftwareRoute() {
		return softwareRoute;
	}
	/**
	 * 设置：软件投产日期
	 */
	public void setSoftwareStartingDate(Date softwareStartingDate) {
		this.softwareStartingDate = softwareStartingDate;
	}
	/**
	 * 获取：软件投产日期
	 */
	public Date getSoftwareStartingDate() {
		return softwareStartingDate;
	}
	/**
	 * 设置：软件描述
	 */
	public void setSoftwareDescribe(String softwareDescribe) {
		this.softwareDescribe = softwareDescribe;
	}
	/**
	 * 获取：软件描述
	 */
	public String getSoftwareDescribe() {
		return softwareDescribe;
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
	 * 设置：组织（文档）
	 */
	public void setFileOrganize(String fileOrganize) {
		this.fileOrganize = fileOrganize;
	}
	/**
	 * 获取：组织（文档）
	 */
	public String getFileOrganize() {
		return fileOrganize;
	}
	/**
	 * 设置：状态（文档）
	 */
	public void setFileState(String fileState) {
		this.fileState = fileState;
	}
	/**
	 * 获取：状态（文档）
	 */
	public String getFileState() {
		return fileState;
	}
	/**
	 * 设置：类型（文档）
	 */
	public void setFileDype(String fileDype) {
		this.fileDype = fileDype;
	}
	/**
	 * 获取：类型（文档）
	 */
	public String getFileDype() {
		return fileDype;
	}
	/**
	 * 设置：描述（文档）
	 */
	public void setFileDescribe(String fileDescribe) {
		this.fileDescribe = fileDescribe;
	}
	/**
	 * 获取：描述（文档）
	 */
	public String getFileDescribe() {
		return fileDescribe;
	}
	/**
	 * 设置：名称（网卡）
	 */
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	/**
	 * 获取：名称（网卡）
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
	 * 设置：MAC地址
	 */
	public void setNetworkMac(String networkMac) {
		this.networkMac = networkMac;
	}
	/**
	 * 获取：MAC地址
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
	 * 设置：速率
	 */
	public void setNetworkSulv(String networkSulv) {
		this.networkSulv = networkSulv;
	}
	/**
	 * 获取：速率
	 */
	public String getNetworkSulv() {
		return networkSulv;
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
	 * 设置：设备网口
	 */
	public void setEquipmentNetMouth(String equipmentNetMouth) {
		this.equipmentNetMouth = equipmentNetMouth;
	}
	/**
	 * 获取：设备网口
	 */
	public String getEquipmentNetMouth() {
		return equipmentNetMouth;
	}
	/**
	 * 设置：连接设备（网络设备）
	 */
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}
	/**
	 * 获取：连接设备（网络设备）
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
	public void setNetworkOrganize(String networkOrganize) {
		this.networkOrganize = networkOrganize;
	}
	/**
	 * 获取：组织（网络设备）
	 */
	public String getNetworkOrganize() {
		return networkOrganize;
	}
	/**
	 * 设置：状态（网络设备）
	 */
	public void setNetworkState(String networkState) {
		this.networkState = networkState;
	}
	/**
	 * 获取：状态（网络设备）
	 */
	public String getNetworkState() {
		return networkState;
	}
	/**
	 * 设置：业务级别（网络设备）
	 */
	public void setNetworkBusinessLevel(String networkBusinessLevel) {
		this.networkBusinessLevel = networkBusinessLevel;
	}
	/**
	 * 获取：业务级别（网络设备）
	 */
	public String getNetworkBusinessLevel() {
		return networkBusinessLevel;
	}
	/**
	 * 设置：地理位置（网络设备）
	 */
	public void setNetworkGeographicalPosition(String networkGeographicalPosition) {
		this.networkGeographicalPosition = networkGeographicalPosition;
	}
	/**
	 * 获取：地理位置（网络设备）
	 */
	public String getNetworkGeographicalPosition() {
		return networkGeographicalPosition;
	}
	/**
	 * 设置：品牌（网络设备）
	 */
	public void setNetworkBrand(String networkBrand) {
		this.networkBrand = networkBrand;
	}
	/**
	 * 获取：品牌（网络设备）
	 */
	public String getNetworkBrand() {
		return networkBrand;
	}
	/**
	 * 设置：型号（网络设备）
	 */
	public void setNetworkModel(String networkModel) {
		this.networkModel = networkModel;
	}
	/**
	 * 获取：型号（网络设备）
	 */
	public String getNetworkModel() {
		return networkModel;
	}
	/**
	 * 设置：序列号（网络设备）
	 */
	public void setNetworkNumber(Integer networkNumber) {
		this.networkNumber = networkNumber;
	}
	/**
	 * 获取：序列号（网络设备）
	 */
	public Integer getNetworkNumber() {
		return networkNumber;
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
	 * 设置：开始日期（供应商合同）
	 */
	public void setSupplierStart(Date supplierStart) {
		this.supplierStart = supplierStart;
	}
	/**
	 * 获取：开始日期（供应商合同）
	 */
	public Date getSupplierStart() {
		return supplierStart;
	}
	/**
	 * 设置：结束日期（供应商合同）
	 */
	public void setSupplierEnd(Date supplierEnd) {
		this.supplierEnd = supplierEnd;
	}
	/**
	 * 获取：结束日期（供应商合同）
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
	 * 设置：SLA（供应商合同）
	 */
	public void setSupplierSla(String supplierSla) {
		this.supplierSla = supplierSla;
	}
	/**
	 * 获取：SLA（供应商合同）
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
	 * 设置：供应商（服务）
	 */
	public void setServiceSupplier(String serviceSupplier) {
		this.serviceSupplier = serviceSupplier;
	}
	/**
	 * 获取：供应商（服务）
	 */
	public String getServiceSupplier() {
		return serviceSupplier;
	}
	/**
	 * 设置：状态（服务）
	 */
	public void setServiceState(String serviceState) {
		this.serviceState = serviceState;
	}
	/**
	 * 获取：状态（服务）
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
	public void setRouterChange(String routerChange) {
		this.routerChange = routerChange;
	}
	/**
	 * 获取：例行变更
	 */
	public String getRouterChange() {
		return routerChange;
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
