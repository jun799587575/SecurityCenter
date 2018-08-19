package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.RepairDao;
import com.bootdo.system.domain.RepairDO;
import com.bootdo.system.service.RepairService;



@Service
public class RepairServiceImpl implements RepairService {
	@Autowired
	private RepairDao repairDao;
	
	@Override
	public RepairDO get(Integer queId){
		return repairDao.get(queId);
	}
	
	@Override
	public List<RepairDO> list(Map<String, Object> map){
		return repairDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return repairDao.count(map);
	}
	
	@Override
	public int save(RepairDO repair){
		return repairDao.save(repair);
	}
	
	@Override
	public int update(RepairDO repair){
		return repairDao.update(repair);
	}
	
	@Override
	public int remove(Integer queId){
		return repairDao.remove(queId);
	}
	
	@Override
	public int batchRemove(Integer[] queIds){
		return repairDao.batchRemove(queIds);
	}
	
}
