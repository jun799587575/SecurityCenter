package com.bootdo.tietuf.service;

import com.bootdo.tietuf.domain.TietufDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 22:27:47
 */
public interface TietufService {
	
	TietufDO get(Integer id);
	
	List<TietufDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietufDO tietuf);
	
	int update(TietufDO tietuf);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
