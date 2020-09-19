<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calendario</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="br.com.entity.Evento" %>
<c:set var="caminho" value="${pageContext.request.contextPath}"/>
<c:out value="${caminho}" />

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="materialize/css/materialize.min.css"  media="screen,projection"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
 
</head>
<body>

<h1 class="card-panel teal lighten-3" style="text-align: center; margin-top: 0px"><b>Calendario de Eventos</b></h1> 


<div class="col s12 s6"> 
	<form class="container" method="post" action="gravar">		
		<b>Nome:</b> <input class=""type="text" value="" name="nome"/><br/>
		<div class="row">
		<div class="input-field col s6">
		<b>Descrição: </b><input type="text" value="" name="descricao"/>
		 </div>
		 <div class="input-field col s3">
		<b>Data: </b><input type="date" value="" name="data"/>
		 </div>
		 <div class="input-field col s3">
		<b>Horario: </b><input type="text" value="" name="horario"/><br/>
			</div>
			</div>
		<button type="submit" class="waves-effect waves-light btn" style="left: 875px;">Salvar</button>
		
	</form> 


</div>

<div class="">
<form>
	<table class="highlight text-center" style="margin-bottom: 30px;">
	<thead>
		<tr>
		<th>Nome</th>
		<th>Data</th>
		<th>Horário</th>
		<th>Descrição</th>
		<th>Excluir</th>
		
		</tr>
		
		<tbody>
		<c:forEach items="${lista}" var="linha">
		  <tr>
		  <td>${linha.nome}</td>
		  <td>${linha.data}</td>
		  <td>${linha.horario}</td>
		  <td>${linha.descricao}</td>
		  <td><a class="text-danger btn-small btn-floating pulse" style="text-align: center;" href="${caminho}/excluir/${linha.cod}">X</a></td>
		  </tr>		
		</c:forEach>		
		</tbody>
		
	</thead>
	</table>
</form>
</div>

</body>
</html>