package com.bootdo.tietu.dao;

import com.bootdo.tietu.domain.TietuDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 17:02:17
 */
@Mapper
public interface TietuDao {

	TietuDO get(Integer id);
	
	List<TietuDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietuDO tietu);
	
	int update(TietuDO tietu);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
