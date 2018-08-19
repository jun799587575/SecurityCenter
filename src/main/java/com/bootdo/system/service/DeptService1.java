package com.bootdo.system.service;

import com.bootdo.common.domain.Tree;
import com.bootdo.system.domain.DeptDO1;

import java.util.List;
import java.util.Map;

/**
 * 部门管理
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-09-27 14:28:36
 */
public interface DeptService1 {
	
	DeptDO1 get(Long deptId);
	
	List<DeptDO1> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(DeptDO1 sysDept);
	
	int update(DeptDO1 sysDept);
	
	int remove(Long deptId);
	
	int batchRemove(Long[] deptIds);

	Tree<DeptDO1> getTree();
	
	boolean checkDeptHasUser(Long deptId);
}
