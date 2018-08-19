package com.bootdo.worker.dao;

import com.bootdo.worker.domain.ListerDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 14:04:31
 */
@Mapper
public interface ListerDao {

	ListerDO get(Integer workId);
	
	List<ListerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ListerDO lister);
	
	int update(ListerDO lister);
	
	int remove(Integer work_id);
	
	int batchRemove(Integer[] workIds);
}
