package com.bootdo.tietu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.tietu.dao.TietuDao;
import com.bootdo.tietu.domain.TietuDO;
import com.bootdo.tietu.service.TietuService;



@Service
public class TietuServiceImpl implements TietuService {
	@Autowired
	private TietuDao tietuDao;
	
	@Override
	public TietuDO get(Integer id){
		return tietuDao.get(id);
	}
	
	@Override
	public List<TietuDO> list(Map<String, Object> map){
		return tietuDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tietuDao.count(map);
	}
	
	@Override
	public int save(TietuDO tietu){
		return tietuDao.save(tietu);
	}
	
	@Override
	public int update(TietuDO tietu){
		return tietuDao.update(tietu);
	}
	
	@Override
	public int remove(Integer id){
		return tietuDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return tietuDao.batchRemove(ids);
	}
	
}
