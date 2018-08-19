package com.bootdo.complaints.service;

import com.bootdo.complaints.domain.ComplaintsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 09:28:43
 */
public interface ComplaintsService {
	
	ComplaintsDO get(Integer id);
	
	List<ComplaintsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintsDO complaints);
	
	int update(ComplaintsDO complaints);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
