package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.DocumentDO;
import com.bootdo.system.service.DocumentService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-16 17:32:24
 */
 
@Controller
@RequestMapping("/system/document")
public class DocumentController {
	@Autowired
	private DocumentService documentService;
	
	@GetMapping()
	@RequiresPermissions("system:document:document")
	String Document(){
	    return "system/document/document";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:document:document")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<DocumentDO> documentList = documentService.list(query);
		int total = documentService.count(query);
		PageUtils pageUtils = new PageUtils(documentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:document:add")
	String add(){
	    return "system/document/add";
	}

	@GetMapping("/edit/{docId}")
	@RequiresPermissions("system:document:edit")
	String edit(@PathVariable("docId") Integer docId,Model model){
		DocumentDO document = documentService.get(docId);
		model.addAttribute("document", document);
	    return "system/document/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:document:add")
	public R save( DocumentDO document){
		if(documentService.save(document)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:document:edit")
	public R update( DocumentDO document){
		documentService.update(document);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:document:remove")
	public R remove( Integer docId){
		if(documentService.remove(docId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:document:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] docIds){
		documentService.batchRemove(docIds);
		return R.ok();
	}
	
}
