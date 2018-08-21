package com.bootdo.tietue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.tietue.dao.TietueDao;
import com.bootdo.tietue.domain.TietueDO;
import com.bootdo.tietue.service.TietueService;



@Service
public class TietueServiceImpl implements TietueService {
	@Autowired
	private TietueDao tietueDao;
	
	@Override
	public TietueDO get(Integer id){
		return tietueDao.get(id);
	}
	
	@Override
	public List<TietueDO> list(Map<String, Object> map){
		return tietueDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tietueDao.count(map);
	}
	
	@Override
	public int save(TietueDO tietue){
		return tietueDao.save(tietue);
	}
	
	@Override
	public int update(TietueDO tietue){
		return tietueDao.update(tietue);
	}
	
	@Override
	public int remove(Integer id){
		return tietueDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return tietueDao.batchRemove(ids);
	}
	
}
