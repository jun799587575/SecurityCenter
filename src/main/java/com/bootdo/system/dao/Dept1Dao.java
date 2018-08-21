package com.bootdo.system.dao;

import com.bootdo.system.domain.DeptDO1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 部门管理
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-10-03 15:35:39
 */
@Mapper
public interface Dept1Dao {

	DeptDO1 get(Long deptId);

	List<DeptDO1> list(Map<String, Object> map);

	int count(Map<String, Object> map);
	
	int save(DeptDO1 dept);
	
	int update(DeptDO1 dept);
	
	int remove(Long deptId);
	
	int batchRemove(Long[] deptIds);
	
	Long[] listParentDept();
	
	int getDeptUserNumber(Long deptId);
}
