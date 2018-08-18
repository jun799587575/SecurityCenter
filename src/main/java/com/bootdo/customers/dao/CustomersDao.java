package com.bootdo.customers.dao;

import com.bootdo.customers.domain.CustomersDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-16 16:20:27
 */
@Mapper
public interface CustomersDao {

	CustomersDO get(Integer contractId);
	
	List<CustomersDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustomersDO customers);
	
	int update(CustomersDO customers);
	
	int remove(Integer contract_Id);
	
	int batchRemove(Integer[] contractIds);
}
