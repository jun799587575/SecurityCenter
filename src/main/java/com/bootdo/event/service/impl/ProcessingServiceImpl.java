package com.bootdo.event.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.event.dao.ProcessingDao;
import com.bootdo.event.domain.ProcessingDO;
import com.bootdo.event.service.ProcessingService;



@Service
public class ProcessingServiceImpl implements ProcessingService {
	@Autowired
	private ProcessingDao processingDao;
	
	@Override
	public ProcessingDO get(Integer eventId){
		return processingDao.get(eventId);
	}
	
	@Override
	public List<ProcessingDO> list(Map<String, Object> map){
		return processingDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return processingDao.count(map);
	}
	
	@Override
	public int save(ProcessingDO processing){
		return processingDao.save(processing);
	}
	
	@Override
	public int update(ProcessingDO processing){
		return processingDao.update(processing);
	}
	
	@Override
	public int remove(Integer eventId){
		return processingDao.remove(eventId);
	}
	
	@Override
	public int batchRemove(Integer[] eventIds){
		return processingDao.batchRemove(eventIds);
	}
	
}
