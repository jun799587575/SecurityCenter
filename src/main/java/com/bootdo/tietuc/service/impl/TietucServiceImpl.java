package com.bootdo.tietuc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.tietuc.dao.TietucDao;
import com.bootdo.tietuc.domain.TietucDO;
import com.bootdo.tietuc.service.TietucService;



@Service
public class TietucServiceImpl implements TietucService {
	@Autowired
	private TietucDao tietucDao;
	
	@Override
	public TietucDO get(Integer id){
		return tietucDao.get(id);
	}
	
	@Override
	public List<TietucDO> list(Map<String, Object> map){
		return tietucDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tietucDao.count(map);
	}
	
	@Override
	public int save(TietucDO tietuc){
		return tietucDao.save(tietuc);
	}
	
	@Override
	public int update(TietucDO tietuc){
		return tietucDao.update(tietuc);
	}
	
	@Override
	public int remove(Integer id){
		return tietucDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return tietucDao.batchRemove(ids);
	}
	
}
