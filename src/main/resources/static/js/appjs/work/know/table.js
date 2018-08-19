$(function() {
	load();
});
var data2 = [{'knowTitle':'1','knowSource':'2','knowTime':'3','knowState':'4'}];
function load() {
	$('#table1')
			.bootstrapTable(
					{
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "local", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						singleSelect : false, // 设置为true将禁止多选
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						showColumns : false, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						data:data2,
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset,
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
									field : 'reason',
									title : 'reason'
								},
																{
									field : 'knowSource',
									title : '功能配置项'
								},
																{
									field : 'knowTime', 
									title : '组织'
								},
																{
									field : 'knowState', 
									title : '业务级别'
								},
																{
									field : 'konwCategory', 
									title : '投产日期'
								}
									/*							{
									field : 'knowContext', 
									title : '内容' 
								},
																{
									field : 'knowEnclosure', 
									title : '附件' 
								},*/
																 ]
					});
    $('#table2')
        .bootstrapTable(
            {
                iconSize : 'outline',
                toolbar : '#exampleToolbar',
                striped : true, // 设置为true会有隔行变色效果
                dataType : "local", // 服务器返回的数据类型
                pagination : true, // 设置为true会在底部显示分页条
                singleSelect : false, // 设置为true将禁止多选
                pageSize : 10, // 如果设置了分页，每页数据条数
                pageNumber : 1, // 如果设置了分布，首页页码
                showColumns : false, // 是否显示内容下拉框（选择显示的列）
                sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
                data:data2,
                queryParams : function(params) {
                    return {
                        //说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
                        limit: params.limit,
                        offset:params.offset,
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
                        title : '服务请求'
                    },
                    {
                        field : 'knowSource',
                        title : '标题'
                    },
                    {
                        field : 'knowTime',
                        title : '组织'
                    },
                    {
                        field : 'knowState',
                        title : '发起人'
                    },
																{
									field : 'konwCategory',
									title : '开始日期'
								},
																{
									field : 'knowContext',
									title : '状态'
								},
															{
									field : 'knowEnclosure',
									title : '办理人'
								}]
            });
    $('#table3')
        .bootstrapTable(
            {
                iconSize : 'outline',
                toolbar : '#exampleToolbar',
                striped : true, // 设置为true会有隔行变色效果
                dataType : "local", // 服务器返回的数据类型
                pagination : true, // 设置为true会在底部显示分页条
                singleSelect : false, // 设置为true将禁止多选
                pageSize : 10, // 如果设置了分页，每页数据条数
                pageNumber : 1, // 如果设置了分布，首页页码
                showColumns : false, // 是否显示内容下拉框（选择显示的列）
                sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
                data:data2,
                queryParams : function(params) {
                    return {
                        //说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
                        limit: params.limit,
                        offset:params.offset,
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
									field : 'knowKeyword',
									title : '事件'
								},
                    {
                        field : 'knowTitle',
                        title : '标题'
                    },
                    {
                        field : 'knowSource',
                        title : '组织'
                    },
                    {
                        field : 'knowTime',
                        title : '发起人'
                    },
                    {
                        field : 'knowState',
                        title : '开始日期'
                    },
																{
									field : 'konwCategory',
									title : '状态'
								},
																{
									field : 'knowContext',
									title : '办理人'
								}
								]
            });
    $('#table4')
        .bootstrapTable(
            {
                iconSize : 'outline',
                toolbar : '#exampleToolbar',
                striped : true, // 设置为true会有隔行变色效果
                dataType : "local", // 服务器返回的数据类型
                pagination : true, // 设置为true会在底部显示分页条
                singleSelect : false, // 设置为true将禁止多选
                pageSize : 10, // 如果设置了分页，每页数据条数
                pageNumber : 1, // 如果设置了分布，首页页码
                showColumns : false, // 是否显示内容下拉框（选择显示的列）
                sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
                data:data2,
                queryParams : function(params) {
                    return {
                        //说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
                        limit: params.limit,
                        offset:params.offset,
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
									field : 'knowKeyword',
									title : '问题'
								},
                    {
                        field : 'knowTitle',
                        title : '标题'
                    },
                    {
                        field : 'knowSource',
                        title : '组织'
                    },
                    {
                        field : 'knowTime',
                        title : '开始日期'
                    },
                    {
                        field : 'knowState',
                        title : '状态'
                    },
																{
									field : 'konwCategory',
									title : '服务'
								},
																{
									field : 'knowContext',
									title : '优先级'
								}]
            });
    $('#table5')
        .bootstrapTable(
            {
                iconSize : 'outline',
                toolbar : '#exampleToolbar',
                striped : true, // 设置为true会有隔行变色效果
                dataType : "local", // 服务器返回的数据类型
                pagination : true, // 设置为true会在底部显示分页条
                singleSelect : false, // 设置为true将禁止多选
                pageSize : 10, // 如果设置了分页，每页数据条数
                pageNumber : 1, // 如果设置了分布，首页页码
                showColumns : false, // 是否显示内容下拉框（选择显示的列）
                sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
                data:data2,
                queryParams : function(params) {
                    return {
                        //说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
                        limit: params.limit,
                        offset:params.offset,
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
									field : 'knowKeyword',
									title : '变更'
								},
                    {
                        field : 'knowTitle',
                        title : '标题'
                    },
                    {
                        field : 'knowSource',
                        title : '组织'
                    },
                    {
                        field : 'knowTime',
                        title : '开始日期'
                    },
                    {
                        field : 'knowState',
                        title : '结束日期'
                    },
																{
									field : 'konwCategory',
									title : '状态'
								},
																{
									field : 'knowContext',
									title : '办理人'
								}]
            });
    $('#table6')
        .bootstrapTable(
            {
                iconSize : 'outline',
                toolbar : '#exampleToolbar',
                striped : true, // 设置为true会有隔行变色效果
                dataType : "local", // 服务器返回的数据类型
                pagination : true, // 设置为true会在底部显示分页条
                singleSelect : false, // 设置为true将禁止多选
                pageSize : 10, // 如果设置了分页，每页数据条数
                pageNumber : 1, // 如果设置了分布，首页页码
                showColumns : false, // 是否显示内容下拉框（选择显示的列）
                sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
                data:data2,
                queryParams : function(params) {
                    return {
                        //说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
                        limit: params.limit,
                        offset:params.offset,
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
                        title : 'link type'
                    },
                    {
                        field : 'knowSource',
                        title : '文档'
                    },
                    {
                        field : 'knowTime',
                        title : '组织'
                    },
                    {
                        field : 'knowState',
                        title : '状态'
                    },
																{
									field : 'konwCategory',
									title : '文档类型'
								},
																{
									field : 'knowContext',
									title : '描述'
								}]
            });

}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
