package com.bootdo.system.dao;

import com.bootdo.system.domain.LinkmenDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:40
 */
@Mapper
public interface LinkmenDao {

	LinkmenDO get(Integer linId);
	
	List<LinkmenDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(LinkmenDO linkmen);
	
	int update(LinkmenDO linkmen);
	
	int remove(Integer lin_id);
	
	int batchRemove(Integer[] linIds);
}
