package com.bootdo.complaint.service;

import com.bootdo.complaint.domain.ComplaintDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 14:51:40
 */
public interface ComplaintService {
	
	ComplaintDO get(Integer id);
	
	List<ComplaintDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintDO complaint);
	
	int update(ComplaintDO complaint);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
