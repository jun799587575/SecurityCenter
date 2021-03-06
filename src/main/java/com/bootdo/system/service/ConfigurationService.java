package com.bootdo.system.service;

import com.bootdo.system.domain.ConfigurationDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:37
 */
public interface ConfigurationService {
	
	ConfigurationDO get(Integer itemId);
	
	List<ConfigurationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ConfigurationDO configuration);
	
	int update(ConfigurationDO configuration);
	
	int remove(Integer itemId);
	
	int batchRemove(Integer[] itemIds);
}
