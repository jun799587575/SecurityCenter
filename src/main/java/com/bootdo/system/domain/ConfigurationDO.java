package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:37
 */
public class ConfigurationDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer itemId;
	//
	private String itemName;
	//
	private Integer itemState;
	//
	private Integer itemType;
	//
	private String itemDescribe;

	/**
	 * 设置：
	 */
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：
	 */
	public Integer getItemId() {
		return itemId;
	}
	/**
	 * 设置：
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：
	 */
	public void setItemState(Integer itemState) {
		this.itemState = itemState;
	}
	/**
	 * 获取：
	 */
	public Integer getItemState() {
		return itemState;
	}
	/**
	 * 设置：
	 */
	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}
	/**
	 * 获取：
	 */
	public Integer getItemType() {
		return itemType;
	}
	/**
	 * 设置：
	 */
	public void setItemDescribe(String itemDescribe) {
		this.itemDescribe = itemDescribe;
	}
	/**
	 * 获取：
	 */
	public String getItemDescribe() {
		return itemDescribe;
	}
}
