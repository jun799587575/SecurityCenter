package com.bootdo.tietud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.tietud.dao.TietudDao;
import com.bootdo.tietud.domain.TietudDO;
import com.bootdo.tietud.service.TietudService;



@Service
public class TietudServiceImpl implements TietudService {
	@Autowired
	private TietudDao tietudDao;
	
	@Override
	public TietudDO get(Integer id){
		return tietudDao.get(id);
	}
	
	@Override
	public List<TietudDO> list(Map<String, Object> map){
		return tietudDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tietudDao.count(map);
	}
	
	@Override
	public int save(TietudDO tietud){
		return tietudDao.save(tietud);
	}
	
	@Override
	public int update(TietudDO tietud){
		return tietudDao.update(tietud);
	}
	
	@Override
	public int remove(Integer id){
		return tietudDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return tietudDao.batchRemove(ids);
	}
	
}
