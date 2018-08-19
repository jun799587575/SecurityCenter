package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.SolveDao;
import com.bootdo.system.domain.SolveDO;
import com.bootdo.system.service.SolveService;



@Service
public class SolveServiceImpl implements SolveService {
	@Autowired
	private SolveDao solveDao;
	
	@Override
	public SolveDO get(Integer queId){
		return solveDao.get(queId);
	}
	
	@Override
	public List<SolveDO> list(Map<String, Object> map){
		return solveDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return solveDao.count(map);
	}
	
	@Override
	public int save(SolveDO solve){
		return solveDao.save(solve);
	}
	
	@Override
	public int update(SolveDO solve){
		return solveDao.update(solve);
	}
	
	@Override
	public int remove(Integer queId){
		return solveDao.remove(queId);
	}
	
	@Override
	public int batchRemove(Integer[] queIds){
		return solveDao.batchRemove(queIds);
	}
	
}
