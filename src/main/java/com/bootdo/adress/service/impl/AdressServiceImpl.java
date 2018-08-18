package com.bootdo.adress.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.adress.dao.AdressDao;
import com.bootdo.adress.domain.AdressDO;
import com.bootdo.adress.service.AdressService;



@Service
public class AdressServiceImpl implements AdressService {
	@Autowired
	private AdressDao adressDao;
	
	@Override
	public AdressDO get(Integer id){
		return adressDao.get(id);
	}
	
	@Override
	public List<AdressDO> list(Map<String, Object> map){
		return adressDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return adressDao.count(map);
	}
	
	@Override
	public int save(AdressDO adress){
		return adressDao.save(adress);
	}
	
	@Override
	public int update(AdressDO adress){
		return adressDao.update(adress);
	}
	
	@Override
	public int remove(Integer id){
		return adressDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return adressDao.batchRemove(ids);
	}
	
}
