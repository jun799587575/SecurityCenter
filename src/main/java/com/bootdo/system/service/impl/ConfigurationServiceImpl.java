package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ConfigurationDao;
import com.bootdo.system.domain.ConfigurationDO;
import com.bootdo.system.service.ConfigurationService;



@Service
public class ConfigurationServiceImpl implements ConfigurationService {
	@Autowired
	private ConfigurationDao configurationDao;
	
	@Override
	public ConfigurationDO get(Integer itemId){
		return configurationDao.get(itemId);
	}
	
	@Override
	public List<ConfigurationDO> list(Map<String, Object> map){
		return configurationDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return configurationDao.count(map);
	}
	
	@Override
	public int save(ConfigurationDO configuration){
		return configurationDao.save(configuration);
	}
	
	@Override
	public int update(ConfigurationDO configuration){
		return configurationDao.update(configuration);
	}
	
	@Override
	public int remove(Integer itemId){
		return configurationDao.remove(itemId);
	}
	
	@Override
	public int batchRemove(Integer[] itemIds){
		return configurationDao.batchRemove(itemIds);
	}
	
}
