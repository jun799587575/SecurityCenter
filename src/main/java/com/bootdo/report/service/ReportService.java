package com.bootdo.report.service;

import com.bootdo.report.domain.ReportDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-15 14:19:13
 */
public interface ReportService {
	
	ReportDO get(Integer contractId);
	
	List<ReportDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReportDO report);
	
	int update(ReportDO report);
	
	int remove(Integer contractId);
	
	int batchRemove(Integer[] contractIds);
}
