package com.bootdo.work.domain;

import java.io.Serializable;
import java.util.Date;



/**
 *
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 09:11:19
 */
public class KnowDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//关键字
	private String knowKeyword;
	//标题
	private String knowTitle;
	//来源
	private String knowSource;
	//时间
	private Date knowTime;
	//状态
	private String knowState;
	//类别
	private String konwCategory;
	//内容
	private String knowContext;
	//附件
	private String knowEnclosure;

	/**
	 * 设置：关键字
	 */
	public void setKnowKeyword(String knowKeyword) {
		this.knowKeyword = knowKeyword;
	}
	/**
	 * 获取：关键字
	 */
	public String getKnowKeyword() {
		return knowKeyword;
	}
	/**
	 * 设置：标题
	 */
	public void setKnowTitle(String knowTitle) {
		this.knowTitle = knowTitle;
	}
	/**
	 * 获取：标题
	 */
	public String getKnowTitle() {
		return knowTitle;
	}
	/**
	 * 设置：来源
	 */
	public void setKnowSource(String knowSource) {
		this.knowSource = knowSource;
	}
	/**
	 * 获取：来源
	 */
	public String getKnowSource() {
		return knowSource;
	}
	/**
	 * 设置：时间
	 */
	public void setKnowTime(Date knowTime) {
		this.knowTime = knowTime;
	}
	/**
	 * 获取：时间
	 */
	public Date getKnowTime() {
		return knowTime;
	}
	/**
	 * 设置：状态
	 */
	public void setKnowState(String knowState) {
		this.knowState = knowState;
	}
	/**
	 * 获取：状态
	 */
	public String getKnowState() {
		return knowState;
	}
	/**
	 * 设置：类别
	 */
	public void setKonwCategory(String konwCategory) {
		this.konwCategory = konwCategory;
	}
	/**
	 * 获取：类别
	 */
	public String getKonwCategory() {
		return konwCategory;
	}
	/**
	 * 设置：内容
	 */
	public void setKnowContext(String knowContext) {
		this.knowContext = knowContext;
	}
	/**
	 * 获取：内容
	 */
	public String getKnowContext() {
		return knowContext;
	}
	/**
	 * 设置：附件
	 */
	public void setKnowEnclosure(String knowEnclosure) {
		this.knowEnclosure = knowEnclosure;
	}
	/**
	 * 获取：附件
	 */
	public String getKnowEnclosure() {
		return knowEnclosure;
	}
}
