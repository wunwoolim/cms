<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/style/grid.css">
<title>The Joeun JSP MVC1</title>
</head>
<body>
	<header>
		<h1>The Joeun JSP MVC1</h1>
	</header>
	
	<nav>
		<ul>
			<li><a href="/">홈</a></li>
			
	<c:if test="${empty responseUser}">
		<li><a href="/join">회원가입</a></li>
		<li><a href="/login">로그인</a></li>
	</c:if>
	
	<c:if test="${!empty responseUser}">
		<li>${ sessionScope.responseUser.getName() }님 환영합니다.</li>
			<li><a href="/logout">로그아웃</a></li>
	</c:if>
			<li><a href="/mypage">마이페이지</a></li>
			<li><a href="/board">게시판</a></li>
			<li><a href="/memberList">회원목록 조회</a></li>
		</ul>
	</nav>

	
</body>
</html>