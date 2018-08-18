package com.bootdo.adress.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:09:01
 */
public class AdressDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Integer id;
	//地址
	private String adress;

	/**
	 * 设置：编号
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：编号
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：地址
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	/**
	 * 获取：地址
	 */
	public String getAdress() {
		return adress;
	}
}
