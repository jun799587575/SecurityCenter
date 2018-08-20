package com.bootdo.reports.service;

import com.bootdo.reports.domain.ReportsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 23:44:33
 */
public interface ReportsService {
	
	ReportsDO get(Integer contractId);
	
	List<ReportsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReportsDO reports);
	
	int update(ReportsDO reports);
	
	int remove(Integer contractId);
	
	int batchRemove(Integer[] contractIds);
}
