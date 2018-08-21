package com.bootdo.tietua.dao;

import com.bootdo.tietua.domain.TietuaDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:13:25
 */
@Mapper
public interface TietuaDao {

	TietuaDO get(Integer id);
	
	List<TietuaDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietuaDO tietua);
	
	int update(TietuaDO tietua);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
