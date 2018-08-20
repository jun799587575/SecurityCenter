package com.bootdo.mnbv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.mnbv.dao.LmnbDao;
import com.bootdo.mnbv.domain.LmnbDO;
import com.bootdo.mnbv.service.LmnbService;



@Service
public class LmnbServiceImpl implements LmnbService {
	@Autowired
	private LmnbDao lmnbDao;
	
	@Override
	public LmnbDO get(String zxcv){
		return lmnbDao.get(zxcv);
	}
	
	@Override
	public List<LmnbDO> list(Map<String, Object> map){
		return lmnbDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return lmnbDao.count(map);
	}
	
	@Override
	public int save(LmnbDO lmnb){
		return lmnbDao.save(lmnb);
	}
	
	@Override
	public int update(LmnbDO lmnb){
		return lmnbDao.update(lmnb);
	}
	
	@Override
	public int remove(String zxcv){
		return lmnbDao.remove(zxcv);
	}
	
	@Override
	public int batchRemove(String[] zxcvs){
		return lmnbDao.batchRemove(zxcvs);
	}
	
}
