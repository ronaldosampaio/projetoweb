package br.com.agendacontatos.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.agendacontatos.conexao.Conexao;
import br.com.agendacontatos.model.bean.ContatosBean;

public class ContatosDao implements InterfaceContatosDao
{
	Connection conn = null;
	
	public ContatosDao()
	{
		conn = Conexao.Conecta();
	}
	
	@Override
	public List<ContatosBean>listarContatos() throws SQLException 
	{
		List<ContatosBean>lista = new ArrayList<ContatosBean>();//aqui mostra todos da lista
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		pstm = conn.prepareStatement("select * from contatosweb where id_usuario=1");
		rs = pstm.executeQuery();
		
		while(rs.next())
		{
			
			ContatosBean cb = new ContatosBean();
			cb.setId(rs.getInt(1));
			cb.setNome(rs.getString(2));
			cb.setGrupo(rs.getString(3));
			cb.setTelTipoFixo(rs.getString(4));
			cb.setTelFixo(rs.getString(5));
			cb.setCelTipOperadora1(rs.getString(6));
			cb.setCelular1(rs.getString(7));
			cb.setCelTipOperadora2(rs.getString(8));
			cb.setCelular2(rs.getString(9));
			cb.setDataCadastro(rs.getDate(10));
			lista.add(cb);
		}
		pstm.close();
		rs.close();
		conn.close();
		return lista;
	}
	
	@Override
	public List<ContatosBean> listarPesquisa(String pesquisa)
	{
		List<ContatosBean>lista = new ArrayList<ContatosBean>();//aqui mostra todos da lista
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try
		{
			pstm = conn.prepareStatement("select * from contatosweb where nome like'" +pesquisa+"%'");
			//pstm.setInt(1, id);
			rs = pstm.executeQuery();
			
			while(rs.next())
			{
				//lista = new ArrayList<ContatosBean>();//aqui mostra apenas um da lista
				ContatosBean cb = new ContatosBean();
				cb.setId(rs.getInt("Id"));
				cb.setNome(rs.getString("Nome"));
				cb.setGrupo(rs.getString("Grupo"));
				cb.setTelTipoFixo(rs.getString("Tipo_Fixo"));
				cb.setTelFixo(rs.getString("Telefone_Fixo"));
				cb.setCelTipOperadora1(rs.getString("Operadora1"));
				cb.setCelular1(rs.getString("Celular1"));
				cb.setCelTipOperadora2(rs.getString("Operadora2"));
				cb.setCelular2(rs.getString("Celular2"));
				cb.setDataCadastro(rs.getDate("Data_Cadastro"));
				lista.add(cb);
				//for(ContatosBean list:lista)//for aprimorado server para listar 1 ou mais campos de uma lista
				//{
					//System.out.println(list.getDataCadastro());
				//}
				//System.out.println(lista);
			}
		}
		catch(SQLException erro)
		{
			System.out.println("Erro ao listar contatos " +erro.getMessage());
		}
		return lista;
	}
	
	@Override
	public ContatosBean mostrarContatos(ContatosBean cb) 
	{
		conn = Conexao.Conecta();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try
		{
			pstm = conn.prepareStatement("select * from contatosweb");
			rs = pstm.executeQuery();
			
			while(rs.next())
			{
				cb.setId(rs.getInt("Id"));
				cb.setNome(rs.getString("Nome"));
				cb.setGrupo(rs.getString("Grupo"));
				cb.setTelTipoFixo(rs.getString("Tipo_Fixo"));
				cb.setTelFixo(rs.getString("Telefone_fixo"));
				cb.setCelTipOperadora1(rs.getString("Operadora1"));
				cb.setCelular1(rs.getString("Celular1"));
				cb.setCelTipOperadora2(rs.getString("Operadora2"));
				cb.setCelular2(rs.getString("Celular2"));
				cb.setDataCadastro(rs.getDate("Data_Cadastro"));
				System.out.println(cb);
			}
			pstm.close();
			rs.close();
			conn.close();
		}
		catch(SQLException erro)
		{
			System.out.println("Erro ao mostrar dados "+erro.getMessage());
		}
	
		return cb;
	}
	
	@Override
	public void salvar(ContatosBean cb)
	{
		PreparedStatement pstm = null;
		try
		{
			pstm = conn.prepareStatement("insert into contatosweb values(?,?,?,?,?,?,?,?,?,?)");
			pstm.setString(1, cb.getNome());
			pstm.setObject(2, cb.getGrupo());
			pstm.setObject(3, cb.getTelTipoFixo());
			pstm.setObject(4, cb.getTelFixo());
			pstm.setObject(5, cb.getCelTipOperadora1());
			pstm.setObject(6, cb.getCelular1());
			pstm.setObject(7, cb.getCelTipOperadora2());
			pstm.setObject(8, cb.getCelular2());
	        Date data = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			pstm.setString(9, sdf.format(data));
			pstm.setInt(10, cb.getIdUsuario());
			pstm.executeUpdate();
			System.out.println("Cadastrado com sucesso!!!\n");
			pstm.close();
			//conn.close();
		 }
	    catch(SQLException erro)
	    {
	    	System.out.println("Erro ao salvar contato "+ erro.getMessage());
	    }	
	}
	
