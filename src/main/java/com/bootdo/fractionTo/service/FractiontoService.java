package com.bootdo.fractionTo.service;

import com.bootdo.fractionTo.domain.FractiontoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 23:08:41
 */
public interface FractiontoService {
	
	FractiontoDO get(Integer id);
	
	List<FractiontoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FractiontoDO fractionto);
	
	int update(FractiontoDO fractionto);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
