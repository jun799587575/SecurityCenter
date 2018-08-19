package com.bootdo.worker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.worker.dao.ListerDao;
import com.bootdo.worker.domain.ListerDO;
import com.bootdo.worker.service.ListerService;



@Service
public class ListerServiceImpl implements ListerService {
	@Autowired
	private ListerDao listerDao;
	
	@Override
	public ListerDO get(Integer workId){
		return listerDao.get(workId);
	}
	
	@Override
	public List<ListerDO> list(Map<String, Object> map){
		return listerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return listerDao.count(map);
	}
	
	@Override
	public int save(ListerDO lister){
		return listerDao.save(lister);
	}
	
	@Override
	public int update(ListerDO lister){
		return listerDao.update(lister);
	}
	
	@Override
	public int remove(Integer workId){
		return listerDao.remove(workId);
	}
	
	@Override
	public int batchRemove(Integer[] workIds){
		return listerDao.batchRemove(workIds);
	}
	
}
