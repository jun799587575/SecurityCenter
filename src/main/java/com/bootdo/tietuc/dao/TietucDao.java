package com.bootdo.tietuc.dao;

import com.bootdo.tietuc.domain.TietucDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:47:21
 */
@Mapper
public interface TietucDao {

	TietucDO get(Integer id);
	
	List<TietucDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietucDO tietuc);
	
	int update(TietucDO tietuc);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
