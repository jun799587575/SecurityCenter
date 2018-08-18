package com.bootdo.report.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-15 14:19:13
 */
public class ReportDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer contractId;
	//
	private String userName;
	//
	private String installAddress;
	//
	private String goods;
	//
	private Date debugData;

	/**
	 * 设置：
	 */
	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}
	/**
	 * 获取：
	 */
	public Integer getContractId() {
		return contractId;
	}
	/**
	 * 设置：
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：
	 */
	public void setInstallAddress(String installAddress) {
		this.installAddress = installAddress;
	}
	/**
	 * 获取：
	 */
	public String getInstallAddress() {
		return installAddress;
	}
	/**
	 * 设置：
	 */
	public void setGoods(String goods) {
		this.goods = goods;
	}
	/**
	 * 获取：
	 */
	public String getGoods() {
		return goods;
	}
	/**
	 * 设置：
	 */
	public void setDebugData(Date debugData) {
		this.debugData = debugData;
	}
	/**
	 * 获取：
	 */
	public Date getDebugData() {
		return debugData;
	}
}
