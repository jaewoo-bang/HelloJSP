<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Sidebar-->
<div class="border-end bg-white" id="sidebar-wrapper">
	<div class="sidebar-heading border-bottom bg-light">${empty logId ? 'Guest' : logId }</div>
	<div class="list-group list-group-flush">
		
			<a class="list-group-item list-group-item-action list-group-item-light p-3" href="boardList.do">게시글목록</a>
		<c:choose>
			<c:when test="${empty logId }">
				<a class="list-group-item list-group-item-action list-group-item-light p-3" href="signForm.do">회원가입</a>
				<a class="list-group-item list-group-item-action list-group-item-light p-3" href="loginForm.do">로그인</a>
				</c:when>
			<c:otherwise>
				<a class="list-group-item list-group-item-action list-group-item-light p-3" href="register.do">글쓰기</a>
				<a class="list-group-item list-group-item-action list-group-item-light p-3" href="loginout.do">로그아웃</a>
			</c:otherwise>
		</c:choose>
			<a class="list-group-item list-group-item-action list-group-item-light p-3" href="#!">Status</a>
	</div>
</div>