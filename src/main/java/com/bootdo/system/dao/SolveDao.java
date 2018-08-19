package com.bootdo.system.dao;

import com.bootdo.system.domain.SolveDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 12:04:01
 */
@Mapper
public interface SolveDao {

	SolveDO get(Integer queId);
	
	List<SolveDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(SolveDO solve);
	
	int update(SolveDO solve);
	
	int remove(Integer que_id);
	
	int batchRemove(Integer[] queIds);
}
