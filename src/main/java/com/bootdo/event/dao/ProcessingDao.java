package com.bootdo.event.dao;

import com.bootdo.event.domain.ProcessingDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 09:46:07
 */
@Mapper
public interface ProcessingDao {

	ProcessingDO get(Integer eventId);
	
	List<ProcessingDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ProcessingDO processing);
	
	int update(ProcessingDO processing);
	
	int remove(Integer event_id);
	
	int batchRemove(Integer[] eventIds);
}
