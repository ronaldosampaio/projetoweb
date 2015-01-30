<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="br.com.agendacontatos.model.bean.ContatosBean" %>
    <%@page import="java.util.List" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Estados</title>
</head>
<body>
    <h3 align="center">${titulo}</h3>
    <table border="5" align="center">
        <tr bgcolor="">
            <th>Cod</th>
		    <th>Descrição</th>
		    <th colspan="2">Editar</th>
		    </tr>
	 
		<c:forEach var="lista" items="${requestScope.lista }">
			 <tr>      
					    <td>${lista.codigo }</td>
					    <td>${lista.descricao}</td>
					    <td><a href="excluir">Excluir</a></td>
					    <td><a href="Alterar">Alterar</a></td>
			  </tr>      		
		     
        </c:forEach>
	  
	</table> 	

</body>
</html>