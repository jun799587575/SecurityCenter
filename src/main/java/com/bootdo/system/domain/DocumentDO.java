package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:24
 */
public class DocumentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer docId;
	//
	private String docName;
	//
	private Integer docState;
	//
	private Integer docType;
	//
	private String docDescribe;

	/**
	 * 设置：
	 */
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	/**
	 * 获取：
	 */
	public Integer getDocId() {
		return docId;
	}
	/**
	 * 设置：
	 */
	public void setDocName(String docName) {
		this.docName = docName;
	}
	/**
	 * 获取：
	 */
	public String getDocName() {
		return docName;
	}
	/**
	 * 设置：
	 */
	public void setDocState(Integer docState) {
		this.docState = docState;
	}
	/**
	 * 获取：
	 */
	public Integer getDocState() {
		return docState;
	}
	/**
	 * 设置：
	 */
	public void setDocType(Integer docType) {
		this.docType = docType;
	}
	/**
	 * 获取：
	 */
	public Integer getDocType() {
		return docType;
	}
	/**
	 * 设置：
	 */
	public void setDocDescribe(String docDescribe) {
		this.docDescribe = docDescribe;
	}
	/**
	 * 获取：
	 */
	public String getDocDescribe() {
		return docDescribe;
	}
}
