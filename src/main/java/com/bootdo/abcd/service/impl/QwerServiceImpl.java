package com.bootdo.abcd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.abcd.dao.QwerDao;
import com.bootdo.abcd.domain.QwerDO;
import com.bootdo.abcd.service.QwerService;



@Service
public class QwerServiceImpl implements QwerService {
	@Autowired
	private QwerDao qwerDao;
	
	@Override
	public QwerDO get(String sda){
		return qwerDao.get(sda);
	}
	
	@Override
	public List<QwerDO> list(Map<String, Object> map){
		return qwerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return qwerDao.count(map);
	}
	
	@Override
	public int save(QwerDO qwer){
		return qwerDao.save(qwer);
	}
	
	@Override
	public int update(QwerDO qwer){
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
