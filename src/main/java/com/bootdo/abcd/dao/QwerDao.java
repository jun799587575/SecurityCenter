package com.bootdo.abcd.dao;

import com.bootdo.abcd.domain.QwerDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 18:15:36
 */
@Mapper
public interface QwerDao {

	QwerDO get(String sda);
	
	List<QwerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(QwerDO qwer);
	
	int update(QwerDO qwer);
	
	int remove(String sda);
	
	int batchRemove(String[] sdas);
}
