package com.bootdo.tietub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.tietub.dao.TietubDao;
import com.bootdo.tietub.domain.TietubDO;
import com.bootdo.tietub.service.TietubService;



@Service
public class TietubServiceImpl implements TietubService {
	@Autowired
	private TietubDao tietubDao;
	
	@Override
	public TietubDO get(Integer id){
		return tietubDao.get(id);
	}
	
	@Override
	public List<TietubDO> list(Map<String, Object> map){
		return tietubDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tietubDao.count(map);
	}
	
	@Override
	public int save(TietubDO tietub){
		return tietubDao.save(tietub);
	}
	
	@Override
	public int update(TietubDO tietub){
		return tietubDao.update(tietub);
	}
	
	@Override
	public int remove(Integer id){
		return tietubDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return tietubDao.batchRemove(ids);
	}
	
}
