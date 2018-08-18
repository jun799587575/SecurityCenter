package com.bootdo.engineer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.engineer.dao.EngineerDao;
import com.bootdo.engineer.domain.EngineerDO;
import com.bootdo.engineer.service.EngineerService;



@Service
public class EngineerServiceImpl implements EngineerService {
	@Autowired
	private EngineerDao engineerDao;
	
	@Override
	public EngineerDO get(Integer id){
		return engineerDao.get(id);
	}
	
	@Override
	public List<EngineerDO> list(Map<String, Object> map){
		return engineerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return engineerDao.count(map);
	}
	
	@Override
	public int save(EngineerDO engineer){
		return engineerDao.save(engineer);
	}
	
	@Override
	public int update(EngineerDO engineer){
		return engineerDao.update(engineer);
	}
	
	@Override
	public int remove(Integer id){
		return engineerDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return engineerDao.batchRemove(ids);
	}
	
}
