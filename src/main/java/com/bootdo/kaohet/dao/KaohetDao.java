package com.bootdo.kaohet.dao;

import com.bootdo.kaohet.domain.KaohetDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 23:02:26
 */
@Mapper
public interface KaohetDao {

	KaohetDO get(Integer id);
	
	List<KaohetDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(KaohetDO kaohet);
	
	int update(KaohetDO kaohet);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
