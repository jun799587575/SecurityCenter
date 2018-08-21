package com.bootdo.reportl.dao;

import com.bootdo.reportl.domain.ReportslDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-20 00:10:28
 */
@Mapper
public interface ReportslDao {

	ReportslDO get(Integer contractId);
	
	List<ReportslDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ReportslDO reportsl);
	
	int update(ReportslDO reportsl);
	
	int remove(Integer contract_Id);
	
	int batchRemove(Integer[] contractIds);
}
