package com.bootdo.zxcvbn.service;

import com.bootdo.zxcvbn.domain.QwesadfDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 20:53:03
 */
public interface QwesadfService {
	
	QwesadfDO get(String asd);
	
	List<QwesadfDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(QwesadfDO qwesadf);
	
	int update(QwesadfDO qwesadf);
	
	int remove(String asd);
	
	int batchRemove(String[] asds);
}
