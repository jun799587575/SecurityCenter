package com.bootdo.system.service;

import com.bootdo.system.domain.SolveDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 12:04:01
 */
public interface SolveService {
	
	SolveDO get(Integer queId);
	
	List<SolveDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SolveDO solve);
	
	int update(SolveDO solve);
	
	int remove(Integer queId);
	
	int batchRemove(Integer[] queIds);
}
