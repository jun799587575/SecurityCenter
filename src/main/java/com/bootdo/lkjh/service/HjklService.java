package com.bootdo.lkjh.service;

import com.bootdo.lkjh.domain.HjklDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 23:37:47
 */
public interface HjklService {
	
	HjklDO get(String asd);
	
	List<HjklDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(HjklDO hjkl);
	
	int update(HjklDO hjkl);
	
	int remove(String asd);
	
	int batchRemove(String[] asds);
}
