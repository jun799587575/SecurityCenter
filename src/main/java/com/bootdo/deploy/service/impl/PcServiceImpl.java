package com.bootdo.deploy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.deploy.dao.PcDao;
import com.bootdo.deploy.domain.PcDO;
import com.bootdo.deploy.service.PcService;



@Service
public class PcServiceImpl implements PcService {
	@Autowired
	private PcDao pcDao;
	
	@Override
	public PcDO get(Integer pcId){
		return pcDao.get(pcId);
	}
	
	@Override
	public List<PcDO> list(Map<String, Object> map){
		return pcDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return pcDao.count(map);
	}
	
	@Override
	public int save(PcDO pc){
		return pcDao.save(pc);
	}
	
	@Override
	public int update(PcDO pc){
		return pcDao.update(pc);
	}
	
	@Override
	public int remove(Integer pcId){
		return pcDao.remove(pcId);
	}
	
	@Override
	public int batchRemove(Integer[] pcIds){
		return pcDao.batchRemove(pcIds);
	}
	
}
