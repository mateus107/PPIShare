<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Adicionar Contato</h1>

<c:import url="../menu.jsp"></c:import>
<form action="/agendaspring/contatos" method="post" >
<h2> ID: <input type="text" name="id"> </h2> 
<h2> Nome: <input type="text" name="nome"> </h2> 
<h2> Email: <input type="text" name="email"> </h2> 
<h2> Endere�o: <input type="text" name="endereco"> </h2> 
<h2> Data Nascimento: <input type="text" name="dataNascimento"> </h2> 
<button type="submit">Adicionar </button>

</form>
</body>
</html>