package com.bootdo.train.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 02:16:58
 */
public class TrainDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Integer id;
	//培训名称
	private String train;

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
	 * 设置：培训名称
	 */
	public void setTrain(String train) {
		this.train = train;
	}
	/**
	 * 获取：培训名称
	 */
	public String getTrain() {
		return train;
	}
}
