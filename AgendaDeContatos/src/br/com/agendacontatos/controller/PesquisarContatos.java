package br.com.agendacontatos.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import br.com.agendacontatos.model.bean.AutenticacaoBean;
import br.com.agendacontatos.model.bean.ContatosBean;
import br.com.agendacontatos.model.dao.AutenticacaoDao;
import br.com.agendacontatos.model.dao.ContatosDao;


@WebServlet("/PesquisarContatos")
public class PesquisarContatos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AutenticacaoDao ad = new AutenticacaoDao();
		AutenticacaoBean ab = ad.mostrarUsuaios();
		ContatosDao cd = new ContatosDao();
		String pesquisa = request.getParameter("pesquisa");
		List<ContatosBean>lista = cd.listarPesquisa(pesquisa);
		//System.out.println("Dados pesquisados = "+pesquisa);
		request.setAttribute("lista", lista);
		request.setAttribute("msgm",ab.getUsuario());
		//System.out.println(lista);
		
		RequestDispatcher saida = request.getRequestDispatcher("listarcontatos.jsp");
		saida.forward(request, response);
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request,response);
	}

}
