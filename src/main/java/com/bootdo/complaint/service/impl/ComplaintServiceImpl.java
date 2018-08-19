package com.bootdo.complaint.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.complaint.dao.ComplaintDao;
import com.bootdo.complaint.domain.ComplaintDO;
import com.bootdo.complaint.service.ComplaintService;



@Service
public class ComplaintServiceImpl implements ComplaintService {
	@Autowired
	private ComplaintDao complaintDao;
	
	@Override
	public ComplaintDO get(Integer id){
		return complaintDao.get(id);
	}
	
	@Override
	public List<ComplaintDO> list(Map<String, Object> map){
		return complaintDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return complaintDao.count(map);
	}
	
	@Override
	public int save(ComplaintDO complaint){
		return complaintDao.save(complaint);
	}
	
	@Override
	public int update(ComplaintDO complaint){
		return complaintDao.update(complaint);
	}
	
	@Override
	public int remove(Integer id){
		return complaintDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return complaintDao.batchRemove(ids);
	}
	
}
