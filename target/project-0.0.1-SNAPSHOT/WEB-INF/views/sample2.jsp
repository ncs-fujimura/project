<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>サンプル画面２</title>
</head>
<body>
	サンプル画面２<br>
	サンプル画面１で入力・選択した内容が表示されます。<br>
	<div>前画面でテキストボックスに入力された値：<c:out value="${sampleForm.text}" /></div>
	<div>前画面でラジオボタンで選択された値：<c:out value="${sampleForm.radio}" /></div>
	<form action="sample2" method="post">
		<input type="submit" name="connectDB" value="次の画面へ（DB接続サンプル）">
		<input type="submit" name="return" value="戻る">
	</form>
</body>
</html>