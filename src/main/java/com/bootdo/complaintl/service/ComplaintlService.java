package com.bootdo.complaintl.service;

import com.bootdo.complaintl.domain.ComplaintlDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 10:06:01
 */
public interface ComplaintlService {
	
	ComplaintlDO get(Integer id);
	
	List<ComplaintlDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintlDO complaintl);
	
	int update(ComplaintlDO complaintl);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
