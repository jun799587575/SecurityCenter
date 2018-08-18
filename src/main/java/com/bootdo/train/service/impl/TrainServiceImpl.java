package com.bootdo.train.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.train.dao.TrainDao;
import com.bootdo.train.domain.TrainDO;
import com.bootdo.train.service.TrainService;



@Service
public class TrainServiceImpl implements TrainService {
	@Autowired
	private TrainDao trainDao;
	
	@Override
	public TrainDO get(Integer id){
		return trainDao.get(id);
	}
	
	@Override
	public List<TrainDO> list(Map<String, Object> map){
		return trainDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return trainDao.count(map);
	}
	
	@Override
	public int save(TrainDO train){
		return trainDao.save(train);
	}
	
	@Override
	public int update(TrainDO train){
		return trainDao.update(train);
	}
	
	@Override
	public int remove(Integer id){
		return trainDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return trainDao.batchRemove(ids);
	}
	
}
