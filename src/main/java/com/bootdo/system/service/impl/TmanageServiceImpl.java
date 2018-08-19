package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.TmanageDao;
import com.bootdo.system.domain.TmanageDO;
import com.bootdo.system.service.TmanageService;



@Service
public class TmanageServiceImpl implements TmanageService {
	@Autowired
	private TmanageDao tmanageDao;
	
	@Override
	public TmanageDO get(String sltId){
		return tmanageDao.get(sltId);
	}
	
	@Override
	public List<TmanageDO> list(Map<String, Object> map){
		return tmanageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tmanageDao.count(map);
	}
	
	@Override
	public int save(TmanageDO tmanage){
		return tmanageDao.save(tmanage);
	}
	
	@Override
	public int update(TmanageDO tmanage){
		return tmanageDao.update(tmanage);
	}
	
	@Override
	public int remove(String sltId){
		return tmanageDao.remove(sltId);
	}
	
	@Override
	public int batchRemove(String[] sltIds){
		return tmanageDao.batchRemove(sltIds);
	}
	
}
