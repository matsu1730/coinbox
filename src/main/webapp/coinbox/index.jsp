<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coinbox</title>
</head>
<body>
	
	<a href="entrada-novo.jsp">+ Entrada</a>
	<a href="nova-saida">+ Saída</a>
	
	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>Gasto</td>
				<td>data</td>
				<td>Valor</td>
				<td>Descrição</td>
			</tr>
		</thead>
		<tbody>		
			<c:forEach items="${entradas}" var="entrada">			
			<tr>
				<td>${entrada.id}</td>
				<td>${entrada.nome}</td>
				<td>${entrada.dataCompra}</td>
				<td>${entrada.valor}</td>
				<td>${entrada.descricao}</td>
				<td>
					<a href="animal-editar?id=${entrada.id}">Editar</a>
					<a href="animal-remover?id=${entrada.id}">Remover</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
</table>

</body>
</html>