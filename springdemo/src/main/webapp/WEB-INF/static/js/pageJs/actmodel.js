/**
 * Created by gao.guangcai on 2017-09-21.
 */

$(function () {
    //初始化表格
    initTable();

    //查询Model
    $("#btnQuery").click(function () {
        $('#demo-table').bootstrapTable('refresh');    //刷新表格
    });

    //创建Model
    $("#btnCreateModal").click(function () {
        var url = "/springdemo/api/model/create";
        var param = {
            "name": $("#txtModelName").val(),
            "key": $("#txtModelKey").val(),
            "category": $("#txtModelCatagory").val(),
            "description": $("#txtModelSpec").val()
        };
        $.ajax({
            beforeSend: function (xhr) {
                xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
            },
            type: "POST",
            url: url,
            async: true,
            data: JSON.stringify(param),
            dataType: "json",
            success: function (data, status, xhr) {
                alert("创建成功" + data.msg);
                var url="/springdemo/static/act/modeler.html?modelId="+data.data;

                $("#myModal").modal('hide');
                $("#myModal form")[0].reset();

                window.open(url,"_blank");
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("创建失败："+textStatus);
            }
        });

    });


});

//删除Model
function deleteModel (id) {
    var url = "/springdemo/api/model/delete";

    if(!confirm("确认删除？")){
        return false;
    }

    $.ajax({
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Content-Type", "text/plain;charset=UTF-8");
        },
        type: "POST",
        url: url,
        async: true,
        data: id,
        // dataType: "text/plain",
        success: function (data, status, xhr) {
            // alert("删除成功" + data.msg);
            $("#btnQuery").click();
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("删除失败："+textStatus);
        }
    });
}

function initTable() {
    var url = "/springdemo/api/model/list";//?random="+Math.random();
    $('#demo-table').bootstrapTable({
        method: 'POST',
        dataType: 'json',
        contentType: "application/json;charset=utf-8",
        cache: false,
        striped: true,                              //是否显示行间隔色
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        url: url,
        height: $(window).height() - 310,
        width: $(window).width(),
        showColumns: true,
        pagination: true,
        queryParams: function (params) {
            var pageIndex = params.offset / params.limit;
            if (!isNaN(pageIndex)) {
                pageIndex = pageIndex + 1;
            } else {
                pageIndex = 1;
            }
            params.category = $("#txtModelType").val();
            params.pageIndex = pageIndex; // 页面大小
            params.pageSize = params.limit;// 页码
            return JSON.stringify(params);
        },
        // queryParamsType: "limit",
        minimumCountColumns: 2,
        pageNumber: 1,                       //初始化加载第一页，默认第一页
        pageSize: 10,                       //每页的记录行数（*）
        pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
        idField: "id",
        uniqueId: "id",                     //每一行的唯一标识，一般为主键列
        showExport: true,
        exportDataType: 'all',
        responseHandler: responseHandler,
        columns: [
            {field: '', title: 'No', valign: 'middle', formatter: bootstrapTableNo}
            , {field: 'id', title: '模型 ID', align: 'center', valign: 'middle', visible: false}
            , {field: 'name', title: '名称', align: 'center', valign: 'middle', sortable: true}
            , {field: 'key', title: '模型Key', align: 'center', valign: 'middle'}
            , {field: 'category', title: '分类', align: 'center', valign: 'middle', sortable: true}
            , {field: 'createTime', title: '创建时间', align: 'center', valign: 'middle'}
            , {field: 'lastUpdateTime', title: '更新时间', align: 'center', valign: 'left'}
            , {field: 'version', title: '版本', align: 'center', valign: 'middle'}
            , {field: 'tenantId', title: '承租人Id', align: 'center', valign: 'middle'}
            , {field: '', title: '操作', valign: 'middle', align: 'center', formatter: bootstrapTableOperation}
        ]
    });
}
// 用于server 分页，表格数据量太大的话 不想一次查询所有数据，可以使用server分页查询，
// 数据量小的话可以直接把sidePagination: "server"  改为 sidePagination: "client" ，
// 同时去掉responseHandler: responseHandler就可以了，
function responseHandler(res) {
    if (res) {
        return {
            "rows": res.data.list,
            "total": res.data.count
        };
    } else {
        return {
            "rows": [],
            "total": 0
        };
    }
}
function bootstrapTableNo(value, row, index) {
    var tableOptions = $('#demo-table').bootstrapTable('getOptions');
    return ((tableOptions.pageNumber - 1) * tableOptions.pageSize) + (1 + index);
}
function bootstrapTableOperation(value, row, index) {
    // console.log(value, row, index);
    // var tableOptions = $('#demo-table').bootstrapTable('getOptions');
    // return ((tableOptions.pageNumber - 1) * tableOptions.pageSize) + (1 + index);

    var link = '<a class="btn btn-primary btn-xs" target="_blank" href="/springdemo/static/act/modeler.html?modelId=' + row.id + '"> 编辑</a> ';
    link += '<a class="btn btn-warning btn-xs" href="javascript:;"> 发布</a> ';
    link += '<a class="btn btn-danger btn-xs"  onclick="deleteModel(\''+row.id.trim()+'\')"> 删除</a>';
    return link;
}