	@Override
	public void salvar2(String Nome, String  Grupo, String Tipo_Fixo, String Telefone_fixo, 
			String Operadora1, String Celular1, String Operadora2, String Celular2) 	
	{
		PreparedStatement pstm = null;
		try
		{
			
			pstm = conn.prepareStatement("insert into contatosweb values(?,?,?,?,?,?,?,?,?)");
			//pstm.setInt(1, Integer.parseInt("Id"));
			pstm.setString(1, Nome);
			pstm.setString(2, Grupo);
			pstm.setString(3, Tipo_Fixo);
			pstm.setString(4, Telefone_fixo);
			pstm.setString(5, Operadora1);
			pstm.setString(6, Celular1);
			pstm.setString(7, Operadora2);
			pstm.setString(8, Celular2);
			Date dataAtual = new Date();
			SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("yyyy-MM-dd");//formato que o Banco sql server va receber
			pstm.setString(9, formatoBrasileiro.format(dataAtual));
			
			pstm.executeUpdate();
			System.out.println("Gravado com sucesso!!!");
		    pstm.close();
			conn.close();
		}
		catch(SQLException erro)
		{
			System.out.println("Erro no cadastramento da base de dados! "+erro.getMessage());
		}
	}
	
	@Override
	public void atualizar(ContatosBean cb)
	{
		try
		{
			PreparedStatement pstm = null;
			pstm = conn.prepareStatement("update contatosweb set Nome=?,Grupo=?,Tipo_Fixo=?,Telefone_fixo=?,Operadora1=?,Celular1=?,Operadora2=?,Celular2=?,Data_Cadastro=? where Id = ?");
			pstm.setObject(1, cb.getNome());
			pstm.setObject(2, cb.getGrupo());
			pstm.setObject(3, cb.getTelTipoFixo());
			pstm.setObject(4, cb.getTelFixo());
			pstm.setObject(5, cb.getCelTipOperadora1());
			pstm.setObject(6, cb.getCelular1());
			pstm.setObject(7, cb.getCelTipOperadora2());
			pstm.setObject(8, cb.getCelular2());
	        Date data = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			pstm.setString(9, sdf.format(data));
			pstm.setInt(10,cb.getId());
			pstm.executeUpdate();
			System.out.println("Alterado com sucesso!!!\n");
			pstm.close();
			conn.close();
		}
		catch(SQLException erro)
		{
			System.out.println("Erro na atualização: " +erro.getMessage());
		}
	}
	
	@Override
	public void atualizar2(String nome, String  grupo, String tipoFixo, String telefoneFixo, 
			String operadora1, String celular1, String operadora2, String celular2,String data,int id)
	{
		try
		{
			PreparedStatement pstm = null;
			pstm = conn.prepareStatement("update contatosweb set Nome=?,Grupo=?,Tipo_Fixo=?,Telefone_fixo=?,Operadora1=?,Celular1=?,Operadora2=?,Celular2=?,Data_Cadastro=? where Id = ?");
			pstm.setString(1, nome);
			pstm.setString(2, grupo);
			pstm.setString(3, tipoFixo);
			pstm.setString(4, telefoneFixo);
			pstm.setString(5, operadora1);
			pstm.setString(6, celular1);
			pstm.setString(7, operadora2);
			pstm.setString(8, celular2);
			
			Date dat = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			pstm.setString(9, sdf.format(dat));
			pstm.setInt(10,id);
			pstm.executeUpdate();
			System.out.println("Alterado com sucesso!!!\n");
			pstm.close();
			conn.close();
		}
		catch(SQLException erro)
		{
			System.out.println("Erro na atualização: " +erro.getMessage());
		}
	}
	@Override
	public void excluir(int id)
	{
	    try
	    {
	    	PreparedStatement pstm = null;
	    	pstm = conn.prepareStatement("delete from contatosweb where Id = ?");
	    	pstm.setInt(1, id);
	    	pstm.executeUpdate();
	    	System.out.println("Id:" +id +" Excluido com sucesso!!!\n");
	    	pstm.close();
	    	conn.close();
	    }
	    catch(SQLException erro)
	    {
	    	System.out.println("Erro ao excluir "+ erro.getMessage());
	    }
		
	}
	
	public static void main(String[] args) throws ParseException, SQLException
	{
		///*
		List<ContatosBean> lista = new ArrayList<ContatosBean>();
		
		ContatosDao  cd = new ContatosDao();
		
		ContatosBean cb = new ContatosBean();
		
		cb.setNome("Saulo");
		cb.setGrupo("Amigo Igreja");
		cb.setTelTipoFixo("Residencial");
		cb.setTelFixo("(11)4509-8072");
		cb.setCelTipOperadora1("Nextel");
		cb.setCelular1("(11)94767-6995");
		cb.setCelTipOperadora2("Nextel");
		cb.setCelular2("(11)7747-4594");
		cb.setDataCadastro(null);
		cb.setIdUsuario(1);
		cd.salvar(cb);
		
		
		//lista = cd.listarPesquisa("r");
		lista = cd.listarContatos();
		//cd.salvar("Testando Data", "TesteGrupo", "TesteTipo_Fixo", "TesteTelefone_fixo", "TesteOperadora1","TesteCelular1", "TesteOperadora2", "TesteCelular2");
		//cd.excluir(63);
		//cd.atualizar2("Teste", "EU MESMO", "TESTE", "TESTE","TESTE", "TESTE","TESTE","TESTE"," ", 51);
		//cd.mostrarContatos(cb);
		
	
		
		//System.out.println(lista);
		
		for(ContatosBean listar:lista)
		{
			System.out.println("=========================================================================");
			System.out.println(listar.getNome()+" | "+listar.getTelTipoFixo()+" " +listar.getTelFixo() +"|");
			//System.out.println();
			
		}
		System.out.println("=========================================================================");
		
//*/	
	}
			
}
