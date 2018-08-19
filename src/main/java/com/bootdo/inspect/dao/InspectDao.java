package com.bootdo.inspect.dao;

import com.bootdo.inspect.domain.InspectDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:35:08
 */
@Mapper
public interface InspectDao {

	InspectDO get(Integer inspectId);
	
	List<InspectDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(InspectDO inspect);
	
	int update(InspectDO inspect);
	
	int remove(Integer inspect_id);
	
	int batchRemove(Integer[] inspectIds);
}
