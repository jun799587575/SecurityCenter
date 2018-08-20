$(function() {
	load();
});
// var data2 = [{'knowTitle':'1','knowSource':'2','knowTime':'3','knowState':'4'}];
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
						// data:data2,
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
									title : '影响'
								},
																{
									field : 'knowSource',
									title : '配置项类型'
								},
																{
									field : 'knowTime', 
									title : '配置项'
								}]
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
                // data:data2,
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
                        title : '角色'
                    },
                    {
                        field : 'knowSource',
                        title : '联系人类型'
                    },
                    {
                        field : 'knowTime',
                        title : '联系人'
                    }]
            });

}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
