package com.bootdo.tietug.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.tietug.dao.TietugDao;
import com.bootdo.tietug.domain.TietugDO;
import com.bootdo.tietug.service.TietugService;



@Service
public class TietugServiceImpl implements TietugService {
	@Autowired
	private TietugDao tietugDao;
	
	@Override
	public TietugDO get(Integer id){
		return tietugDao.get(id);
	}
	
	@Override
	public List<TietugDO> list(Map<String, Object> map){
		return tietugDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tietugDao.count(map);
	}
	
	@Override
	public int save(TietugDO tietug){
		return tietugDao.save(tietug);
	}
	
	@Override
	public int update(TietugDO tietug){
		return tietugDao.update(tietug);
	}
	
	@Override
	public int remove(Integer id){
		return tietugDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return tietugDao.batchRemove(ids);
	}
	
}
