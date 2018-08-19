package com.bootdo.deploy.dao;

import com.bootdo.deploy.domain.NasDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:36
 */
@Mapper
public interface NasDao {

	NasDO get(Integer nasId);
	
	List<NasDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NasDO nas);
	
	int update(NasDO nas);
	
	int remove(Integer nas_id);
	
	int batchRemove(Integer[] nasIds);
}
