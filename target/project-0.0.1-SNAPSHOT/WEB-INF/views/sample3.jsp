<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<script src="${pageContext.request.contextPath}/js/sample3.js"></script>
<meta charset="UTF-8">
<title>サンプル画面３</title>
</head>
<body>
	<c:forEach var="message" items="${messageList}" varStatus="index">
		<c:out value="${message}" /><br>
	</c:forEach>
	サンプル画面３
	<br> DBからの取得結果を表示します。
	<br>
	<form:form modelAttribute="sample3Form" action="sample2" method="post" >
		<div>
			新規登録<br> 
			ID <input type="text" name="id">　Value <input type="text" name="value">　
			<input type="submit" name="insert" value="登録">
		</div>
		<div>
			<c:if test="${sample2Dto.sampleList.size() != 0}">ID　Value</c:if>
			<c:if test="${sample2Dto.sampleList.size() == 0}">検索結果が見つかりませんでした</c:if>
		</div>
		<input type="hidden" id="selectedId" name="selectedId">
		<c:forEach var="sample" items="${sample2Dto.sampleList}"
			varStatus="index">
			<c:out value="${sample.id}　${sample.value}" />		
			<input type="submit" name="delete" value="削除" onclick="return sampleFunction(${sample.id})"><br>
		</c:forEach>
	</form:form>
</body>
</html>