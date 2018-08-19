package com.bootdo.work.service;

import com.bootdo.work.domain.KnowDO;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 09:11:19
 */
public interface KnowService {

	KnowDO get(String knowKeyword);

	List<KnowDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(KnowDO know);

	int update(KnowDO know);

	int remove(String knowKeyword);

	int batchRemove(String[] knowKeywords);
}
