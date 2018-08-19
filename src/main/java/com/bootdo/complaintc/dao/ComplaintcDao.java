package com.bootdo.complaintc.dao;

import com.bootdo.complaintc.domain.ComplaintcDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 10:43:31
 */
@Mapper
public interface ComplaintcDao {

	ComplaintcDO get(Integer id);
	
	List<ComplaintcDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintcDO complaintc);
	
	int update(ComplaintcDO complaintc);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
