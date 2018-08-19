package com.bootdo.complaint.dao;

import com.bootdo.complaint.domain.ComplaintDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 14:51:40
 */
@Mapper
public interface ComplaintDao {

	ComplaintDO get(Integer id);
	
	List<ComplaintDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintDO complaint);
	
	int update(ComplaintDO complaint);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
