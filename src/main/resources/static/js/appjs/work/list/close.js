/*$().ready(function() {
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		save();
	}
});*/
function save() {
    layer.msg("请选择满意度1");
    var rows = $('#signupForm').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
    if (rows.length == 0) {
        layer.msg("请选择满意度");
        return;
    }else {
        parent.layer.msg("操作成功");
        var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
        parent.layer.close(index);
	}
}
