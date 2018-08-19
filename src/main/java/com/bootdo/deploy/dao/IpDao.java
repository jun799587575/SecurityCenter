package com.bootdo.deploy.dao;

		import com.bootdo.deploy.domain.IpDO;

		import java.util.List;
		import java.util.Map;

		import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-17 12:11:35
 */
@Mapper
public interface IpDao {

	IpDO get(Integer ipId);
	
	List<IpDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(IpDO ip);
	
	int update(IpDO ip);
	
	int remove(Integer ip_id);
	
	int batchRemove(Integer[] ipIds);
}
