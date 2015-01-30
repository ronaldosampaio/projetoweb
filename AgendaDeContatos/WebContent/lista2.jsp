<%--  
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="br.com.agendacontatos.model.dao.EstadoDao"%>
<%@page import="br.com.agendacontatos.model.bean.EstadoBean"%>
<%@page import="java.util.List, br.com.agendacontatos.controller.ContatosAction" %>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Cidades</title>
</head>
<body>
<form action="EstadoAction" method="post">
    <label>Cidades:</label>  
        <select>
       
            <% 
			
			    EstadoDao estDao = new EstadoDao();
				List<EstadoBean> lista = estDao.getLista();
				
				for(EstadoBean campo: lista)
				{
					out.println("<option value='"+campo.getDescricao()+"'>"+campo.getDescricao()+"</option>");
					System.out.println(campo);
					
				}
			
			%>
		</select>                          
</form>


</body>
</html>
--%>