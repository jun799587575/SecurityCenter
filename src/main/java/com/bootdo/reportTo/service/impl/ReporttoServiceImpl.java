package com.bootdo.reportTo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.reportTo.dao.ReporttoDao;
import com.bootdo.reportTo.domain.ReporttoDO;
import com.bootdo.reportTo.service.ReporttoService;



@Service
public class ReporttoServiceImpl implements ReporttoService {
	@Autowired
	private ReporttoDao reporttoDao;
	
	@Override
	public ReporttoDO get(Integer contractId){
		return reporttoDao.get(contractId);
	}
	
	@Override
	public List<ReporttoDO> list(Map<String, Object> map){
		return reporttoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return reporttoDao.count(map);
	}
	
	@Override
	public int save(ReporttoDO reportto){
		return reporttoDao.save(reportto);
	}
	
	@Override
	public int update(ReporttoDO reportto){
		return reporttoDao.update(reportto);
	}
	
	@Override
	public int remove(Integer contractId){
		return reporttoDao.remove(contractId);
	}
	
	@Override
	public int batchRemove(Integer[] contractIds){
		return reporttoDao.batchRemove(contractIds);
	}
	
}
