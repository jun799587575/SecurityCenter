package com.bootdo.system.service.impl;

import com.bootdo.common.domain.Tree;
import com.bootdo.common.utils.BuildTree;
import com.bootdo.system.dao.Dept1Dao;
import com.bootdo.system.domain.DeptDO1;
import com.bootdo.system.service.DeptService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class DeptServiceImpl1 implements DeptService1 {
	@Autowired
	private Dept1Dao sysDeptMapper;

	@Override
	public DeptDO1 get(Long deptId){
		return sysDeptMapper.get(deptId);
	}

	@Override
	public List<DeptDO1> list(Map<String, Object> map){
		return sysDeptMapper.list(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return sysDeptMapper.count(map);
	}

	@Override
	public int save(DeptDO1 sysDept){
		return sysDeptMapper.save(sysDept);
	}

	@Override
	public int update(DeptDO1 sysDept){
		return sysDeptMapper.update(sysDept);
	}

	@Override
	public int remove(Long deptId){
		return sysDeptMapper.remove(deptId);
	}

	@Override
	public int batchRemove(Long[] deptIds){
		return sysDeptMapper.batchRemove(deptIds);
	}

	@Override
	public Tree<DeptDO1> getTree() {
		List<Tree<DeptDO1>> trees = new ArrayList<Tree<DeptDO1>>();
		List<DeptDO1> sysDepts = sysDeptMapper.list(new HashMap<String,Object>(16));
		for (DeptDO1 sysDept : sysDepts) {
			Tree<DeptDO1> tree = new Tree<DeptDO1>();
			tree.setId(sysDept.getDeptId().toString());
			tree.setParentId(sysDept.getParentId().toString());
			tree.setText(sysDept.getName());
			Map<String, Object> state = new HashMap<>(16);
			state.put("opened", true);
			tree.setState(state);
			trees.add(tree);
		}
		// 默认顶级菜单为０，根据数据库实际情况调整
		Tree<DeptDO1> t = BuildTree.build(trees);
		return t;
	}

	@Override
	public boolean checkDeptHasUser(Long deptId) {
		// TODO Auto-generated method stub
		//查询部门以及此部门的下级部门
		int result = sysDeptMapper.getDeptUserNumber(deptId);
		return result==0?true:false;
	}

}
