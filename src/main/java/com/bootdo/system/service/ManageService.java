package com.bootdo.system.service;

import com.bootdo.system.domain.ManageDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:20:05
 */
public interface ManageService {
	
	ManageDO get(String serveId);
	
	List<ManageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ManageDO manage);
	
	int update(ManageDO manage);
	
	int remove(String serveId);
	
	int batchRemove(String[] serveIds);
}
