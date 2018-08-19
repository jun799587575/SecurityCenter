package com.bootdo.system.service;

import com.bootdo.system.domain.GroupDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:19:38
 */
public interface GroupService {
	
	GroupDO get(String serveId);
	
	List<GroupDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GroupDO group);
	
	int update(GroupDO group);
	
	int remove(String serveId);
	
	int batchRemove(String[] serveIds);
}
