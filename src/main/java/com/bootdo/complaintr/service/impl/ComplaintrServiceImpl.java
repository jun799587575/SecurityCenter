package com.bootdo.complaintr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.complaintr.dao.ComplaintrDao;
import com.bootdo.complaintr.domain.ComplaintrDO;
import com.bootdo.complaintr.service.ComplaintrService;



@Service
public class ComplaintrServiceImpl implements ComplaintrService {
	@Autowired
	private ComplaintrDao complaintrDao;
	
	@Override
	public ComplaintrDO get(Integer id){
		return complaintrDao.get(id);
	}
	
	@Override
	public List<ComplaintrDO> list(Map<String, Object> map){
		return complaintrDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return complaintrDao.count(map);
	}
	
	@Override
	public int save(ComplaintrDO complaintr){
		return complaintrDao.save(complaintr);
	}
	
	@Override
	public int update(ComplaintrDO complaintr){
		return complaintrDao.update(complaintr);
	}
	
	@Override
	public int remove(Integer id){
		return complaintrDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return complaintrDao.batchRemove(ids);
	}
	
}
