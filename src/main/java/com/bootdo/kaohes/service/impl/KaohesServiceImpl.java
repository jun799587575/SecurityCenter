package com.bootdo.kaohes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.kaohes.dao.KaohesDao;
import com.bootdo.kaohes.domain.KaohesDO;
import com.bootdo.kaohes.service.KaohesService;



@Service
public class KaohesServiceImpl implements KaohesService {
	@Autowired
	private KaohesDao kaohesDao;
	
	@Override
	public KaohesDO get(Integer id){
		return kaohesDao.get(id);
	}
	
	@Override
	public List<KaohesDO> list(Map<String, Object> map){
		return kaohesDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return kaohesDao.count(map);
	}
	
	@Override
	public int save(KaohesDO kaohes){
		return kaohesDao.save(kaohes);
	}
	
	@Override
	public int update(KaohesDO kaohes){
		return kaohesDao.update(kaohes);
	}
	
	@Override
	public int remove(Integer id){
		return kaohesDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return kaohesDao.batchRemove(ids);
	}
	
}
