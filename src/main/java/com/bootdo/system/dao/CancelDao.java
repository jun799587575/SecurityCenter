package com.bootdo.system.dao;

import com.bootdo.system.domain.CancelDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 12:21:39
 */
@Mapper
public interface CancelDao {

	CancelDO get(Integer queId);
	
	List<CancelDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(CancelDO cancel);
	
	int update(CancelDO cancel);
	
	int remove(Integer que_id);
	
	int batchRemove(Integer[] queIds);
}
