package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ManageDao;
import com.bootdo.system.domain.ManageDO;
import com.bootdo.system.service.ManageService;



@Service
public class ManageServiceImpl implements ManageService {
	@Autowired
	private ManageDao manageDao;
	
	@Override
	public ManageDO get(String serveId){
		return manageDao.get(serveId);
	}
	
	@Override
	public List<ManageDO> list(Map<String, Object> map){
		return manageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return manageDao.count(map);
	}
	
	@Override
	public int save(ManageDO manage){
		return manageDao.save(manage);
	}
	
	@Override
	public int update(ManageDO manage){
		return manageDao.update(manage);
	}
	
	@Override
	public int remove(String serveId){
		return manageDao.remove(serveId);
	}
	
	@Override
	public int batchRemove(String[] serveIds){
		return manageDao.batchRemove(serveIds);
	}
	
}
