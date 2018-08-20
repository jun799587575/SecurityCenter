
var prefix = "/information/safety"
$(function() {
    // getTreeData();
	load();
});
var data2 = [{'knowTitle':'1','knowSource':'2','knowTime':'3','knowState':'4'}];
function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						// method : 'get', // 服务器数据的请求方式 get or post
						// url : prefix + "/list", // 服务器数据的加载地址
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "local", // 服务器返回的数据类型
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
						data:data2,
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset,

                               /* knowKeyword:$('searchKnowKeyword').val(),
                                knowTitle:$('searchKnowTitle').val(),
                                knowTime:$('searchKnowTime').val(),
                                searchKonwCategory:$('searchKonwCategory').val()*/
					           // name:$('#searchName').val(),
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
								},/*
																{
									field : 'knowKeyword',
									title : '关键字'
								},,*/
																{
									field : 'knowTitle', 
									title : '风险项'
								},
																{
									field : 'knowSource', 
									title : '配置项'
								},
																{
									field : 'knowTime', 
									title : '服务'
								},{
                                field : 'knowTime',
                                title : '状态'
                            },
																{
									field : 'knowState', 
									title : '风险描述'
								},
																{
									field : 'konwCategory', 
									title : '来源'
								},
                            {
                                title : '操作',
                                field : 'id',
                                align : 'center',
                                formatter : function(value, row, index) {
                                    var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="分派" onclick="edit(\''
                                        + row.workId
                                        + '\')"><i class="fa fa-edit"></i></a> ';
                                    var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
                                        + row.workId
                                        + '\')"><i class="fa fa-remove"></i></a> ';
                                    var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
                                        + row.workId
                                        + '\')"><i class="fa fa-key"></i></a> ';
                                    return d ;
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
				'id' : id
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
        layer.msg("请选择要生成报告的风险项！");
        return;
    }
    var index=layer.confirm('确定要生成此风险项的报告？', {
        btn : [ '确定', '取消' ]
    }, function() {
        parent.layer.msg("生成成功");
        // var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
        layer.close(index);
    })
}
