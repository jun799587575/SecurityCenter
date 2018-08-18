package com.bootdo.train.service;

import com.bootdo.train.domain.TrainDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 02:16:58
 */
public interface TrainService {
	
	TrainDO get(Integer id);
	
	List<TrainDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TrainDO train);
	
	int update(TrainDO train);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
