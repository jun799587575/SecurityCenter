package com.bootdo.report.dao;

import com.bootdo.report.domain.ReportDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-15 14:19:13
 */
@Mapper
public interface ReportDao {

	ReportDO get(Integer contractId);
	
	List<ReportDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReportDO report);
	
	int update(ReportDO report);
	
	int remove(Integer contract_Id);
	
	int batchRemove(Integer[] contractIds);
}
