package com.bootdo.yhnj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.yhnj.dao.JhgkDao;
import com.bootdo.yhnj.domain.JhgkDO;
import com.bootdo.yhnj.service.JhgkService;



@Service
public class JhgkServiceImpl implements JhgkService {
	@Autowired
	private JhgkDao jhgkDao;
	
	@Override
	public JhgkDO get(String asd){
		return jhgkDao.get(asd);
	}
	
	@Override
	public List<JhgkDO> list(Map<String, Object> map){
		return jhgkDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return jhgkDao.count(map);
	}
	
	@Override
	public int save(JhgkDO jhgk){
		return jhgkDao.save(jhgk);
	}
	
	@Override
	public int update(JhgkDO jhgk){
		return jhgkDao.update(jhgk);
	}
	
	@Override
	public int remove(String asd){
		return jhgkDao.remove(asd);
	}
	
	@Override
	public int batchRemove(String[] asds){
		return jhgkDao.batchRemove(asds);
	}
	
}
