package com.bootdo.tietua.service;

import com.bootdo.tietua.domain.TietuaDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:13:25
 */
public interface TietuaService {
	
	TietuaDO get(Integer id);
	
	List<TietuaDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietuaDO tietua);
	
	int update(TietuaDO tietua);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
