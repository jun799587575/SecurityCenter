package com.bootdo.system.service;

import com.bootdo.system.domain.PointDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 13:35:27
 */
public interface PointService {
	
	PointDO get(Integer queId);
	
	List<PointDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PointDO point);
	
	int update(PointDO point);
	
	int remove(Integer queId);
	
	int batchRemove(Integer[] queIds);
}
