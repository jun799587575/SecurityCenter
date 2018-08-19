package com.bootdo.kaohet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.kaohet.dao.KaohetDao;
import com.bootdo.kaohet.domain.KaohetDO;
import com.bootdo.kaohet.service.KaohetService;



@Service
public class KaohetServiceImpl implements KaohetService {
	@Autowired
	private KaohetDao kaohetDao;
	
	@Override
	public KaohetDO get(Integer id){
		return kaohetDao.get(id);
	}
	
	@Override
	public List<KaohetDO> list(Map<String, Object> map){
		return kaohetDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return kaohetDao.count(map);
	}
	
	@Override
	public int save(KaohetDO kaohet){
		return kaohetDao.save(kaohet);
	}
	
	@Override
	public int update(KaohetDO kaohet){
		return kaohetDao.update(kaohet);
	}
	
	@Override
	public int remove(Integer id){
		return kaohetDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return kaohetDao.batchRemove(ids);
	}
	
}
