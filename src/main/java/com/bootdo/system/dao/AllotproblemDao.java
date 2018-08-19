package com.bootdo.system.dao;

import com.bootdo.system.domain.AllotproblemDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 17:08:46
 */
@Mapper
public interface AllotproblemDao {

	AllotproblemDO get(Integer queId);
	
	List<AllotproblemDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(AllotproblemDO allotproblem);
	
	int update(AllotproblemDO allotproblem);
	
	int remove(Integer que_id);
	
	int batchRemove(Integer[] queIds);
}
