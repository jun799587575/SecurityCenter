package com.bootdo.skill.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.skill.dao.SkillDao;
import com.bootdo.skill.domain.SkillDO;
import com.bootdo.skill.service.SkillService;



@Service
public class SkillServiceImpl implements SkillService {
	@Autowired
	private SkillDao skillDao;
	
	@Override
	public SkillDO get(Integer id){
		return skillDao.get(id);
	}
	
	@Override
	public List<SkillDO> list(Map<String, Object> map){
		return skillDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return skillDao.count(map);
	}
	
	@Override
	public int save(SkillDO skill){
		return skillDao.save(skill);
	}
	
	@Override
	public int update(SkillDO skill){
		return skillDao.update(skill);
	}
	
	@Override
	public int remove(Integer id){
		return skillDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return skillDao.batchRemove(ids);
	}
	
}
