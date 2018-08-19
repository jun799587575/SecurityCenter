package com.bootdo.kaohes.dao;

import com.bootdo.kaohes.domain.KaohesDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 21:32:33
 */
@Mapper
public interface KaohesDao {

	KaohesDO get(Integer id);
	
	List<KaohesDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(KaohesDO kaohes);
	
	int update(KaohesDO kaohes);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
