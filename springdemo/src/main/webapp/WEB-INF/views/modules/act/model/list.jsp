<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>模型列表</title>
<style type="text/css">
@IMPORT
	url('<c:url value="/static/css/bootstrap.min.css"/>');

@IMPORT url('<c:url value="/static/css/site.css"/>');
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
						<label for="txtModelType">模型分类</label> <input type="text"
							class="form-control" id="txtModelType" placeholder="">
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
			<table
				class="table table-striped table-bordered table-condensed table-nowrap">
				<thead>
					<tr>
						<th>流程分类</th>
						<th>模型ID</th>
						<th>模型标识</th>
						<th>模型名称</th>
						<th>版本号</th>
						<th>创建时间</th>
						<th>最后更新时间</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pagedata.list}" var="model">
						<tr>
							<td><a
								href="javascript:updateCategory('${model.id}', '${model.category}')"
								title="设置分类"></a></td>
							<td>${model.id}</td>
							<td>${model.key}</td>
							<td>${model.name}</td>
							<td><b title='流程版本号'>V: ${model.version}</b></td>
							<td><fmt:formatDate value="${model.createTime}"
									pattern="yyyy-MM-dd HH:mm:ss" /></td>
							<td><fmt:formatDate value="${model.lastUpdateTime}"
									pattern="yyyy-MM-dd HH:mm:ss" /></td>
							<td><a
								href="${pageContext.request.contextPath}/static/act/modeler.html?modelId=${model.id}"
								target="_blank">编辑</a></td>
						</tr>						
					</c:forEach>
				</tbody>
			</table>

			<nav aria-label="Page navigation">
			<ul class="pagination margintop0 floatright">
				<li><a href="#" aria-label="Previous"> <span
						aria-hidden="true">&laquo;</span>
				</a></li>
				<c:forEach begin="1" end="${pagedata.pageCount }" var="i">
					<li><a href="${pageContext.request.contextPath}/act/model/list?modeltype=&pageindex=${i}&pagesize=${pagedata.pageSize }">${i}</a></li>
				</c:forEach>

				<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
			</nav>

		</div>
	</div>


	<script type="text/javascript"
		src="<c:url value="/static/js/bootstrap.min.js"/>"></script>

</body>
</html>