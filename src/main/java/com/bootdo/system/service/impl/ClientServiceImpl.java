package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.ClientDao;
import com.bootdo.system.domain.ClientDO;
import com.bootdo.system.service.ClientService;



@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;
	
	@Override
	public ClientDO get(Integer conId){
		return clientDao.get(conId);
	}
	
	@Override
	public List<ClientDO> list(Map<String, Object> map){
		return clientDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return clientDao.count(map);
	}
	
	@Override
	public int save(ClientDO client){
		return clientDao.save(client);
	}
	
	@Override
	public int update(ClientDO client){
		return clientDao.update(client);
	}
	
	@Override
	public int remove(Integer conId){
		return clientDao.remove(conId);
	}
	
	@Override
	public int batchRemove(Integer[] conIds){
		return clientDao.batchRemove(conIds);
	}
	
}
