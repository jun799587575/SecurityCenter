package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.IsproblemDao;
import com.bootdo.system.domain.IsproblemDO;
import com.bootdo.system.service.IsproblemService;



@Service
public class IsproblemServiceImpl implements IsproblemService {
	@Autowired
	private IsproblemDao isproblemDao;
	
	@Override
	public IsproblemDO get(Integer queId){
		return isproblemDao.get(queId);
	}
	
	@Override
	public List<IsproblemDO> list(Map<String, Object> map){
		return isproblemDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return isproblemDao.count(map);
	}
	
	@Override
	public int save(IsproblemDO isproblem){
		return isproblemDao.save(isproblem);
	}
	
	@Override
	public int update(IsproblemDO isproblem){
		return isproblemDao.update(isproblem);
	}
	
	@Override
	public int remove(Integer queId){
		return isproblemDao.remove(queId);
	}
	
	@Override
	public int batchRemove(Integer[] queIds){
		return isproblemDao.batchRemove(queIds);
	}
	
}
