<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
	<head>
		<title>サンプル画面１</title>
	</head>
	<body>
		<div>
			サンプル画面１<br>
			入力内容を次画面へ渡すテスト
		</div>
		<form:form modelAttribute="sampleForm" action="testAction" method="post">
			<div>
				例１：テキストボックス　
				<input type="text" name="text" value="文字列入力テスト">
			</div>
			<div>
				例２：ラジオボタン　
				<input type="radio" name="radio" value="選択肢１" checked="checked">選択肢１
				<input type="radio" name="radio" value="選択肢２" >選択肢２
			</div>
			<input type="submit">
		</form:form>
		
	</body>
</html>