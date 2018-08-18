package com.bootdo.skill.dao;

import com.bootdo.skill.domain.SkillDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-17 14:56:24
 */
@Mapper
public interface SkillDao {

	SkillDO get(Integer id);
	
	List<SkillDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SkillDO skill);
	
	int update(SkillDO skill);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
