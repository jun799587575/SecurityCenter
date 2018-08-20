package com.bootdo.plmn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.plmn.dao.NmlpDao;
import com.bootdo.plmn.domain.NmlpDO;
import com.bootdo.plmn.service.NmlpService;



@Service
public class NmlpServiceImpl implements NmlpService {
	@Autowired
	private NmlpDao nmlpDao;
	
	@Override
	public NmlpDO get(String asd){
		return nmlpDao.get(asd);
	}
	
	@Override
	public List<NmlpDO> list(Map<String, Object> map){
		return nmlpDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return nmlpDao.count(map);
	}
	
	@Override
	public int save(NmlpDO nmlp){
		return nmlpDao.save(nmlp);
	}
	
	@Override
	public int update(NmlpDO nmlp){
		return nmlpDao.update(nmlp);
	}
	
	@Override
	public int remove(String asd){
		return nmlpDao.remove(asd);
	}
	
	@Override
	public int batchRemove(String[] asds){
		return nmlpDao.batchRemove(asds);
	}
	
}
