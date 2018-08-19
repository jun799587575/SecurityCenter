package com.bootdo.system.dao;

import com.bootdo.system.domain.ClientDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:18
 */
@Mapper
public interface ClientDao {

	ClientDO get(Integer conId);
	
	List<ClientDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(ClientDO client);
	
	int update(ClientDO client);
	
	int remove(Integer con_id);
	
	int batchRemove(Integer[] conIds);
}
