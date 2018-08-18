package com.bootdo.reportTo.service;

import com.bootdo.reportTo.domain.ReporttoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-15 19:07:21
 */
public interface ReporttoService {
	
	ReporttoDO get(Integer contractId);
	
	List<ReporttoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReporttoDO reportto);
	
	int update(ReporttoDO reportto);
	
	int remove(Integer contractId);
	
	int batchRemove(Integer[] contractIds);
}
