package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.AmanageDao;
import com.bootdo.system.domain.AmanageDO;
import com.bootdo.system.service.AmanageService;



@Service
public class AmanageServiceImpl implements AmanageService {
	@Autowired
	private AmanageDao amanageDao;
	
	@Override
	public AmanageDO get(String slaId){
		return amanageDao.get(slaId);
	}
	
	@Override
	public List<AmanageDO> list(Map<String, Object> map){
		return amanageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return amanageDao.count(map);
	}
	
	@Override
	public int save(AmanageDO amanage){
		return amanageDao.save(amanage);
	}
	
	@Override
	public int update(AmanageDO amanage){
		return amanageDao.update(amanage);
	}
	
	@Override
	public int remove(String slaId){
		return amanageDao.remove(slaId);
	}
	
	@Override
	public int batchRemove(String[] slaIds){
		return amanageDao.batchRemove(slaIds);
	}
	
}
