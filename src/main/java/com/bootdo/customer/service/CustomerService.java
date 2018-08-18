package com.bootdo.customer.service;

import com.bootdo.customer.domain.CustomerDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-16 14:10:04
 */
public interface CustomerService {
	
	CustomerDO get(Integer contractId);
	
	List<CustomerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustomerDO customer);
	
	int update(CustomerDO customer);
	
	int remove(Integer contractId);
	
	int batchRemove(Integer[] contractIds);
}
