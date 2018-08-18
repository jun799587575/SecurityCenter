package com.bootdo.customers.service;

import com.bootdo.customers.domain.CustomersDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-16 16:20:27
 */
public interface CustomersService {
	
	CustomersDO get(Integer contractId);
	
	List<CustomersDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustomersDO customers);
	
	int update(CustomersDO customers);
	
	int remove(Integer contractId);
	
	int batchRemove(Integer[] contractIds);
}
