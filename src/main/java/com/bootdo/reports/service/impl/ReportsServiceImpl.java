package com.bootdo.reports.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.reports.dao.ReportsDao;
import com.bootdo.reports.domain.ReportsDO;
import com.bootdo.reports.service.ReportsService;



@Service
public class ReportsServiceImpl implements ReportsService {
	@Autowired
	private ReportsDao reportsDao;
	
	@Override
	public ReportsDO get(Integer contractId){
		return reportsDao.get(contractId);
	}
	
	@Override
	public List<ReportsDO> list(Map<String, Object> map){
		return reportsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return reportsDao.count(map);
	}
	
	@Override
	public int save(ReportsDO reports){
		return reportsDao.save(reports);
	}
	
	@Override
	public int update(ReportsDO reports){
		return reportsDao.update(reports);
	}
	
	@Override
	public int remove(Integer contractId){
		return reportsDao.remove(contractId);
	}
	
	@Override
	public int batchRemove(Integer[] contractIds){
		return reportsDao.batchRemove(contractIds);
	}
	
}
