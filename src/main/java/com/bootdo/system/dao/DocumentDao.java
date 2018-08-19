package com.bootdo.system.dao;

import com.bootdo.system.domain.DocumentDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:24
 */
@Mapper
public interface DocumentDao {

	DocumentDO get(Integer docId);
	
	List<DocumentDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(DocumentDO document);
	
	int update(DocumentDO document);
	
	int remove(Integer doc_id);
	
	int batchRemove(Integer[] docIds);
}
