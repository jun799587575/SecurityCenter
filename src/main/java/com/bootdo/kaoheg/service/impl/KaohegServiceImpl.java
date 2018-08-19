package com.bootdo.kaoheg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.kaoheg.dao.KaohegDao;
import com.bootdo.kaoheg.domain.KaohegDO;
import com.bootdo.kaoheg.service.KaohegService;



@Service
public class KaohegServiceImpl implements KaohegService {
	@Autowired
	private KaohegDao kaohegDao;
	
	@Override
	public KaohegDO get(Integer id){
		return kaohegDao.get(id);
	}
	
	@Override
	public List<KaohegDO> list(Map<String, Object> map){
		return kaohegDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return kaohegDao.count(map);
	}
	
	@Override
	public int save(KaohegDO kaoheg){
		return kaohegDao.save(kaoheg);
	}
	
	@Override
	public int update(KaohegDO kaoheg){
		return kaohegDao.update(kaoheg);
	}
	
	@Override
	public int remove(Integer id){
		return kaohegDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return kaohegDao.batchRemove(ids);
	}
	
}
