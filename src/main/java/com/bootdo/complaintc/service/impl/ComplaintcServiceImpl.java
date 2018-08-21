package com.bootdo.complaintc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.complaintc.dao.ComplaintcDao;
import com.bootdo.complaintc.domain.ComplaintcDO;
import com.bootdo.complaintc.service.ComplaintcService;



@Service
public class ComplaintcServiceImpl implements ComplaintcService {
	@Autowired
	private ComplaintcDao complaintcDao;
	
	@Override
	public ComplaintcDO get(Integer id){
		return complaintcDao.get(id);
	}
	
	@Override
	public List<ComplaintcDO> list(Map<String, Object> map){
		return complaintcDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return complaintcDao.count(map);
	}
	
	@Override
	public int save(ComplaintcDO complaintc){
		return complaintcDao.save(complaintc);
	}
	
	@Override
	public int update(ComplaintcDO complaintc){
		return complaintcDao.update(complaintc);
	}
	
	@Override
	public int remove(Integer id){
		return complaintcDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return complaintcDao.batchRemove(ids);
	}
	
}
