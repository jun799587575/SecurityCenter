package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.CancelDao;
import com.bootdo.system.domain.CancelDO;
import com.bootdo.system.service.CancelService;



@Service
public class CancelServiceImpl implements CancelService {
	@Autowired
	private CancelDao cancelDao;
	
	@Override
	public CancelDO get(Integer queId){
		return cancelDao.get(queId);
	}
	
	@Override
	public List<CancelDO> list(Map<String, Object> map){
		return cancelDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return cancelDao.count(map);
	}
	
	@Override
	public int save(CancelDO cancel){
		return cancelDao.save(cancel);
	}
	
	@Override
	public int update(CancelDO cancel){
		return cancelDao.update(cancel);
	}
	
	@Override
	public int remove(Integer queId){
		return cancelDao.remove(queId);
	}
	
	@Override
	public int batchRemove(Integer[] queIds){
		return cancelDao.batchRemove(queIds);
	}
	
}
