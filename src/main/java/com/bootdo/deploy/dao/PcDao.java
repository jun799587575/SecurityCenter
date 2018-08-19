package com.bootdo.deploy.dao;

import com.bootdo.deploy.domain.PcDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:37
 */
@Mapper
public interface PcDao {

	PcDO get(Integer pcId);
	
	List<PcDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PcDO pc);
	
	int update(PcDO pc);
	
	int remove(Integer pc_id);
	
	int batchRemove(Integer[] pcIds);
}
