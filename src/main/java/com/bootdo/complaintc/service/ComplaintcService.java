package com.bootdo.complaintc.service;

import com.bootdo.complaintc.domain.ComplaintcDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 10:43:31
 */
public interface ComplaintcService {
	
	ComplaintcDO get(Integer id);
	
	List<ComplaintcDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintcDO complaintc);
	
	int update(ComplaintcDO complaintc);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
