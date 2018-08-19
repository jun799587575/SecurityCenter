package com.bootdo.system.service;

import com.bootdo.system.domain.ProblemDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 13:57:03
 */
public interface ProblemService {
	
	ProblemDO get(Integer queId);
	
	List<ProblemDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ProblemDO problem);
	
	int update(ProblemDO problem);
	
	int remove(Integer queId);
	
	int batchRemove(Integer[] queIds);
}
