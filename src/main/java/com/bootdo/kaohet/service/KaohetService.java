package com.bootdo.kaohet.service;

import com.bootdo.kaohet.domain.KaohetDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 23:02:26
 */
public interface KaohetService {
	
	KaohetDO get(Integer id);
	
	List<KaohetDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(KaohetDO kaohet);
	
	int update(KaohetDO kaohet);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
