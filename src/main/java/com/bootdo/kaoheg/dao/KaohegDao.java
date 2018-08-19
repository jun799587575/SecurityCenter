package com.bootdo.kaoheg.dao;

import com.bootdo.kaoheg.domain.KaohegDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 22:39:37
 */
@Mapper
public interface KaohegDao {

	KaohegDO get(Integer id);
	
	List<KaohegDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(KaohegDO kaoheg);
	
	int update(KaohegDO kaoheg);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
