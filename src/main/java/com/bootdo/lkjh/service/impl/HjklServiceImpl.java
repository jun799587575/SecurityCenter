package com.bootdo.lkjh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.lkjh.dao.HjklDao;
import com.bootdo.lkjh.domain.HjklDO;
import com.bootdo.lkjh.service.HjklService;



@Service
public class HjklServiceImpl implements HjklService {
	@Autowired
	private HjklDao hjklDao;
	
	@Override
	public HjklDO get(String asd){
		return hjklDao.get(asd);
	}
	
	@Override
	public List<HjklDO> list(Map<String, Object> map){
		return hjklDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return hjklDao.count(map);
	}
	
	@Override
	public int save(HjklDO hjkl){
		return hjklDao.save(hjkl);
	}
	
	@Override
	public int update(HjklDO hjkl){
		return hjklDao.update(hjkl);
	}
	
	@Override
	public int remove(String asd){
		return hjklDao.remove(asd);
	}
	
	@Override
	public int batchRemove(String[] asds){
		return hjklDao.batchRemove(asds);
	}
	
}
