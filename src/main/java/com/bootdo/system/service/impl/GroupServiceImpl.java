package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.GroupDao;
import com.bootdo.system.domain.GroupDO;
import com.bootdo.system.service.GroupService;



@Service
public class GroupServiceImpl implements GroupService {
	@Autowired
	private GroupDao groupDao;
	
	@Override
	public GroupDO get(String serveId){
		return groupDao.get(serveId);
	}
	
	@Override
	public List<GroupDO> list(Map<String, Object> map){
		return groupDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return groupDao.count(map);
	}
	
	@Override
	public int save(GroupDO group){
		return groupDao.save(group);
	}
	
	@Override
	public int update(GroupDO group){
		return groupDao.update(group);
	}
	
	@Override
	public int remove(String serveId){
		return groupDao.remove(serveId);
	}
	
	@Override
	public int batchRemove(String[] serveIds){
		return groupDao.batchRemove(serveIds);
	}
	
}
