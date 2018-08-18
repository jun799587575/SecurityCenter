package com.bootdo.customer.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-16 14:10:04
 */
public class CustomerDO implements Serializable {
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
	//
	private Integer goodsNumber;
	//
	private String guarantee;
	//
	private String customerSignature;
	//
	private String contract;

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
	/**
	 * 设置：
	 */
	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	/**
	 * 获取：
	 */
	public Integer getGoodsNumber() {
		return goodsNumber;
	}
	/**
	 * 设置：
	 */
	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}
	/**
	 * 获取：
	 */
	public String getGuarantee() {
		return guarantee;
	}
	/**
	 * 设置：
	 */
	public void setCustomerSignature(String customerSignature) {
		this.customerSignature = customerSignature;
	}
	/**
	 * 获取：
	 */
	public String getCustomerSignature() {
		return customerSignature;
	}
	/**
	 * 设置：
	 */
	public void setContract(String contract) {
		this.contract = contract;
	}
	/**
	 * 获取：
	 */
	public String getContract() {
		return contract;
	}
}
