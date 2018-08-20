package com.bootdo.qwer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.qwer.dao.QwertyDao;
import com.bootdo.qwer.domain.QwertyDO;
import com.bootdo.qwer.service.QwertyService;



@Service
public class QwertyServiceImpl implements QwertyService {
	@Autowired
	private QwertyDao qwerDao;
	
	@Override
	public QwertyDO get(String sda){
		return qwerDao.get(sda);
	}
	
	@Override
	public List<QwertyDO> list(Map<String, Object> map){
		return qwerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return qwerDao.count(map);
	}
	
	@Override
	public int save(QwertyDO qwer){
		return qwerDao.save(qwer);
	}
	
	@Override
	public int update(QwertyDO qwer){
		return qwerDao.update(qwer);
	}
	
	@Override
	public int remove(String sda){
		return qwerDao.remove(sda);
	}
	
	@Override
	public int batchRemove(String[] sdas){
		return qwerDao.batchRemove(sdas);
	}
	
}
