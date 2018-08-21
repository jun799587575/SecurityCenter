package com.bootdo.reports.dao;

import com.bootdo.reports.domain.ReportsDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-19 23:44:33
 */
@Mapper
public interface ReportsDao {

	ReportsDO get(Integer contractId);
	
	List<ReportsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReportsDO reports);
	
	int update(ReportsDO reports);
	
	int remove(Integer contract_Id);
	
	int batchRemove(Integer[] contractIds);
}
