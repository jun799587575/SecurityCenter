package com.bootdo.tietuf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.tietuf.dao.TietufDao;
import com.bootdo.tietuf.domain.TietufDO;
import com.bootdo.tietuf.service.TietufService;



@Service
public class TietufServiceImpl implements TietufService {
	@Autowired
	private TietufDao tietufDao;
	
	@Override
	public TietufDO get(Integer id){
		return tietufDao.get(id);
	}
	
	@Override
	public List<TietufDO> list(Map<String, Object> map){
		return tietufDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tietufDao.count(map);
	}
	
	@Override
	public int save(TietufDO tietuf){
		return tietufDao.save(tietuf);
	}
	
	@Override
	public int update(TietufDO tietuf){
		return tietufDao.update(tietuf);
	}
	
	@Override
	public int remove(Integer id){
		return tietufDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return tietufDao.batchRemove(ids);
	}
	
}
