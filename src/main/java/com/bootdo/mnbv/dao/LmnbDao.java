package com.bootdo.mnbv.dao;

import com.bootdo.mnbv.domain.LmnbDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 22:07:31
 */
@Mapper
public interface LmnbDao {

	LmnbDO get(String zxcv);
	
	List<LmnbDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LmnbDO lmnb);
	
	int update(LmnbDO lmnb);
	
	int remove(String zxcv);
	
	int batchRemove(String[] zxcvs);
}
