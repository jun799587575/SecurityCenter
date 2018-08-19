package com.bootdo.deploy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.deploy.dao.NasDao;
import com.bootdo.deploy.domain.NasDO;
import com.bootdo.deploy.service.NasService;



@Service
public class NasServiceImpl implements NasService {
	@Autowired
	private NasDao nasDao;
	
	@Override
	public NasDO get(Integer nasId){
		return nasDao.get(nasId);
	}
	
	@Override
	public List<NasDO> list(Map<String, Object> map){
		return nasDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return nasDao.count(map);
	}
	
	@Override
	public int save(NasDO nas){
		return nasDao.save(nas);
	}
	
	@Override
	public int update(NasDO nas){
		return nasDao.update(nas);
	}
	
	@Override
	public int remove(Integer nasId){
		return nasDao.remove(nasId);
	}
	
	@Override
	public int batchRemove(Integer[] nasIds){
		return nasDao.batchRemove(nasIds);
	}
	
}
