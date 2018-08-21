package com.bootdo.tietua.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.tietua.dao.TietuaDao;
import com.bootdo.tietua.domain.TietuaDO;
import com.bootdo.tietua.service.TietuaService;



@Service
public class TietuaServiceImpl implements TietuaService {
	@Autowired
	private TietuaDao tietuaDao;
	
	@Override
	public TietuaDO get(Integer id){
		return tietuaDao.get(id);
	}
	
	@Override
	public List<TietuaDO> list(Map<String, Object> map){
		return tietuaDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tietuaDao.count(map);
	}
	
	@Override
	public int save(TietuaDO tietua){
		return tietuaDao.save(tietua);
	}
	
	@Override
	public int update(TietuaDO tietua){
		return tietuaDao.update(tietua);
	}
	
	@Override
	public int remove(Integer id){
		return tietuaDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return tietuaDao.batchRemove(ids);
	}
	
}
