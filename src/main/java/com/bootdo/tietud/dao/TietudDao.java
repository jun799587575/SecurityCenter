package com.bootdo.tietud.dao;

import com.bootdo.tietud.domain.TietudDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-20 21:58:39
 */
@Mapper
public interface TietudDao {

	TietudDO get(Integer id);
	
	List<TietudDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TietudDO tietud);
	
	int update(TietudDO tietud);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
