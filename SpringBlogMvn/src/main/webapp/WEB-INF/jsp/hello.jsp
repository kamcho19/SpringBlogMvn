<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Millky</title>
<link rel="stylesheet" href="/webjars/bootstrap/4.1.0/dist/css/bootstrap.min.css">
</head>
<body>
	<c:out value="<xmp>" escapeXml="true"></c:out>
	<h2>Hello! ${name}</h2>
	<div>JSP version</div>
	
	<button type="button" class="btn btn-primary">Primary</button>
	<button type="button" class="btn btn-secondary">Secondary</button>
	<button type="button" class="btn btn-success">Success</button>
	<button type="button" class="btn btn-danger">Danger</button>
	<button type="button" class="btn btn-warning">Warning</button>
	<button type="button" class="btn btn-info">Info</button>
	<button type="button" class="btn btn-light">Light</button>
	<button type="button" class="btn btn-dark">Dark</button>
	
	<button type="button" class="btn btn-link">Link</button>	
	
	
	<script src="/webjars/jquery/3.3.1/dist/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.1.0/dist/js/bootstrap.min.js"></script>
</body>
</html>