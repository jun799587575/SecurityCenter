package com.bootdo.system.dao;

import com.bootdo.system.domain.PointDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 13:35:27
 */
@Mapper
public interface PointDao {

	PointDO get(Integer queId);
	
	List<PointDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(PointDO point);
	
	int update(PointDO point);
	
	int remove(Integer que_id);
	
	int batchRemove(Integer[] queIds);
}
