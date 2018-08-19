package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.DocumentDao;
import com.bootdo.system.domain.DocumentDO;
import com.bootdo.system.service.DocumentService;



@Service
public class DocumentServiceImpl implements DocumentService {
	@Autowired
	private DocumentDao documentDao;
	
	@Override
	public DocumentDO get(Integer docId){
		return documentDao.get(docId);
	}
	
	@Override
	public List<DocumentDO> list(Map<String, Object> map){
		return documentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return documentDao.count(map);
	}
	
	@Override
	public int save(DocumentDO document){
		return documentDao.save(document);
	}
	
	@Override
	public int update(DocumentDO document){
		return documentDao.update(document);
	}
	
	@Override
	public int remove(Integer docId){
		return documentDao.remove(docId);
	}
	
	@Override
	public int batchRemove(Integer[] docIds){
		return documentDao.batchRemove(docIds);
	}
	
}
