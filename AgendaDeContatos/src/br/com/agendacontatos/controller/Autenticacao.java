package br.com.agendacontatos.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendacontatos.model.bean.AutenticacaoBean;
import br.com.agendacontatos.model.dao.AutenticacaoDao;
import br.com.agendacontatos.model.dao.ContatosDao;


@WebServlet("/Autenticacao")
public class Autenticacao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//request.setAttribute("lista",new ContatosDao().listarContatos());
		//request.setAttribute("titulo", "Lista de contatos");
		ContatosDao cd = new ContatosDao();
		AutenticacaoDao ad = new AutenticacaoDao();
		AutenticacaoBean ab = ad.mostrarUsuaios();
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		System.out.println("Digitado url: "+usuario +"|"+senha);
		System.out.println("retorno banco: "+ab.getUsuario()+"|"+ab.getSenha());
		
		
		if(usuario.equals(ab.getUsuario()) && senha.equals(ab.getSenha()))
		{
			RequestDispatcher saida = request.getRequestDispatcher("ListaContatos");
			request.setAttribute("msgm", ab.getUsuario());
			saida.forward(request, response);
		}
		else
		if(usuario != ab.getUsuario() || senha != ab.getSenha())
		{
			RequestDispatcher saida = request.getRequestDispatcher("login.jsp");
			request.setAttribute("msgm","Usuario ou senha inválido!");
			saida.forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request,response);
	}

}
