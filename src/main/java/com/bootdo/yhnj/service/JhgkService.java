package com.bootdo.yhnj.service;

import com.bootdo.yhnj.domain.JhgkDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 23:54:42
 */
public interface JhgkService {
	
	JhgkDO get(String asd);
	
	List<JhgkDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(JhgkDO jhgk);
	
	int update(JhgkDO jhgk);
	
	int remove(String asd);
	
	int batchRemove(String[] asds);
}
