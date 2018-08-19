package com.bootdo.system.service;

import com.bootdo.system.domain.ClientDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:18
 */
public interface ClientService {
	
	ClientDO get(Integer conId);
	
	List<ClientDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ClientDO client);
	
	int update(ClientDO client);
	
	int remove(Integer conId);
	
	int batchRemove(Integer[] conIds);
}
