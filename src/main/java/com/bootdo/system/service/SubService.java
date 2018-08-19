package com.bootdo.system.service;

import com.bootdo.system.domain.SubDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:20:08
 */
public interface SubService {
	
	SubDO get(String serveId);
	
	List<SubDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SubDO sub);
	
	int update(SubDO sub);
	
	int remove(String serveId);
	
	int batchRemove(String[] serveIds);
}
