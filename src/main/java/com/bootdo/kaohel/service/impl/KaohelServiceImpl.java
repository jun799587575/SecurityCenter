package com.bootdo.kaohel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.kaohel.dao.KaohelDao;
import com.bootdo.kaohel.domain.KaohelDO;
import com.bootdo.kaohel.service.KaohelService;



@Service
public class KaohelServiceImpl implements KaohelService {
	@Autowired
	private KaohelDao kaohelDao;
	
	@Override
	public KaohelDO get(Integer id){
		return kaohelDao.get(id);
	}
	
	@Override
	public List<KaohelDO> list(Map<String, Object> map){
		return kaohelDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return kaohelDao.count(map);
	}
	
	@Override
	public int save(KaohelDO kaohel){
		return kaohelDao.save(kaohel);
	}
	
	@Override
	public int update(KaohelDO kaohel){
		return kaohelDao.update(kaohel);
	}
	
	@Override
	public int remove(Integer id){
		return kaohelDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return kaohelDao.batchRemove(ids);
	}
	
}
