package com.bootdo.kaohe.dao;

import com.bootdo.kaohe.domain.KaoheDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 16:21:26
 */
@Mapper
public interface KaoheDao {

	KaoheDO get(Integer id);
	
	List<KaoheDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(KaoheDO kaohe);
	
	int update(KaoheDO kaohe);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
