package com.bootdo.worker.service;

import com.bootdo.worker.domain.ListerDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 14:04:31
 */
public interface ListerService {
	
	ListerDO get(Integer workId);
	
	List<ListerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ListerDO lister);
	
	int update(ListerDO lister);
	
	int remove(Integer workId);
	
	int batchRemove(Integer[] workIds);
}
