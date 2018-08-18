package com.bootdo.fraction.service;

import com.bootdo.fraction.domain.FractionDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 17:45:59
 */
public interface FractionService {
	
	FractionDO get(Integer id);
	
	List<FractionDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FractionDO fraction);
	
	int update(FractionDO fraction);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
