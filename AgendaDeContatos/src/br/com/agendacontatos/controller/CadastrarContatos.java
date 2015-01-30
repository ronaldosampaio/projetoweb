package br.com.agendacontatos.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendacontatos.model.bean.ContatosBean;
import br.com.agendacontatos.model.dao.ContatosDao;

/**
 * Servlet implementation class CadastrarContatos
 */
@WebServlet("/CadastrarContatos")
public class CadastrarContatos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContatosDao cd = new ContatosDao();
		ContatosBean cb = new ContatosBean();
		
		String nome = request.getParameter("nome");
		String grupo = request.getParameter("grupo");
		String telTipoFixo = request.getParameter("tipofone");
		String telFixo = request.getParameter("telfixo");
		String celTipOperadora1 = request.getParameter("operadora1");
		String celular1 = request.getParameter("celular1");
		String celTipOperadora2 = request.getParameter("operadora2");
		String celular2 = request.getParameter("celular2");
		String idUsuario = request.getParameter("id");
		
		cb.setNome(nome);
		cb.setGrupo(grupo);
		cb.setTelTipoFixo(telTipoFixo);
		cb.setTelFixo(telFixo);
		cb.setCelTipOperadora1(celTipOperadora1);
		cb.setCelular1(celular1);
		cb.setCelTipOperadora2(celTipOperadora2);
		cb.setCelular2(celular2);
		System.out.println(cb);
		cd.salvar(cb);
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request,response);
	}

}
