var prefix = "/event/processing"
$(function () {
    load();
});


var qweasssAAA =function(rowid){
    //弹出即全屏
    var fqbx_index = layer.open({
        content: "/event/processing"+'/bianji',
        type : 2,
        title : '编辑',
        maxmin: true,
        shadeClose : false, // 点击遮罩关闭层
    });
    layer.full(fqbx_index);
}






function load() {
    $('#exampleTable')
        .bootstrapTable(
            {
                method: 'get', // 服务器数据的请求方式 get or post
                url: prefix + "/list", // 服务器数据的加载地址
                //	showRefresh : true,
                //	showToggle : true,
                //	showColumns : true,
                iconSize: 'outline',
                toolbar: '#exampleToolbar',
                striped: true, // 设置为true会有隔行变色效果
                dataType: "json", // 服务器返回的数据类型
                pagination: true, // 设置为true会在底部显示分页条
                // queryParamsType : "limit",
                // //设置为limit则会发送符合RESTFull格式的参数
                singleSelect: false, // 设置为true将禁止多选
                // contentType : "application/x-www-form-urlencoded",
                // //发送到服务器的数据编码类型
                pageSize: 10, // 如果设置了分页，每页数据条数
                pageNumber: 1, // 如果设置了分布，首页页码
                //search : true, // 是否显示搜索框
                showColumns: false, // 是否显示内容下拉框（选择显示的列）
                sidePagination: "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
                queryParams: function (params) {
                    return {
                        //说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
                        limit: params.limit,
                        offset: params.offset,
                        jobNumber: $('#searchJobNumber').val(),
                        type: $('#searchType').val(),
                        eventLevel: $('#searchEventLevel').val(),
                        reportingTime: $('#searchReportingTime').val(),
                        state: $('#searchState').val(),

                    };
                },
                // //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
                // queryParamsType = 'limit' ,返回参数必须包含
                // limit, offset, search, sort, order 否则, 需要包含:
                // pageSize, pageNumber, searchText, sortName,
                // sortOrder.
                // 返回false将会终止请求
                columns: [
                    {
                        checkbox: true
                    },
                    {
                        field: 'eventId',
                        title: 'ID'
                    },
                    {
                        field: 'jobNumber',
                        title: '工单号'
                    },
                    {
                        field: 'person',
                        title: '投资人'
                    },
                    {
                        field: 'reportingTime',
                        title: 'SLA响应时间'
                    },
                    {
                        field: 'reportingTime',
                        title: '实际响应时间'
                    },
                    {
                        field: 'reportingTime',
                        title: 'SLA处理时间'
                    },
                    {
                        field: 'reportingTime',
                        title: '实际处理时间'
                    },
                    {
                        field: 'state',
                        title: '状态'
                    },
                    {
                        field: 'eventLevel',
                        title: '事件级别   ', formatter: function (value, row, index) {
                            if (value == '1') {
                                return '<span class="label label-danger">一级</span>';
                            } else if (value == '2') {
                                return '<span class="label label-primary">二级</span>';
                            } else if (value == '3') {
                                return '<span class="label label-primary">三级</span>';
                            } else if (value == '4') {
                                return '<span class="label label-primary">四级</span>';
                            }
                        }

                    },
                    {
                        field: 'type',
                        title:
                            '服务类型'
                    }
                    ,
                    {
                        field: 'source',
                        title:
                            '来源'
                    }
                    ,
                    // {
                    //     field: 'processingContent',
                    //     title:
                    //         '处理内容'
                    // }
                    // ,
                    // {
                    //     field: 'enclosure',
                    //     title:
                    //         '附件'
                    // }
                    // ,
                    // {
                    //     field: 'missionPersonnel',
                    //     title:
                    //         '任务人员'
                    // }
                    // ,
                    // {
                    //     field: 'missionCompletionTime',
                    //     title:
                    //         '任务完成时间'
                    // }
                    // ,
                    // {
                    //     field: 'describe',
                    //     title:
                    //         '描述'
                    // }
                    // ,
                    {
                        title: '操作',
                        field:
                            'id',
                        align:
                            'center',
                        formatter:

                            function (value, row, index) {

                                // var d= '<a class="btn btn-primary btn-sm  " href="#" title="编辑"  mce_href="#" onclick="qweasssAAA(\''
                                //     + row.ipId
                                //     + '\')"><i class="fa fa-edit"></i></a> ';
                                var e = '<a class="btn btn-primary btn-sm " href="#" mce_href="#" title="详情" onclick="edit(\''
                                    + row.eventId
                                    + '\')"><i class="fa fa-id-card" aria-hidden="true">详情</i></a> ';

                                var d = '<a class="btn btn-primary btn-sm " href="#" title="编辑"  mce_href="#" onclick="qweasssAAA(\''
                                    + row.eventId
                                    + '\')"><i class="fa fa-edit"></i></a> ';
                                // var d = '<a class="btn btn-success btn-sm " href="#" title="详情"  mce_href="#" onclick="asdqAAA(\''
                                //     + row.ipId
                                //     + '\')"><i class="fa fa-id-card" aria-hidden="true">详情</i></a> ';
                                var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
                                    + row.eventId
                                    + '\')"><i class="fa fa-key"></i></a> ';
                                return e + d;
                            }
                    }
                ]
            })
    ;
}

function reLoad() {
    $('#exampleTable').bootstrapTable('refresh');
}


function add() {
    var mn_index = layer.open({
        type: 2,
        title: '增加',
        maxmin: true,
        // shadeClose: false, // 点击遮罩关闭层
        // area: ['1200px', '800px'],
        content: prefix + '/add' // iframe的url
    });
    layer.full(mn_index);
}





function edit(id) {
    var mn_index =  layer.open({
        type: 2,
        title: '详情',
        maxmin: true,
        shadeClose: false, // 点击遮罩关闭层
        area: ['800px', '520px'],
        content: prefix + '/edit/' + id // iframe的url
    });
    layer.full(mn_index);
}

function remove(id) {
    layer.confirm('确定要删除选中的记录？', {
        btn: ['确定', '取消']
    }, function () {
        $.ajax({
            url: prefix + "/remove",
            type: "post",
            data: {
                'eventId': id
            },
            success: function (r) {
                if (r.code == 0) {
                    layer.msg(r.msg);
                    reLoad();
                } else {
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
        btn: ['确定', '取消']
        // 按钮
    }, function () {
        var ids = new Array();
        // 遍历所有选择的行数据，取每条数据对应的ID
        $.each(rows, function (i, row) {
            ids[i] = row['eventId'];
        });
        $.ajax({
            type: 'POST',
            data: {
                "ids": ids
            },
            url: prefix + '/batchRemove',
            success: function (r) {
                if (r.code == 0) {
                    layer.msg(r.msg);
                    reLoad();
                } else {
                    layer.msg(r.msg);
                }
            }
        });
    }, function () {

    });
}