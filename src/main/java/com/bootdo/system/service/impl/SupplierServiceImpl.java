package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.SupplierDao;
import com.bootdo.system.domain.SupplierDO;
import com.bootdo.system.service.SupplierService;



@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDao supplierDao;
	
	@Override
	public SupplierDO get(Integer conId){
		return supplierDao.get(conId);
	}
	
	@Override
	public List<SupplierDO> list(Map<String, Object> map){
		return supplierDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return supplierDao.count(map);
	}
	
	@Override
	public int save(SupplierDO supplier){
		return supplierDao.save(supplier);
	}
	
	@Override
	public int update(SupplierDO supplier){
		return supplierDao.update(supplier);
	}
	
	@Override
	public int remove(Integer conId){
		return supplierDao.remove(conId);
	}
	
	@Override
	public int batchRemove(Integer[] conIds){
		return supplierDao.batchRemove(conIds);
	}
	
}
