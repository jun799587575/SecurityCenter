package com.bootdo.kaohel.dao;

import com.bootdo.kaohel.domain.KaohelDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 22:06:27
 */
@Mapper
public interface KaohelDao {

	KaohelDO get(Integer id);
	
	List<KaohelDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(KaohelDO kaohel);
	
	int update(KaohelDO kaohel);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
