package com.bootdo.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.customer.dao.CustomerDao;
import com.bootdo.customer.domain.CustomerDO;
import com.bootdo.customer.service.CustomerService;



@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public CustomerDO get(Integer contractId){
		return customerDao.get(contractId);
	}
	
	@Override
	public List<CustomerDO> list(Map<String, Object> map){
		return customerDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return customerDao.count(map);
	}
	
	@Override
	public int save(CustomerDO customer){
		return customerDao.save(customer);
	}
	
	@Override
	public int update(CustomerDO customer){
		return customerDao.update(customer);
	}
	
	@Override
	public int remove(Integer contractId){
		return customerDao.remove(contractId);
	}
	
	@Override
	public int batchRemove(Integer[] contractIds){
		return customerDao.batchRemove(contractIds);
	}
	
}
