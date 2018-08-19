package com.bootdo.system.dao;

import com.bootdo.system.domain.GroupDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 09:19:38
 */
@Mapper
public interface GroupDao {

	GroupDO get(String serveId);
	
	List<GroupDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(GroupDO group);
	
	int update(GroupDO group);
	
	int remove(String serve_id);
	
	int batchRemove(String[] serveIds);
}
