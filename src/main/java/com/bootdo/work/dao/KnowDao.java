package com.bootdo.work.dao;

import com.bootdo.work.domain.KnowDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 09:11:19
 */
@Mapper
public interface KnowDao {

	KnowDO get(String knowKeyword);

	List<KnowDO> list(Map<String,Object> map);

	int count(Map<String,Object> map);

	int save(KnowDO know);

	int update(KnowDO know);

	int remove(String know_keyword);

	int batchRemove(String[] knowKeywords);
}
