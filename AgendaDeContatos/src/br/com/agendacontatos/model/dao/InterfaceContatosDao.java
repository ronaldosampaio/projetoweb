package br.com.agendacontatos.model.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import br.com.agendacontatos.model.bean.ContatosBean;

public interface InterfaceContatosDao
{
	public abstract List<ContatosBean> listarContatos()throws SQLException;//ok
	
	public abstract List<ContatosBean> listarPesquisa(String pesquisa)throws SQLException;
	
	public abstract ContatosBean mostrarContatos(ContatosBean cb) throws SQLException;//ok
	
	public abstract void atualizar(ContatosBean cb)throws SQLException;
	
	public abstract void atualizar2(String nome, String  grupo, String tipoFixo, String telefoneFixo,String operadora1, String celular1, String operadora2, String celular2,String data,int id)throws SQLException;
	
	public abstract void excluir(int id)throws SQLException;//ok
	
	public abstract void salvar(ContatosBean cb)throws SQLException;//ok
	
	public abstract void salvar2(String Nome, String Grupo, String Tipo_Fixo,String Telefone_fixo, String Operadora1, String Celular1,String Operadora2, String Celular2) throws ParseException;
}
