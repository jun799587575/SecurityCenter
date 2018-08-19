package com.bootdo.deploy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.deploy.dao.IpDao;
import com.bootdo.deploy.domain.IpDO;
import com.bootdo.deploy.service.IpService;



@Service
public class IpServiceImpl implements IpService {
	@Autowired
	private IpDao ipDao;
	
	@Override
	public IpDO get(Integer ipId){
		return ipDao.get(ipId);
	}
	
	@Override
	public List<IpDO> list(Map<String, Object> map){
		return ipDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return ipDao.count(map);
	}
	
	@Override
	public int save(IpDO ip){
		return ipDao.save(ip);
	}
	
	@Override
	public int update(IpDO ip){
		return ipDao.update(ip);
	}
	
	@Override
	public int remove(Integer ipId){
		return ipDao.remove(ipId);
	}
	
	@Override
	public int batchRemove(Integer[] ipIds){
		return ipDao.batchRemove(ipIds);
	}
	
}
