package com.bootdo.post.service;

import com.bootdo.post.domain.PostDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author Bughuang
 * @email 1992lcg@163.com
 * @date 2018-08-18 02:44:26
 */
public interface PostService {
	
	PostDO get(Integer id);
	
	List<PostDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PostDO post);
	
	int update(PostDO post);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
