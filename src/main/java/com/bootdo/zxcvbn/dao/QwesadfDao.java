package com.bootdo.zxcvbn.dao;

import com.bootdo.zxcvbn.domain.QwesadfDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 20:53:03
 */
@Mapper
public interface QwesadfDao {

	QwesadfDO get(String asd);
	
	List<QwesadfDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(QwesadfDO qwesadf);
	
	int update(QwesadfDO qwesadf);
	
	int remove(String asd);
	
	int batchRemove(String[] asds);
}
