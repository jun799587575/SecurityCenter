package com.bootdo.customer.dao;

import com.bootdo.customer.domain.CustomerDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-16 14:10:04
 */
@Mapper
public interface CustomerDao {

	CustomerDO get(Integer contractId);
	
	List<CustomerDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustomerDO customer);
	
	int update(CustomerDO customer);
	
	int remove(Integer contract_Id);
	
	int batchRemove(Integer[] contractIds);
}
