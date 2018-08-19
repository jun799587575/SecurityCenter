package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.PointDao;
import com.bootdo.system.domain.PointDO;
import com.bootdo.system.service.PointService;



@Service
public class PointServiceImpl implements PointService {
	@Autowired
	private PointDao pointDao;
	
	@Override
	public PointDO get(Integer queId){
		return pointDao.get(queId);
	}
	
	@Override
	public List<PointDO> list(Map<String, Object> map){
		return pointDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return pointDao.count(map);
	}
	
	@Override
	public int save(PointDO point){
		return pointDao.save(point);
	}
	
	@Override
	public int update(PointDO point){
		return pointDao.update(point);
	}
	
	@Override
	public int remove(Integer queId){
		return pointDao.remove(queId);
	}
	
	@Override
	public int batchRemove(Integer[] queIds){
		return pointDao.batchRemove(queIds);
	}
	
}
