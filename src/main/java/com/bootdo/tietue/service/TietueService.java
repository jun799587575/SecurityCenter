package com.bootdo.tietue.service;

import com.bootdo.tietue.domain.TietueDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 22:16:12
 */
public interface TietueService {
	
	TietueDO get(Integer id);
	
	List<TietueDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietueDO tietue);
	
	int update(TietueDO tietue);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
