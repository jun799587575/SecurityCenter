package com.bootdo.complaints.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.complaints.dao.ComplaintsDao;
import com.bootdo.complaints.domain.ComplaintsDO;
import com.bootdo.complaints.service.ComplaintsService;



@Service
public class ComplaintsServiceImpl implements ComplaintsService {
	@Autowired
	private ComplaintsDao complaintsDao;
	
	@Override
	public ComplaintsDO get(Integer id){
		return complaintsDao.get(id);
	}
	
	@Override
	public List<ComplaintsDO> list(Map<String, Object> map){
		return complaintsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return complaintsDao.count(map);
	}
	
	@Override
	public int save(ComplaintsDO complaints){
		return complaintsDao.save(complaints);
	}
	
	@Override
	public int update(ComplaintsDO complaints){
		return complaintsDao.update(complaints);
	}
	
	@Override
	public int remove(Integer id){
		return complaintsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return complaintsDao.batchRemove(ids);
	}
	
}
