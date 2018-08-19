package com.bootdo.system.service;

import com.bootdo.system.domain.IsproblemDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:14:01
 */
public interface IsproblemService {
	
	IsproblemDO get(Integer queId);
	
	List<IsproblemDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IsproblemDO isproblem);
	
	int update(IsproblemDO isproblem);
	
	int remove(Integer queId);
	
	int batchRemove(Integer[] queIds);
}
