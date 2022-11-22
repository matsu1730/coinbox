<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coinbox - Cadastrar Nova Entrada</title>
</head>
<body>
	
	<h1>Nova Entrada</h1>

	<form method="POST" action="nova-entrada">
		<label>ID:</label>
		<input name="idEntrada" type="text"></br>
		<label>Nome:</label>
		<input name="nomeEntrada" type="text"></br>
		<label>Data:</label>
		<input name="idData" type="text"></br>
		<label>Valor:</label>
		<input name="valorEntrada" type="text"></br>
		<label>Gasto:</label>
		<input name="descricaoEntrada" type="text"></br>
		<input type="submit" value="Cadastrar">
	
	</form>

</body>
</html>