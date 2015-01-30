package br.com.agendacontatos.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.agendacontatos.conexao.Conexao;
import br.com.agendacontatos.model.bean.AutenticacaoBean;

public class AutenticacaoDao 
{
	
	public AutenticacaoBean mostrarUsuaios()
	{
		AutenticacaoBean ab = null;
		Conexao cnx = new Conexao();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try
		{
			conn = cnx.Conecta();
			pstm = conn.prepareStatement("select * from usuario");
			rs = pstm.executeQuery();
			ab = new AutenticacaoBean();
			while(rs.next())
			{
				
				ab.setId(rs.getInt("id"));
				ab.setUsuario(rs.getString("usuario"));
				ab.setSenha(rs.getString("senha"));
				System.out.println(ab);
			}
		}
		catch(SQLException erro)
		{
			System.out.println("Erro ao mostrar usuario! "+erro.getMessage());
		}
		return ab;
	}
	
	public void cadastrarUsuario(AutenticacaoBean ab )
	{
		//ab = new AutenticacaoBean();
		Conexao cnx = new Conexao();
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try
		{
			conn = cnx.Conecta();
			pstm = conn.prepareStatement("insert into usuario values(?,?)");
			
			pstm.setString(1, ab.getUsuario());
			pstm.setString(2, ab.getSenha());
			pstm.executeUpdate();
			System.out.println("Usuario cadastrado com sucesso!");
		}
		catch(SQLException erro)
		{
			System.out.println("Erro ao cadastrar usuario! "+erro.getMessage()+erro.getStackTrace());
		}
	}
	public static void main(String[] args)
	{
		AutenticacaoDao ad = new AutenticacaoDao();
		AutenticacaoBean ab = new AutenticacaoBean();
		
		//Cadastrar usuario
	
		//ab.setUsuario("teste");
		//ab.setSenha("teste");
		//ad.cadastrarUsuario(ab);
		
		
		
		
		//Mostrar usuarios
		ad.mostrarUsuaios();
		//System.out.println(ab.getId()+"|"+ab.getUsuario()+"|"+ab.getSenha());
		
		
	}

}