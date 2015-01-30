package br.com.agendacontatos.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao 
{
   
	//String driver = "net.sourceforge.jtds.jdbc.Driver";
	//String url = "jdbc:jtds:sqlserver://java:1433/AgendaWeb";
	//String usuario = "sa";
	//String senha = "levita";
	
	
	public static Connection Conecta()
	{
		Connection conn = null;
		try
		{
		    Class.forName("net.sourceforge.jtds.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:jtds:sqlserver://java:1433/AgendaWeb","sa","levita");
		    System.out.println("Conectado com sucesso!");
		}
		catch(ClassNotFoundException erro)
		{
			System.out.println("Classe do Driver inválido! "+erro.getMessage());
			//erro.printStackTrace();
		}
		catch(SQLException erro)
		{
			System.out.println("Dados inválido com a base de dados! "+erro.getMessage());
			erro.printStackTrace();
		}
		return conn;
	}
}
