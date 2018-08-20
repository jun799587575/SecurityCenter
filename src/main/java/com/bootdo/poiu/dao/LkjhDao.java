package com.bootdo.poiu.dao;

import com.bootdo.poiu.domain.LkjhDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 21:30:49
 */
@Mapper
public interface LkjhDao {

	LkjhDO get(String asdd);
	
	List<LkjhDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LkjhDO lkjh);
	
	int update(LkjhDO lkjh);
	
	int remove(String asdd);
	
	int batchRemove(String[] asdds);
}
