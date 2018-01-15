<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%! long datestamp = new Date().getTime(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath }/favicon.ico"  media="screen"/>
    <title>模型列表</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/bootstrap.min.css?random=<%=datestamp%>">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/bootstrap-table.min.css?random=<%=datestamp%>">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/site.css?random=<%=datestamp%>">

</head>

<body style="margin-top: 50px">

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed"
                    data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                    aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Activiti工作流</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="#">流程管理</a></li>
                <li><a href="#about">任务管理</a></li>

                <li class="dropdown active">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        流程管理
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">模型管理</a></li>
                        <li><a href="#">流程管理</a></li>

                    </ul>
                </li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</nav>

<div class="container">
    <ol class="breadcrumb" style="margin-top: 10px;">
        <li><a href="#">流程管理</a></li>
        <li class="active">模型列表</li>
    </ol>

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">搜索</h3>
        </div>
        <div class="panel-body">
            <form class="form-inline">
                <div class="form-group">
                    <label for="txtModelType">模型分类</label>
                    <input type="text" class="form-control" id="txtModelType" placeholder="">
                </div>
                <button id="btnQuery" type="button" class="btn btn-primary">
                    <span class="glyphicon glyphicon-search" aria-hidden="true"></span>&nbsp;查询
                </button>
                <a class="btn btn-warning" data-toggle="modal" data-target="#myModal">
                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;新增模型
                </a>
            </form>
        </div>
    </div>

    <div>
        <table id="demo-table">
        </table>

    </div>


    <!-- 模态框（Modal） -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">
                        新增流程图
                    </h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="txtModelCatagory" class="col-sm-3 control-label">分类</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="txtModelCatagory" required placeholder="分类">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="txtModelName" class="col-sm-3 control-label">模型名称</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="txtModelName" placeholder="模型名称">

                            </div>
                        </div>
                        <div class="form-group">
                            <label for="txtModelKey" class="col-sm-3 control-label">模型Key</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="txtModelKey" placeholder="模型Key">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="txtModelSpec" class="col-sm-3 control-label">描述</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" id="txtModelSpec" placeholder="描述">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                    <button id="btnCreateModal" type="button" class="btn btn-primary">
                        新增
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>

</div>


<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.js?random=<%=datestamp%>"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js?random=<%=datestamp%>"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap-table.min.js?random=<%=datestamp%>"></script>

<script type="text/javascript">


    $(function () {
        //初始化表格
        initTable();

        //查询Model
        $("#btnQuery").click(function () {
            $('#demo-table').bootstrapTable('refresh');    //刷新表格
        });

        //创建Model
        $("#btnCreateModal").click(function () {
            var url = "${pageContext.request.contextPath }/api/model/create";
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
                    var url="${pageContext.request.contextPath }/static/act/modeler.html?modelId="+data.data;

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
        var url = "${pageContext.request.contextPath }/api/model/delete";

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
        var url = "${pageContext.request.contextPath }/api/model/list";//?random="+Math.random();
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

        var link = '<a class="btn btn-primary btn-xs" target="_blank" href="${pageContext.request.contextPath }/static/act/modeler.html?modelId=' + row.id + '"> 编辑</a> ';
        link += '<a class="btn btn-warning btn-xs" href="javascript:;"> 发布</a> ';
        link += '<a class="btn btn-danger btn-xs"  onclick="deleteModel(\''+row.id.trim()+'\')"> 删除</a>';
        return link;
    }


</script>
</body>
</html>

