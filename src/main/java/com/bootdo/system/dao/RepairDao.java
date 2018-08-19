package com.bootdo.system.dao;

import com.bootdo.system.domain.RepairDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-18 11:39:41
 */
@Mapper
public interface RepairDao {

	RepairDO get(Integer queId);
	
	List<RepairDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(RepairDO repair);
	
	int update(RepairDO repair);
	
	int remove(Integer que_id);
	
	int batchRemove(Integer[] queIds);
}
