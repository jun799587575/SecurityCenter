package com.bootdo.kaohe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.kaohe.dao.KaoheDao;
import com.bootdo.kaohe.domain.KaoheDO;
import com.bootdo.kaohe.service.KaoheService;



@Service
public class KaoheServiceImpl implements KaoheService {
	@Autowired
	private KaoheDao kaoheDao;
	
	@Override
	public KaoheDO get(Integer id){
		return kaoheDao.get(id);
	}
	
	@Override
	public List<KaoheDO> list(Map<String, Object> map){
		return kaoheDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return kaoheDao.count(map);
	}
	
	@Override
	public int save(KaoheDO kaohe){
		return kaoheDao.save(kaohe);
	}
	
	@Override
	public int update(KaoheDO kaohe){
		return kaoheDao.update(kaohe);
	}
	
	@Override
	public int remove(Integer id){
		return kaoheDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return kaoheDao.batchRemove(ids);
	}
	
}
