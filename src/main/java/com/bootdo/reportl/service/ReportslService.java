package com.bootdo.reportl.service;

import com.bootdo.reportl.domain.ReportslDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-20 00:10:28
 */
public interface ReportslService {
	
	ReportslDO get(Integer contractId);
	
	List<ReportslDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReportslDO reportsl);
	
	int update(ReportslDO reportsl);
	
	int remove(Integer contractId);
	
	int batchRemove(Integer[] contractIds);
}
