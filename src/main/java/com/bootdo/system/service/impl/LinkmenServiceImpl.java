package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.LinkmenDao;
import com.bootdo.system.domain.LinkmenDO;
import com.bootdo.system.service.LinkmenService;



@Service
public class LinkmenServiceImpl implements LinkmenService {
	@Autowired
	private LinkmenDao linkmenDao;
	
	@Override
	public LinkmenDO get(Integer linId){
		return linkmenDao.get(linId);
	}
	
	@Override
	public List<LinkmenDO> list(Map<String, Object> map){
		return linkmenDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return linkmenDao.count(map);
	}
	
	@Override
	public int save(LinkmenDO linkmen){
		return linkmenDao.save(linkmen);
	}
	
	@Override
	public int update(LinkmenDO linkmen){
		return linkmenDao.update(linkmen);
	}
	
	@Override
	public int remove(Integer linId){
		return linkmenDao.remove(linId);
	}
	
	@Override
	public int batchRemove(Integer[] linIds){
		return linkmenDao.batchRemove(linIds);
	}
	
}
