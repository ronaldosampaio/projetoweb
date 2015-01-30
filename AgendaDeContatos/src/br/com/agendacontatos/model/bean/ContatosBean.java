package br.com.agendacontatos.model.bean;

import java.util.Date;

public class ContatosBean 
{
	private int id;
	private String nome;
	private String grupo;
	private String telTipoFixo;
	private String telFixo;
	private String celTipOperadora1;
	private String celular1;
	private String celTipOperadora2;
	private String celular2;
	private Date dataCadastro;
	private int idUsuario;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getGrupo()
	{
		return grupo;
	}
	public void setGrupo(String grupo)
	{
		this.grupo = grupo;
	}
	public String getTelTipoFixo()
	{
		return telTipoFixo;
	}
	public void setTelTipoFixo(String telTipoFixo)
	{
		this.telTipoFixo = telTipoFixo;
	}
	public String getTelFixo()
	{
		return telFixo;
	}
	public void setTelFixo(String telFixo)
	{
		this.telFixo = telFixo;
	}
	public String getCelTipOperadora1()
	{
		return celTipOperadora1;
	}
	public void setCelTipOperadora1(String celTipOperadora1)
	{
		this.celTipOperadora1 = celTipOperadora1;
	}
	public String getCelular1()
	{
		return celular1;
	}
	public void setCelular1(String celular1)
	{
		this.celular1 = celular1;
	}
	public String getCelTipOperadora2()
	{
		return celTipOperadora2;
	}
	public void setCelTipOperadora2(String celTipOperadora2)
	{
		this.celTipOperadora2 = celTipOperadora2;
	}
	public String getCelular2()
	{
		return celular2;
	}
	public void setCelular2(String celular2)
	{
		this.celular2 = celular2;
	}
    public Date getDataCadastro()
    {
    	return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro)
    {
    	this.dataCadastro = dataCadastro;
    }
    public int getIdUsuario()
    {
    	return idUsuario;
    }
    public void setIdUsuario(int idUsuario)
    {
    	this.idUsuario = idUsuario;
    }
    
    
	@Override
	public String toString() 
	{
		return "ContatosBean [id=" + id + ", nome=" + nome + ", grupo=" + grupo
				+ ", telTipoFixo=" + telTipoFixo + ", telFixo=" + telFixo
				+ ", celTipOperadora1=" + celTipOperadora1 + ", celular1="
				+ celular1 + ", celTipOperadora2=" + celTipOperadora2
				+ ", celular2=" + celular2 + ", dataCadastro=" + dataCadastro
				+",idUsuario="+idUsuario+ "]";
	}
	
    
}
