package com.bootdo.work.dao;

import com.bootdo.work.domain.ListDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author jundada
 * @email 1992lcg@163.com
 * @date 2018-08-14 16:06:13
 */
@Mapper
public interface ListDao {

	ListDO get(String workId);
	
	List<ListDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ListDO list);
	
	int update(ListDO list);
	
	int remove(String work_id);
	
	int batchRemove(String[] workIds);
}
