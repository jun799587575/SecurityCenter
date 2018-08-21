package com.bootdo.tietud.service;

import com.bootdo.tietud.domain.TietudDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:58:39
 */
public interface TietudService {
	
	TietudDO get(Integer id);
	
	List<TietudDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietudDO tietud);
	
	int update(TietudDO tietud);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
