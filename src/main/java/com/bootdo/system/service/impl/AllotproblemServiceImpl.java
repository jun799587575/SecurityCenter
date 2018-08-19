package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.AllotproblemDao;
import com.bootdo.system.domain.AllotproblemDO;
import com.bootdo.system.service.AllotproblemService;



@Service
public class AllotproblemServiceImpl implements AllotproblemService {
	@Autowired
	private AllotproblemDao allotproblemDao;
	
	@Override
	public AllotproblemDO get(Integer queId){
		return allotproblemDao.get(queId);
	}
	
	@Override
	public List<AllotproblemDO> list(Map<String, Object> map){
		return allotproblemDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return allotproblemDao.count(map);
	}
	
	@Override
	public int save(AllotproblemDO allotproblem){
		return allotproblemDao.save(allotproblem);
	}
	
	@Override
	public int update(AllotproblemDO allotproblem){
		return allotproblemDao.update(allotproblem);
	}
	
	@Override
	public int remove(Integer queId){
		return allotproblemDao.remove(queId);
	}
	
	@Override
	public int batchRemove(Integer[] queIds){
		return allotproblemDao.batchRemove(queIds);
	}
	
}
