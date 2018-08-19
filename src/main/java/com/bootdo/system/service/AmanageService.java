package com.bootdo.system.service;

import com.bootdo.system.domain.AmanageDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:59:38
 */
public interface AmanageService {
	
	AmanageDO get(String slaId);
	
	List<AmanageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AmanageDO amanage);
	
	int update(AmanageDO amanage);
	
	int remove(String slaId);
	
	int batchRemove(String[] slaIds);
}
