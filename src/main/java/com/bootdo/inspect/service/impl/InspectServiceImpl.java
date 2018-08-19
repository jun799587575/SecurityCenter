package com.bootdo.inspect.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.inspect.dao.InspectDao;
import com.bootdo.inspect.domain.InspectDO;
import com.bootdo.inspect.service.InspectService;



@Service
public class InspectServiceImpl implements InspectService {
	@Autowired
	private InspectDao inspectDao;
	
	@Override
	public InspectDO get(Integer inspectId){
		return inspectDao.get(inspectId);
	}
	
	@Override
	public List<InspectDO> list(Map<String, Object> map){
		return inspectDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return inspectDao.count(map);
	}
	
	@Override
	public int save(InspectDO inspect){
		return inspectDao.save(inspect);
	}
	
	@Override
	public int update(InspectDO inspect){
		return inspectDao.update(inspect);
	}
	
	@Override
	public int remove(Integer inspectId){
		return inspectDao.remove(inspectId);
	}
	
	@Override
	public int batchRemove(Integer[] inspectIds){
		return inspectDao.batchRemove(inspectIds);
	}
	
}
