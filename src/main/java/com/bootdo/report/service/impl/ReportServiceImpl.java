package com.bootdo.report.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.report.dao.ReportDao;
import com.bootdo.report.domain.ReportDO;
import com.bootdo.report.service.ReportService;



@Service
public class ReportServiceImpl implements ReportService {
	@Autowired
	private ReportDao reportDao;
	
	@Override
	public ReportDO get(Integer contractId){
		return reportDao.get(contractId);
	}
	
	@Override
	public List<ReportDO> list(Map<String, Object> map){
		return reportDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return reportDao.count(map);
	}
	
	@Override
	public int save(ReportDO report){
		return reportDao.save(report);
	}
	
	@Override
	public int update(ReportDO report){
		return reportDao.update(report);
	}
	
	@Override
	public int remove(Integer contractId){
		return reportDao.remove(contractId);
	}
	
	@Override
	public int batchRemove(Integer[] contractIds){
		return reportDao.batchRemove(contractIds);
	}
	
}
