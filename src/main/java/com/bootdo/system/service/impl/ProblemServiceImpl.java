package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ProblemDao;
import com.bootdo.system.domain.ProblemDO;
import com.bootdo.system.service.ProblemService;



@Service
public class ProblemServiceImpl implements ProblemService {
	@Autowired
	private ProblemDao problemDao;
	
	@Override
	public ProblemDO get(Integer queId){
		return problemDao.get(queId);
	}
	
	@Override
	public List<ProblemDO> list(Map<String, Object> map){
		return problemDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return problemDao.count(map);
	}
	
	@Override
	public int save(ProblemDO problem){
		return problemDao.save(problem);
	}
	
	@Override
	public int update(ProblemDO problem){
		return problemDao.update(problem);
	}
	
	@Override
	public int remove(Integer queId){
		return problemDao.remove(queId);
	}
	
	@Override
	public int batchRemove(Integer[] queIds){
		return problemDao.batchRemove(queIds);
	}
	
}
