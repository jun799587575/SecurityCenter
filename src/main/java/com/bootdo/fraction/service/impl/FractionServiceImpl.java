package com.bootdo.fraction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fraction.dao.FractionDao;
import com.bootdo.fraction.domain.FractionDO;
import com.bootdo.fraction.service.FractionService;



@Service
public class FractionServiceImpl implements FractionService {
	@Autowired
	private FractionDao fractionDao;
	
	@Override
	public FractionDO get(Integer id){
		return fractionDao.get(id);
	}
	
	@Override
	public List<FractionDO> list(Map<String, Object> map){
		return fractionDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return fractionDao.count(map);
	}
	
	@Override
	public int save(FractionDO fraction){
		return fractionDao.save(fraction);
	}
	
	@Override
	public int update(FractionDO fraction){
		return fractionDao.update(fraction);
	}
	
	@Override
	public int remove(Integer id){
		return fractionDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return fractionDao.batchRemove(ids);
	}
	
}
