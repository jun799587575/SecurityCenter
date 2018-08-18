package com.bootdo.post.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.post.dao.PostDao;
import com.bootdo.post.domain.PostDO;
import com.bootdo.post.service.PostService;



@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostDao postDao;
	
	@Override
	public PostDO get(Integer id){
		return postDao.get(id);
	}
	
	@Override
	public List<PostDO> list(Map<String, Object> map){
		return postDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return postDao.count(map);
	}
	
	@Override
	public int save(PostDO post){
		return postDao.save(post);
	}
	
	@Override
	public int update(PostDO post){
		return postDao.update(post);
	}
	
	@Override
	public int remove(Integer id){
		return postDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return postDao.batchRemove(ids);
	}
	
}
