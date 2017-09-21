<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ include file="/WEB-INF/views/include/taglib.jsp" %>
<%! long datestamp = new Date().getTime(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>模型列表</title>
    <style type="text/css">
        @IMPORT url('<c:url value="/static/css/bootstrap.min.css"/>?random=<%=datestamp%>');
        @IMPORT url('<c:url value="/static/css/bootstrap-table.min.css"/>?random=<%=datestamp%>');
        @IMPORT url('<c:url value="/static/css/site.css"/>?random=<%=datestamp%>');
    </style>

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
            <a class="navbar-brand" href="#">流程管理</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="#">流程管理</a></li>
                <li><a href="#about">任务管理</a></li>
                <li class="active"><a href="#">模型管理</a></li>
            </ul>
        </div>
        <!--/.nav-collapse -->
    </div>
</nav>

<div class="container">
    <ol class="breadcrumb" style="margin-top: 10px;">
        <li><a href="#">模型管理</a></li>
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
                    <input type="text"  class="form-control" id="txtModelType" placeholder="">
                </div>
                <button type="submit" class="btn btn-primary">
                    <span class="glyphicon glyphicon-search" aria-hidden="true"></span>&nbsp;查询
                </button>
                <button type="button" class="btn btn-warning">
                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;新增模型
                </button>
            </form>
        </div>
    </div>

    <div>
        <table id="demo-table">
        </table>

    </div>
</div>

<script type="text/javascript" src="<c:url value="/static/js/jquery.js"/>?random=<%=datestamp%>"></script>
<script type="text/javascript" src="<c:url value="/static/js/bootstrap.min.js"/>?random=<%=datestamp%>"></script>
<script type="text/javascript" src="<c:url value="/static/js/bootstrap-table.min.js"/>?random=<%=datestamp%>"></script>
<script type="text/javascript" src="<c:url value="/static/js/pageJs/actmodel.js"/>?random=<%=datestamp%>"></script>

</body>
</html>