package com.bootdo.plmn.dao;

import com.bootdo.plmn.domain.NmlpDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 22:46:38
 */
@Mapper
public interface NmlpDao {

	NmlpDO get(String asd);
	
	List<NmlpDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NmlpDO nmlp);
	
	int update(NmlpDO nmlp);
	
	int remove(String asd);
	
	int batchRemove(String[] asds);
}
