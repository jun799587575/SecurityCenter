package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:59:45
 */
public class TmanageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private String sltId;
	//优先级
	private String sltName;
	//
	private Integer sltRank;
	//slt类型
	private String sltStyle;
	//slt指标
	private String sltIndex;
	//slt值
	private String sltPrice;
	//单位
	private String sltUnit;

	/**
	 * 设置：
	 */
	public void setSltId(String sltId) {
		this.sltId = sltId;
	}
	/**
	 * 获取：
	 */
	public String getSltId() {
		return sltId;
	}
	/**
	 * 设置：优先级
	 */
	public void setSltName(String sltName) {
		this.sltName = sltName;
	}
	/**
	 * 获取：优先级
	 */
	public String getSltName() {
		return sltName;
	}
	/**
	 * 设置：
	 */
	public void setSltRank(Integer sltRank) {
		this.sltRank = sltRank;
	}
	/**
	 * 获取：
	 */
	public Integer getSltRank() {
		return sltRank;
	}
	/**
	 * 设置：slt类型
	 */
	public void setSltStyle(String sltStyle) {
		this.sltStyle = sltStyle;
	}
	/**
	 * 获取：slt类型
	 */
	public String getSltStyle() {
		return sltStyle;
	}
	/**
	 * 设置：slt指标
	 */
	public void setSltIndex(String sltIndex) {
		this.sltIndex = sltIndex;
	}
	/**
	 * 获取：slt指标
	 */
	public String getSltIndex() {
		return sltIndex;
	}
	/**
	 * 设置：slt值
	 */
	public void setSltPrice(String sltPrice) {
		this.sltPrice = sltPrice;
	}
	/**
	 * 获取：slt值
	 */
	public String getSltPrice() {
		return sltPrice;
	}
	/**
	 * 设置：单位
	 */
	public void setSltUnit(String sltUnit) {
		this.sltUnit = sltUnit;
	}
	/**
	 * 获取：单位
	 */
	public String getSltUnit() {
		return sltUnit;
	}
}
