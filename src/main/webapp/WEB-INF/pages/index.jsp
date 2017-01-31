<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ru" data-ng-app="app">
<head>
	<base href="${pageContext.request.contextPath}/">
	<meta charset="UTF-8">
	<title>Site Control</title>
	<link rel="stylesheet" data-ng-href="res/bower_components/bootstrap/dist/css/bootstrap.min.css" >
</head>

<body class="container" ng-controller="MainController">

<ul class="nav nav-pills">
	<li role="presentation"  ng-class="{'active': param == '/people'}"><a href="#/people">Cписок людей</a></li>
	<li role="presentation"  ng-class="{'active': param == '/site'}"><a href="#/site">Список сайтов</a></li>
</ul>

<div  data-ng-view></div>

<script src="res/bower_components/jquery/dist/jquery.js"></script>
<script src="res/bower_components/angular/angular.js"></script>
<script src="res/bower_components/angular-route/angular-route.js"></script>
<script src="res/bower_components/angular-resource/angular-resource.js"></script>
<script src="res/bower_components/bootstrap/dist/js/bootstrap.js"></script>
<script src="res/js/app.js"></script>
<script src="res/js/peopleController.js"></script>
<script src="res/js/siteController.js"></script>

</body>
</html>
