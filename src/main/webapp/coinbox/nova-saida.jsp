<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coinbox - Cadastrar Nova Saída</title>
</head>
<body>
	
	<h1>Nova Saída</h1>

	<form method="POST" action="entrada-novo">
		<label>ID:</label>
		<input name="idSaida" type="text"></br>
		<label>Nome:</label>
		<input name="nomeSaida" type="text"></br>
		<label>Data:</label>
		<input name="idData" type="text"></br>
		<label>Valor:</label>
		<input name="valorSaida" type="text"></br>
		<label>Gasto:</label>
		<input name="descricaoSaida" type="text"></br>
		<input type="submit" value="CadastrarSaida">
	
	</form>

</body>
</html>