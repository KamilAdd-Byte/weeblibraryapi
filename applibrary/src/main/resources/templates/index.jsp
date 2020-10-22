<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:th="http://www.thymeleaf.org">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Library Viewer</title>
</head>

<body>
	<h1>Biblioteka viewer</h1>

		<form th:action="BookServlet" method="post">

		<input placeholder="ISBN" type="text" name="isbn">
	<br>
	<input placeholder="Tytuł" type="text" name="title">
	<br>
	<input placeholder="Opis" type="text" name="description">
	<br>
		Szukaj: <input type="radio" name="option" value="search"><br>
		Dodaj: <input type="radio" name="option" value="add"><br>
		Modyfikuj: <input type="radio" name="option" value="update"><br>
		Usuń: <input type="radio" name="option" value="delete"><br>
	<br>
	<input type="submit" value="Wyślij">
	</form>

</body>
</html>