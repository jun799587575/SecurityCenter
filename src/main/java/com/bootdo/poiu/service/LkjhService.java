package com.bootdo.poiu.service;

import com.bootdo.poiu.domain.LkjhDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 21:30:49
 */
public interface LkjhService {
	
	LkjhDO get(String asdd);
	
	List<LkjhDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LkjhDO lkjh);
	
	int update(LkjhDO lkjh);
	
	int remove(String asdd);
	
	int batchRemove(String[] asdds);
}
