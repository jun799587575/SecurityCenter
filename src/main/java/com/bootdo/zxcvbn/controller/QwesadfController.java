package com.bootdo.zxcvbn.controller;

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

import com.bootdo.zxcvbn.domain.QwesadfDO;
import com.bootdo.zxcvbn.service.QwesadfService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2018-08-19 20:53:03
 */
 
@Controller
@RequestMapping("/zxcvbn/qwesadf")
public class QwesadfController {
	@Autowired
	private QwesadfService qwesadfService;
	
	@GetMapping()
	@RequiresPermissions("zxcvbn:qwesadf:qwesadf")
	String Qwesadf(){
	    return "zxcvbn/qwesadf/qwesadf";
	}


	@GetMapping("/queren")
	@RequiresPermissions("zxcvbn:qwesadf:queren")
	String queren(){
		return "zxcvbn/qwesadf/queren";
	}

	@GetMapping("/xiangqings")
	@RequiresPermissions("zxcvbn:qwesadf:xiangqings")
	String xiangqings(){
		return "zxcvbn/qwesadf/xiangqings";
	}
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("zxcvbn:qwesadf:qwesadf")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<QwesadfDO> qwesadfList = qwesadfService.list(query);
		int total = qwesadfService.count(query);
		PageUtils pageUtils = new PageUtils(qwesadfList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("zxcvbn:qwesadf:add")
	String add(){
	    return "zxcvbn/qwesadf/add";
	}

	@GetMapping("/edit/{asd}")
	@RequiresPermissions("zxcvbn:qwesadf:edit")
	String edit(@PathVariable("asd") String asd,Model model){
		QwesadfDO qwesadf = qwesadfService.get(asd);
		model.addAttribute("qwesadf", qwesadf);
	    return "zxcvbn/qwesadf/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("zxcvbn:qwesadf:add")
	public R save( QwesadfDO qwesadf){
		if(qwesadfService.save(qwesadf)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("zxcvbn:qwesadf:edit")
	public R update( QwesadfDO qwesadf){
		qwesadfService.update(qwesadf);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("zxcvbn:qwesadf:remove")
	public R remove( String asd){
		if(qwesadfService.remove(asd)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("zxcvbn:qwesadf:batchRemove")
	public R remove(@RequestParam("ids[]") String[] asds){
		qwesadfService.batchRemove(asds);
		return R.ok();
	}
	
}
