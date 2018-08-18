package com.bootdo.fractionTo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fractionTo.dao.FractiontoDao;
import com.bootdo.fractionTo.domain.FractiontoDO;
import com.bootdo.fractionTo.service.FractiontoService;



@Service
public class FractiontoServiceImpl implements FractiontoService {
	@Autowired
	private FractiontoDao fractiontoDao;
	
	@Override
	public FractiontoDO get(Integer id){
		return fractiontoDao.get(id);
	}
	
	@Override
	public List<FractiontoDO> list(Map<String, Object> map){
		return fractiontoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return fractiontoDao.count(map);
	}
	
	@Override
	public int save(FractiontoDO fractionto){
		return fractiontoDao.save(fractionto);
	}
	
	@Override
	public int update(FractiontoDO fractionto){
		return fractiontoDao.update(fractionto);
	}
	
	@Override
	public int remove(Integer id){
		return fractiontoDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return fractiontoDao.batchRemove(ids);
	}
	
}
