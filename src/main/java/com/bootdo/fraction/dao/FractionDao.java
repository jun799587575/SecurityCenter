package com.bootdo.fraction.dao;

import com.bootdo.fraction.domain.FractionDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 17:45:59
 */
@Mapper
public interface FractionDao {

	FractionDO get(Integer id);
	
	List<FractionDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(FractionDO fraction);
	
	int update(FractionDO fraction);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
