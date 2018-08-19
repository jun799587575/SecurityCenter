package com.bootdo.system.service;

import com.bootdo.system.domain.TmanageDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:59:45
 */
public interface TmanageService {
	
	TmanageDO get(String sltId);
	
	List<TmanageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TmanageDO tmanage);
	
	int update(TmanageDO tmanage);
	
	int remove(String sltId);
	
	int batchRemove(String[] sltIds);
}
