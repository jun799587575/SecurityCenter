package com.bootdo.poiu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.poiu.dao.LkjhDao;
import com.bootdo.poiu.domain.LkjhDO;
import com.bootdo.poiu.service.LkjhService;



@Service
public class LkjhServiceImpl implements LkjhService {
	@Autowired
	private LkjhDao lkjhDao;
	
	@Override
	public LkjhDO get(String asdd){
		return lkjhDao.get(asdd);
	}
	
	@Override
	public List<LkjhDO> list(Map<String, Object> map){
		return lkjhDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return lkjhDao.count(map);
	}
	
	@Override
	public int save(LkjhDO lkjh){
		return lkjhDao.save(lkjh);
	}
	
	@Override
	public int update(LkjhDO lkjh){
		return lkjhDao.update(lkjh);
	}
	
	@Override
	public int remove(String asdd){
		return lkjhDao.remove(asdd);
	}
	
	@Override
	public int batchRemove(String[] asdds){
		return lkjhDao.batchRemove(asdds);
	}
	
}
