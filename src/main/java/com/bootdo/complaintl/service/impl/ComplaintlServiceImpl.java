package com.bootdo.complaintl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.complaintl.dao.ComplaintlDao;
import com.bootdo.complaintl.domain.ComplaintlDO;
import com.bootdo.complaintl.service.ComplaintlService;



@Service
public class ComplaintlServiceImpl implements ComplaintlService {
	@Autowired
	private ComplaintlDao complaintlDao;
	
	@Override
	public ComplaintlDO get(Integer id){
		return complaintlDao.get(id);
	}
	
	@Override
	public List<ComplaintlDO> list(Map<String, Object> map){
		return complaintlDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return complaintlDao.count(map);
	}
	
	@Override
	public int save(ComplaintlDO complaintl){
		return complaintlDao.save(complaintl);
	}
	
	@Override
	public int update(ComplaintlDO complaintl){
		return complaintlDao.update(complaintl);
	}
	
	@Override
	public int remove(Integer id){
		return complaintlDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return complaintlDao.batchRemove(ids);
	}
	
}
