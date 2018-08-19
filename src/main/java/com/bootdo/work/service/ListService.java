package com.bootdo.work.service;

import com.bootdo.work.domain.ListDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author jundada
 * @email 1992lcg@163.com
 * @date 2018-08-14 16:06:13
 */
public interface ListService {
	
	ListDO get(String workId);
	
	List<ListDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ListDO list);
	
	int update(ListDO list);
	
	int remove(String workId);
	
	int batchRemove(String[] workIds);
}
