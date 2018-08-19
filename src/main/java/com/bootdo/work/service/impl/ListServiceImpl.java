package com.bootdo.work.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.work.dao.ListDao;
import com.bootdo.work.domain.ListDO;
import com.bootdo.work.service.ListService;



@Service
public class ListServiceImpl implements ListService {
	@Autowired
	private ListDao listDao;
	
	@Override
	public ListDO get(String workId){
		return listDao.get(workId);
	}
	
	@Override
	public List<ListDO> list(Map<String, Object> map){
		return listDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return listDao.count(map);
	}
	
	@Override
	public int save(ListDO list){
		return listDao.save(list);
	}
	
	@Override
	public int update(ListDO list){
		return listDao.update(list);
	}
	
	@Override
	public int remove(String workId){
		return listDao.remove(workId);
	}
	
	@Override
	public int batchRemove(String[] workIds){
		return listDao.batchRemove(workIds);
	}
	
}
