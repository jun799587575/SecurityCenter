package com.bootdo.system.dao;

import com.bootdo.system.domain.TmanageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-15 16:59:45
 */
@Mapper
public interface TmanageDao {

	TmanageDO get(String sltId);
	
	List<TmanageDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(TmanageDO tmanage);
	
	int update(TmanageDO tmanage);
	
	int remove(String slt_id);
	
	int batchRemove(String[] sltIds);
}
