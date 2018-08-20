package com.bootdo.plmn.service;

import com.bootdo.plmn.domain.NmlpDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 22:46:38
 */
public interface NmlpService {
	
	NmlpDO get(String asd);
	
	List<NmlpDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NmlpDO nmlp);
	
	int update(NmlpDO nmlp);
	
	int remove(String asd);
	
	int batchRemove(String[] asds);
}
