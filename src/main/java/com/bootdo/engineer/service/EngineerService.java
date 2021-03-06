package com.bootdo.engineer.service;

import com.bootdo.engineer.domain.EngineerDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 09:59:46
 */
public interface EngineerService {
	
	EngineerDO get(Integer id);
	
	List<EngineerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(EngineerDO engineer);
	
	int update(EngineerDO engineer);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
