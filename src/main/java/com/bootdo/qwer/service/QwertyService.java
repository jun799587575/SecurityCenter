package com.bootdo.qwer.service;

import com.bootdo.qwer.domain.QwertyDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 19:58:05
 */
public interface QwertyService {
	
	QwertyDO get(String sda);
	
	List<QwertyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(QwertyDO qwer);
	
	int update(QwertyDO qwer);
	
	int remove(String sda);
	
	int batchRemove(String[] sdas);
}
