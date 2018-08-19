package com.bootdo.deploy.service;

import com.bootdo.deploy.domain.NasDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:36
 */
public interface NasService {
	
	NasDO get(Integer nasId);
	
	List<NasDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NasDO nas);
	
	int update(NasDO nas);
	
	int remove(Integer nasId);
	
	int batchRemove(Integer[] nasIds);
}
