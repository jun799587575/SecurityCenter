
var prefix = "/deploy/nas"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list", // 服务器数据的加载地址
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "json", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						// queryParamsType : "limit",
						// //设置为limit则会发送符合RESTFull格式的参数
						singleSelect : false, // 设置为true将禁止多选
						// contentType : "application/x-www-form-urlencoded",
						// //发送到服务器的数据编码类型
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						//search : true, // 是否显示搜索框
						showColumns : false, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset,
                                nasName:$('#searchName').val(),
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
						columns : [
								{
									checkbox : true
								},
																{
									field : 'nasId', 
									title : 'ID' 
								},
																{
									field : 'nasName', 
									title : '名称' 
								},
																{
									field : 'organization', 
									title : '组织' 
								},
								// 								{
								// 	field : 'state',
								// 	title : '状态'
								// },
								// 								{
								// 	field : 'businessLevel',
								// 	title : '业务级别'
								// },
								// 								{
								// 	field : 'geographicalPosition',
								// 	title : '地理位置'
								// },
																{
									field : 'cabinet', 
									title : '机柜' 
								},
																{
									field : 'chassis', 
									title : '机箱' 
								},
																{
									field : 'brand', 
									title : '品牌' 
								},
																{
									field : 'model',
									title : '型号'
								},
																{
									field : 'managingIp',
									title : '管理IP'
								},
																{
									field : 'chassisHeight',
									title : '机箱高度'
								},
								// 								{
								// 	field : 'serialNumber',
								// 	title : '序列号'
								// },
								// 								{
								// 	field : 'assetNumber',
								// 	title : '资产编号'
								// },
								// 								{
								// 	field : 'startingDate',
								// 	title : '投产日期'
								// },
								// 								{
								// 	field : 'purchaseDate',
								// 	title : '采购日期'
								// },
								// 								{
								// 	field : 'dateOfInsurance',
								// 	title : '过保日期'
								// },
								// 								{
								// 	field : 'powerA',
								// 	title : '电源A'
								// },
								// 								{
								// 	field : 'powerB',
								// 	title : '电源B'
								// },
								// 								{
								// 	field : 'redundancy',
								// 	title : '冗余'
								// },
								// 								{
								// 	field : 'describe',
								// 	title : '描述'
								// },
								// 								{
								// 	field : 'contacts',
								// 	title : '联系人'
								// },
								// 								{
								// 	field : 'contactsState',
								// 	title : '联系人状态'
								// },
								// 								{
								// 	field : 'contactsOrganize',
								// 	title : '联系人组织'
								// },
								// 								{
								// 	field : 'contactsMailbox',
								// 	title : '联系人邮箱'
								// },
								// 								{
								// 	field : 'contactsTelephone',
								// 	title : '联系人电话'
								// },
								// 								{
								// 	field : 'contactsDuty',
								// 	title : '联系人职责'
								// },
								// 								{
								// 	field : 'file',
								// 	title : '文档'
								// },
								// 								{
								// 	field : 'fileState',
								// 	title : '文档状态'
								// },
								// 								{
								// 	field : 'fileOrganize',
								// 	title : '文档组织'
								// },
								// 								{
								// 	field : 'fileType',
								// 	title : '文档类型'
								// },
								// 								{
								// 	field : 'fileDescribe',
								// 	title : '文档描述'
								// },
								// 								{
								// 	field : 'solution',
								// 	title : '解决方案'
								// },
								// 								{
								// 	field : 'solutionOrganization',
								// 	title : '（解决方案）组织'
								// },
								// 								{
								// 	field : 'soultionBusinessLevel',
								// 	title : '（解决方案）业务级别'
								// },
								// 								{
								// 	field : 'soultionStartingDate',
								// 	title : '（解决方案）投产日期 '
								// },
								// 								{
								// 	field : 'networkName',
								// 	title : '网卡名称'
								// },
								// 								{
								// 	field : 'networkIp',
								// 	title : 'IP地址'
								// },
								// 								{
								// 	field : 'networkMac',
								// 	title : 'Mac地址'
								// },
								// 								{
								// 	field : 'networkNotes',
								// 	title : '注释'
								// },
								// 								{
								// 	field : 'networkGateway',
								// 	title : '网关'
								// },
								// 								{
								// 	field : 'networkMask',
								// 	title : '掩码'
								// },
								// 								{
								// 	field : 'opticalFiberName',
								// 	title : '名称（光纤端口）'
								// },
								// 								{
								// 	field : 'rate',
								// 	title : '速率'
								// },
								// 								{
								// 	field : 'topology',
								// 	title : 'TOPOLOGY'
								// },
								// 								{
								// 	field : 'wwn',
								// 	title : 'WWN'
								// },
								// 								{
								// 	field : 'localNetworkPort',
								// 	title : '本地网口'
								// },
								// 								{
								// 	field : 'equipmentNetMouth',
								// 	title : '设备类型'
								// },
								// 								{
								// 	field : 'lineType',
								// 	title : '连接类型'
								// },
								// 								{
								// 	field : 'networkEquipment',
								// 	title : '网络设备'
								// },
								// 								{
								// 	field : 'networkEquipmentOrganize',
								// 	title : '组织（网络设备）'
								// },
								// 								{
								// 	field : 'networkEquipmentState',
								// 	title : '状态（网络设备）'
								// },
								// 								{
								// 	field : 'networkEquipmentLevel',
								// 	title : '业务级别（网络设备）'
								// },
								// 								{
								// 	field : 'networkEquipmentPosition',
								// 	title : '地理位置（网络设备）'
								// },
								// 								{
								// 	field : 'networkEquipmentBrand',
								// 	title : '品牌（网络设备）'
								// },
								// 								{
								// 	field : 'networkEquipmentModel',
								// 	title : '型号（网络设备）'
								// },
								// 								{
								// 	field : 'networkEquipmentNumber',
								// 	title : '序列号（网络设备）'
								// },
								// 								{
								// 	field : 'fileSystemName',
								// 	title : '姓名（文件系统）'
								// },
								// 								{
								// 	field : 'fileSystemDescribe',
								// 	title : '描述（文件系统）'
								// },
								// 								{
								// 	field : 'fileSystemArrayLevel',
								// 	title : '列阵级别（文件系统）'
								// },
								// 								{
								// 	field : 'fileSystemSize',
								// 	title : '大小（文件系统）'
								// },
								// 								{
								// 	field : 'supplierContract',
								// 	title : '供应商合同'
								// },
								// 								{
								// 	field : 'supplierState',
								// 	title : '状态（供应商合同）'
								// },
								// 								{
								// 	field : 'supplierCustomer',
								// 	title : '客户（供应商合同）'
								// },
								// 								{
								// 	field : 'supplierStart',
								// 	title : '开始时间（供应商合同）'
								// },
								// 								{
								// 	field : 'supplierEnd',
								// 	title : '结束时间（供应商合同）'
								// },
								// 								{
								// 	field : 'supplier',
								// 	title : '供应商'
								// },
								// 								{
								// 	field : 'supplierSla',
								// 	title : 'SLA'
								// },
								// 								{
								// 	field : 'serviceTime',
								// 	title : '服务时间'
								// },
								// 								{
								// 	field : 'supplierDescribe',
								// 	title : '描述（供应商合同）'
								// },
								// 								{
								// 	field : 'service',
								// 	title : '服务'
								// },
								// 								{
								// 	field : 'serviceSupplier',
								// 	title : '服务供应商'
								// },
								// 								{
								// 	field : 'serviceState',
								// 	title : '服务状态'
								// },
								// 								{
								// 	field : 'serviceFamily',
								// 	title : '服务族'
								// },
								// 								{
								// 	field : 'routineChange',
								// 	title : '例行变更'
								// },
								// 								{
								// 	field : 'normalChange',
								// 	title : '正常变更'
								// },
								// 								{
								// 	field : 'urgentChange',
								// 	title : '紧急变更'
								// },
								// 								{
								// 	field : 'event',
								// 	title : '事件'
								// },
								// 								{
								// 	field : 'problem',
								// 	title : '问题'
								// },
								// 								{
								// 	field : 'serviceRequest',
								// 	title : '服务请求'
								// },
																{
									title : '操作',
									field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.nasId
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.nasId
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.nasId
												+ '\')"><i class="fa fa-key"></i></a> ';
										return e + d ;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'nasId' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['nasId'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});
}