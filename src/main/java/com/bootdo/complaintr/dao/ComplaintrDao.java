package com.bootdo.complaintr.dao;

import com.bootdo.complaintr.domain.ComplaintrDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 11:19:14
 */
@Mapper
public interface ComplaintrDao {

	ComplaintrDO get(Integer id);
	
	List<ComplaintrDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintrDO complaintr);
	
	int update(ComplaintrDO complaintr);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
