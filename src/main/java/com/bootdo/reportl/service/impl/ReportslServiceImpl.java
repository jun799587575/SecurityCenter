package com.bootdo.reportl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.reportl.dao.ReportslDao;
import com.bootdo.reportl.domain.ReportslDO;
import com.bootdo.reportl.service.ReportslService;



@Service
public class ReportslServiceImpl implements ReportslService {
	@Autowired
	private ReportslDao reportslDao;
	
	@Override
	public ReportslDO get(Integer contractId){
		return reportslDao.get(contractId);
	}
	
	@Override
	public List<ReportslDO> list(Map<String, Object> map){
		return reportslDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return reportslDao.count(map);
	}
	
	@Override
	public int save(ReportslDO reportsl){
		return reportslDao.save(reportsl);
	}
	
	@Override
	public int update(ReportslDO reportsl){
		return reportslDao.update(reportsl);
	}
	
	@Override
	public int remove(Integer contractId){
		return reportslDao.remove(contractId);
	}
	
	@Override
	public int batchRemove(Integer[] contractIds){
		return reportslDao.batchRemove(contractIds);
	}
	
}
