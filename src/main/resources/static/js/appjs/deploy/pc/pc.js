
var prefix = "/deploy/pc"
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
                                pcName:$('#searchName').val(),
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
									field : 'pcId', 
									title : 'ID' 
								},
																{
									field : 'pcName', 
									title : '名称' 
								},
																{
									field : 'organization', 
									title : '组织' 
								},
																{
									field : 'state', 
									title : '状态' 
								},
																{
									field : 'businessLevel', 
									title : '业务级别' 
								},
																{
									field : 'geographicalPosition', 
									title : '地理位置' 
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
									field : 'osFamily', 
									title : 'OS家族' 
								},
								// 								{
								// 	field : 'osVersion',
								// 	title : 'OS版本'
								// },
								// 								{
								// 	field : 'type',
								// 	title : '类型'
								// },
								// 								{
								// 	field : 'cpu',
								// 	title : 'CPU'
								// },
								// 								{
								// 	field : 'memory',
								// 	title : '内存'
								// },
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
								// 	field : 'describe',
								// 	title : '描述'
								// },
								// 								{
								// 	field : 'software',
								// 	title : '软件'
								// },
								// 								{
								// 	field : 'softwareLicense',
								// 	title : '软件许可证'
								// },
								// 								{
								// 	field : 'contacts',
								// 	title : '联系人'
								// },
								// 								{
								// 	field : 'organize',
								// 	title : '组织'
								// },
								// 								{
								// 	field : 'mailbox',
								// 	title : '邮箱'
								// },
								// 								{
								// 	field : 'telephone',
								// 	title : '电话'
								// },
								// 								{
								// 	field : 'duty',
								// 	title : '职责'
								// },
								// 								{
								// 	field : 'contactState',
								// 	title : '联系人状态'
								// },
								// 								{
								// 	field : 'softwareName',
								// 	title : '软件名称'
								// },
								// 								{
								// 	field : 'softwareOrganization',
								// 	title : '软件组织'
								// },
								// 								{
								// 	field : 'softwareState',
								// 	title : '软件状态'
								// },
								// 								{
								// 	field : 'softwareLevel',
								// 	title : '软件业务级别'
								// },
								// 								{
								// 	field : 'softwareRoute',
								// 	title : '软件路径'
								// },
								// 								{
								// 	field : 'softwareStartingDate',
								// 	title : '软件投产日期'
								// },
								// 								{
								// 	field : 'softwareDescribe',
								// 	title : '软件描述'
								// },
								// 								{
								// 	field : 'file',
								// 	title : '文档'
								// },
								// 								{
								// 	field : 'fileOrganize',
								// 	title : '组织（文档）'
								// },
								// 								{
								// 	field : 'fileState',
								// 	title : '状态（文档）'
								// },
								// 								{
								// 	field : 'fileDype',
								// 	title : '类型（文档）'
								// },
								// 								{
								// 	field : 'fileDescribe',
								// 	title : '描述（文档）'
								// },
								// 								{
								// 	field : 'networkName',
								// 	title : '名称（网卡）'
								// },
								// 								{
								// 	field : 'networkIp',
								// 	title : 'IP地址'
								// },
								// 								{
								// 	field : 'networkMac',
								// 	title : 'MAC地址'
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
								// 	field : 'networkSulv',
								// 	title : '速率'
								// },
								// 								{
								// 	field : 'localNetworkPort',
								// 	title : '本地网口'
								// },
								// 								{
								// 	field : 'equipmentNetMouth',
								// 	title : '设备网口'
								// },
								// 								{
								// 	field : 'lineType',
								// 	title : '连接设备（网络设备）'
								// },
								// 								{
								// 	field : 'networkEquipment',
								// 	title : '网络设备'
								// },
								// 								{
								// 	field : 'networkOrganize',
								// 	title : '组织（网络设备）'
								// },
								// 								{
								// 	field : 'networkState',
								// 	title : '状态（网络设备）'
								// },
								// 								{
								// 	field : 'networkBusinessLevel',
								// 	title : '业务级别（网络设备）'
								// },
								// 								{
								// 	field : 'networkGeographicalPosition',
								// 	title : '地理位置（网络设备）'
								// },
								// 								{
								// 	field : 'networkBrand',
								// 	title : '品牌（网络设备）'
								// },
								// 								{
								// 	field : 'networkModel',
								// 	title : '型号（网络设备）'
								// },
								// 								{
								// 	field : 'networkNumber',
								// 	title : '序列号（网络设备）'
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
								// 	field : 'supplierDescribe',
								// 	title : '描述（供应商合同）'
								// },
								// 								{
								// 	field : 'supplierStart',
								// 	title : '开始日期（供应商合同）'
								// },
								// 								{
								// 	field : 'supplierEnd',
								// 	title : '结束日期（供应商合同）'
								// },
								// 								{
								// 	field : 'supplier',
								// 	title : '供应商'
								// },
								// 								{
								// 	field : 'supplierSla',
								// 	title : 'SLA（供应商合同）'
								// },
								// 								{
								// 	field : 'serviceTime',
								// 	title : '服务时间'
								// },
								// 								{
								// 	field : 'service',
								// 	title : '服务'
								// },
								// 								{
								// 	field : 'serviceSupplier',
								// 	title : '供应商（服务）'
								// },
								// 								{
								// 	field : 'serviceState',
								// 	title : '状态（服务）'
								// },
								// 								{
								// 	field : 'serviceFamily',
								// 	title : '服务族'
								// },
								// 								{
								// 	field : 'routerChange',
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
								// 	field : 'problem',
								// 	title : '问题'
								// },
								// 								{
								// 	field : 'event',
								// 	title : '事件'
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
												+ row.pcId
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.pcId
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.pcId
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
				'pcId' : id
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
			ids[i] = row['pcId'];
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