package com.bootdo.adress.dao;

import com.bootdo.adress.domain.AdressDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 16:09:01
 */
@Mapper
public interface AdressDao {

	AdressDO get(Integer id);
	
	List<AdressDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AdressDO adress);
	
	int update(AdressDO adress);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
