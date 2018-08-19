package com.bootdo.system.dao;

import com.bootdo.system.domain.SupplierDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:20
 */
@Mapper
public interface SupplierDao {

	SupplierDO get(Integer conId);
	
	List<SupplierDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(SupplierDO supplier);
	
	int update(SupplierDO supplier);
	
	int remove(Integer con_id);
	
	int batchRemove(Integer[] conIds);
}
