<%@page import="br.com.agendacontatos.controller.ListaContatos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="br.com.agendacontatos.model.bean.ContatosBean" %>
    <%@page import="java.util.List" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Contatos</title>

</head>
<body>
 <h5 align="justify">Seja bem vindo ${msgm} ! <a href=" login.jsp"> Sair</a></h5>
<table border="3" align="center" >

    <tr>
        <td><a href="PesquisarContatos?pesquisa=">Pesquisar Nome --> </a></td>
        <td><a href="PesquisarContatos?pesquisa=a">A</a></td>
   
        <td><a href="PesquisarContatos?pesquisa=b">B</a></td>
   
        <td><a href="PesquisarContatos?pesquisa=c">C</a></td>
   
        <td><a href="PesquisarContatos?pesquisa=d">D</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=e">E</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=f">F</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=g">G</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=h">H</a></td>
   
        <td><a href="PesquisarContatos?pesquisa=i">I</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=j">J</a></td>
   
        <td><a href="PesquisarContatos?pesquisa=k">K</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=l">L</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=m">M</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=n">N</a></td>
   
        <td><a href="PesquisarContatos?pesquisa=o">O</a></td>
   
        <td><a href="PesquisarContatos?pesquisa=p">P</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=q">Q</a></td>
   
        <td><a href="PesquisarContatos?pesquisa=r">R</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=s">S</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=t">T</a></td>
   
        <td><a href="PesquisarContatos?pesquisa=u">U</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=v">V</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=w">W</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=x">X</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=y">Y</a></td>
    
        <td><a href="PesquisarContatos?pesquisa=z">Z</a></td>
        
        <td><a href=" login.jsp"> Sair</a></td>
    </tr>
</table>
<br>

<table border = "1" align="center">
    <tr>
         <th colspan="12" style="font-size: xx-large;">Lista de Contatos</th>
    </tr>
    <tr>
        <th>Id</th>
	    <th>Nome</th> 
	    <th>Grupo</th>
	    <th>Tipo Tel.</th> 
	    <th>Telefone Fixo</th>
	    <th>Oper.1</th>  
	    <th>Celular 1</th>
	    <th>Oper.2</th>
	    <th>Celular2</th>
	    <th>Data Cad.</th> 
	    <th colspan="2">Editar</th>
	  
     </tr>
     
     <c:forEach items="${requestScope.lista }" var="listar">
         <tr>
             <td>${listar.id }</td>
	         <td>${listar.nome}</td>
	         <td>${listar.grupo}</td>
	         <td>${listar.telTipoFixo}</td>
	         <td>${listar.telFixo}</td>
	         <td>${listar.celTipOperadora1}</td>
	         <td>${listar.celular1}</td>
	         <td>${listar.celTipOperadora2}</td>
	         <td>${listar.celular2}</td>
	         <td>${listar.dataCadastro}</td> 
	         <td><a href ="alterarcontato.jsp">alterar</a></td>
	         <td><a href ="">deletar</a></td>
         </tr>
     </c:forEach>
</table>
</body>
</html>