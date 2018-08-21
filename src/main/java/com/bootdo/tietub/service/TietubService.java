package com.bootdo.tietub.service;

import com.bootdo.tietub.domain.TietubDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:28:37
 */
public interface TietubService {
	
	TietubDO get(Integer id);
	
	List<TietubDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietubDO tietub);
	
	int update(TietubDO tietub);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
