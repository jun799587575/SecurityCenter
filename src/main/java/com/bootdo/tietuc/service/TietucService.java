package com.bootdo.tietuc.service;

import com.bootdo.tietuc.domain.TietucDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:47:21
 */
public interface TietucService {
	
	TietucDO get(Integer id);
	
	List<TietucDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietucDO tietuc);
	
	int update(TietucDO tietuc);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
