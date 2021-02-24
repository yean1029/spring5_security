<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
   <title>유저 페이지</title>
</head>

<body>

<h1>유저 페이지 입니다.</h1>

<p>principal: <sec:authentication property="principal.member"/></p>
 
<!-- 로그인 하지 않은 모든 사용자(로그인 중인 사용자에게는 보이지 않음) -->
<sec:authorize access="isAnanymous()">
<a href="/login">로그인</</a>
</sec:authorize>
 
 
 <!-- 
<p>사용자이름: <sec:authentication property="principal.emp.ename"/></p>
<p>사용자월급: <sec:authentication property="principal.emp.sal"/></p>
<p>사용자입사일자: <sec:authentication property="principal.emp.hiredate"/></p>  
-->

<p><a href="<c:url value="/" />">홈</a></p> 

<!-- 표현식이 지정한 권한에 맞을 때만 출력 -->
<sec:authorize access="isAnanymous()">
로그인 
회원가입
</sec:authorize>

<sec:authorize access="isAuthenticated()">
로그아웃
회원정보보기
</sec:authorize>

<sec:authorize access="hasRole('admin')">
관리자 페이지
</sec:authorize>

</body>
</html>