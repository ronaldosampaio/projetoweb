package br.com.agendacontatos.model.bean;

public class AutenticacaoBean
{
	private int id;
	private String usuario;
	private String senha;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getUsuario()
	{
		return usuario;
	}
    public void setUsuario(String usuario)
    {
    	this.usuario = usuario;
    }
    public String getSenha()
    {
    	return senha;
    }
    public void setSenha(String senha)
    {
    	this.senha = senha;
    }
	@Override
	public String toString() {
		return "AutenticacaoBean [id=" + id + ", usuario=" + usuario
				+ ", senha=" + senha + "]";
	}
    
}
