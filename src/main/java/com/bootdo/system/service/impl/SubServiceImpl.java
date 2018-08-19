package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.SubDao;
import com.bootdo.system.domain.SubDO;
import com.bootdo.system.service.SubService;



@Service
public class SubServiceImpl implements SubService {
	@Autowired
	private SubDao subDao;
	
	@Override
	public SubDO get(String serveId){
		return subDao.get(serveId);
	}
	
	@Override
	public List<SubDO> list(Map<String, Object> map){
		return subDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return subDao.count(map);
	}
	
	@Override
	public int save(SubDO sub){
		return subDao.save(sub);
	}
	
	@Override
	public int update(SubDO sub){
		return subDao.update(sub);
	}
	
	@Override
	public int remove(String serveId){
		return subDao.remove(serveId);
	}
	
	@Override
	public int batchRemove(String[] serveIds){
		return subDao.batchRemove(serveIds);
	}
	
}
