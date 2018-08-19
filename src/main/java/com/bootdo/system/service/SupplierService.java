package com.bootdo.system.service;

import com.bootdo.system.domain.SupplierDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:20
 */
public interface SupplierService {
	
	SupplierDO get(Integer conId);
	
	List<SupplierDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SupplierDO supplier);
	
	int update(SupplierDO supplier);
	
	int remove(Integer conId);
	
	int batchRemove(Integer[] conIds);
}
