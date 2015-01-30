/*
package br.com.agendacontatos.controller;

import java.sql.SQLException;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import br.com.agendacontatos.model.bean.ContatosBean;
import br.com.agendacontatos.model.dao.ContatosDao;

public class ContatosAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	//@("/EstadoAction");
	
	
	
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	//execute(request, response);
		System.out.println("Chamada metodo get");
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		System.out.println(usuario +"|"+senha);
		while(usuario==null && senha == null )  
		{
			RequestDispatcher saida = request.getRequestDispatcher("login.jsp");
		    saida.forward(request, response);
		    return;
		}
		if(usuario.equals("") && senha.equals(""))
		{
			RequestDispatcher saida = request.getRequestDispatcher("login.jsp");
			request.setAttribute("msgm","Campos não pode ficar brancos!");
		    saida.forward(request, response);
		   // response.sendRedirect("pagina.jsp");//redireciona a pagina
		}
		
		
		if(usuario.equals("admin") && senha.equals("1234"))
		{
			request.setAttribute("lista",new ContatosDao().getLista());
			request.setAttribute("titulo", "Lista de contatos");
			RequestDispatcher saida = request.getRequestDispatcher("lista3.jsp");
			saida.forward(request, response);	
		    
		}
		
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		System.out.println("Chamada metodo post");
		ContatosDao estDao = new ContatosDao();
		List<ContatosBean> lista = estDao.getLista();
		request.setAttribute("lista", lista);
		System.out.println(lista);
		
		RequestDispatcher saida = request.getRequestDispatcher("lista.jsp");
		saida.forward(request, response);
		
		
	}
	public String execute(HttpServletRequest request, HttpServletResponse response)
	{
		ContatosDao estDao = new ContatosDao();
		
		System.out.println("Metodo execute");
		request.setAttribute("titulo","- Lista de Estados Cadastrados -");
		request.setAttribute("lista",estDao.getLista());
		
		//List<EstadoBean> lista = estDao.getLista();
		//request.setAttribute("lista", lista);
		
		//System.out.println(lista);
		//RequestDispatcher saida = request.getRequestDispatcher("lista3.jsp");
		//saida.forward(request, response);
		return "lista3.jsp";
	}
	
}
*/