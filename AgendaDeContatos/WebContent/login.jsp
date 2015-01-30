<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Autenticação</title>
</head>
<body style="background-color:#eee">
<div align="center">

<form action="Autenticacao" method="post" style=" width:400px; border-color:navy; color: black; font-size: 13px; font-family:Arial" >
     
<table border="10" cellpadding="6">
    
        <tr>
            <td colspan="2" align="center"><img src="img/acesso.png">
            
        </td></tr>
        
        <tr>
            <td style="text-align:center" ><label>Usuário.:</label></td>
            <td style="text-align:center"> <input type="text" name="usuario" style="width: 182px; "></td>
        </tr>
        <tr>
            <td style="text-align:center"><label>Senha.:</label></td>
            <td style="text-align:center"><input type="password" name="senha" style="width: 182px; "></td>   
        </tr>
       
       <tr>
            <td colspan="2" style="text-align:center">
            <input type="submit" name="entrar" value="Entrar" style="width: 190px; height: 48px"></td>  
        </tr>    
    </table>
    <h3 style="color: red;">${msgm}</h3>
</form>
</div>
</body>
</html>