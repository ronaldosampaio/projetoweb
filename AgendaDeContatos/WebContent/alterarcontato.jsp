<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Contatos</title>
</head>
<body>
    
    <div>
    
        <form action="get" >
        <table border="8"  align="center">
        
        <tr>
            <th colspan="2" style="font-size: xx-large;">Alterar Contato</th>
        </tr>
        
        <tr>
          
            <td><label>Id:</label></td>
            <td><input type="text" name="id" maxlength="5" size="3"></td>
        </tr>
        
        <tr>
            <td><label>Nome:</label></td>
            <td><input type="text" name="nome" maxlength="95" size="50"></td>
         </tr>
         
         <tr>
           <td><label>Grupo:</label></td>
           <td><input type="text" name="grupo" maxlength="50" size="50"></td>
         </tr>
         
         <tr>
           <td><label>Tipo Telefone:</label></td>
           <td>
               <select>
                    <option value="Residencial">Comercial</option> 
                    <option value="Comercial">Residencial</option>
                    <option value="zerooitocentos">0800</option>
                </select>
           
               <label>Telefone Fixo:</label>
               <input type="text" name="telfixo" maxlength="20" size="18">
          
         </tr>
         
         <tr>   
           <td><label>Operadora 1:</label></td>
           <td>
               <select> 
                   <option value="Claro">Claro</option>
                   <option value="Nextel">Nextel</option>
                   <option value="Oi">Oi</option>
                   <option value="Tim">Tim</option>
                   <option value="Vivo">Vivo</option>
               </select>
           
               <label>Celular 1:</label>
               <input type="text" name="celular1" maxlength="15" size="15">
           </td>
         </tr>
         
         <tr> 
         <td><label>Operadora 2:</label></td>  
            <td>
               <select> 
                   <option value="Claro">Claro</option>
                   <option value="Nextel">Nextel</option>
                   <option value="Oi">Oi</option>
                   <option value="Tim">Tim</option>
                   <option value="Vivo">Vivo</option>
               </select>
           
               <label>Celular 2:</label>
               <input type="text" name="celular1" maxlength="15" size="15">
           </td>
         </tr>
         
         <tr>
              <td colspan="2"></td>
         </tr>
            
         
         <tr>
             <td colspan="2" align="center">
                 <input type="button" value="Retornar" name="retorna"/>
                 <input type="submit" value="Alterar" name="alterar"/>
             
             </td>
             
         </tr>
         
        </table>
        </form>
     </div>
</body>
</html>