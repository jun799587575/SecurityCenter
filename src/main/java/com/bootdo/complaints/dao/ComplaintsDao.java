package com.bootdo.complaints.dao;

import com.bootdo.complaints.domain.ComplaintsDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 09:28:43
 */
@Mapper
public interface ComplaintsDao {

	ComplaintsDO get(Integer id);
	
	List<ComplaintsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintsDO complaints);
	
	int update(ComplaintsDO complaints);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
