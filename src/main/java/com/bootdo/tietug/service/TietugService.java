package com.bootdo.tietug.service;

import com.bootdo.tietug.domain.TietugDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 22:39:27
 */
public interface TietugService {
	
	TietugDO get(Integer id);
	
	List<TietugDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietugDO tietug);
	
	int update(TietugDO tietug);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
