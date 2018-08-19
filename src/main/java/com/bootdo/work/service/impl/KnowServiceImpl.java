package com.bootdo.work.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.work.dao.KnowDao;
import com.bootdo.work.domain.KnowDO;
import com.bootdo.work.service.KnowService;



@Service
public class KnowServiceImpl implements KnowService {
	@Autowired
	private KnowDao knowDao;

	@Override
	public KnowDO get(String knowKeyword){
		return knowDao.get(knowKeyword);
	}

	@Override
	public List<KnowDO> list(Map<String, Object> map){
		return knowDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return knowDao.count(map);
	}

	@Override
	public int save(KnowDO know){
		return knowDao.save(know);
	}

	@Override
	public int update(KnowDO know){
		return knowDao.update(know);
	}

	@Override
	public int remove(String knowKeyword){
		return knowDao.remove(knowKeyword);
	}

	@Override
	public int batchRemove(String[] knowKeywords){
		return knowDao.batchRemove(knowKeywords);
	}

}
