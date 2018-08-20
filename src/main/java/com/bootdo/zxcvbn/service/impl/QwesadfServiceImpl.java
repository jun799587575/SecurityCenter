package com.bootdo.zxcvbn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.zxcvbn.dao.QwesadfDao;
import com.bootdo.zxcvbn.domain.QwesadfDO;
import com.bootdo.zxcvbn.service.QwesadfService;



@Service
public class QwesadfServiceImpl implements QwesadfService {
	@Autowired
	private QwesadfDao qwesadfDao;
	
	@Override
	public QwesadfDO get(String asd){
		return qwesadfDao.get(asd);
	}
	
	@Override
	public List<QwesadfDO> list(Map<String, Object> map){
		return qwesadfDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return qwesadfDao.count(map);
	}
	
	@Override
	public int save(QwesadfDO qwesadf){
		return qwesadfDao.save(qwesadf);
	}
	
	@Override
	public int update(QwesadfDO qwesadf){
		return qwesadfDao.update(qwesadf);
	}
	
	@Override
	public int remove(String asd){
		return qwesadfDao.remove(asd);
	}
	
	@Override
	public int batchRemove(String[] asds){
		return qwesadfDao.batchRemove(asds);
	}
	
}
