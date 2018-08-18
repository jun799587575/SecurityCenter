package com.bootdo.customers.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.customers.dao.CustomersDao;
import com.bootdo.customers.domain.CustomersDO;
import com.bootdo.customers.service.CustomersService;



@Service
public class CustomersServiceImpl implements CustomersService {
	@Autowired
	private CustomersDao customersDao;
	
	@Override
	public CustomersDO get(Integer contractId){
		return customersDao.get(contractId);
	}
	
	@Override
	public List<CustomersDO> list(Map<String, Object> map){
		return customersDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return customersDao.count(map);
	}
	
	@Override
	public int save(CustomersDO customers){
		return customersDao.save(customers);
	}
	
	@Override
	public int update(CustomersDO customers){
		return customersDao.update(customers);
	}
	
	@Override
	public int remove(Integer contractId){
		return customersDao.remove(contractId);
	}
	
	@Override
	public int batchRemove(Integer[] contractIds){
		return customersDao.batchRemove(contractIds);
	}
	
}
