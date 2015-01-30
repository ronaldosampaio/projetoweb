package br.com.agendacontatos.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendacontatos.model.bean.ContatosBean;
import br.com.agendacontatos.model.dao.ContatosDao;


//@WebServlet("/ListaContatos")
public class ListaContatos extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
    public ListaContatos() {
        super();
    }

	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {

			ContatosDao cd = new ContatosDao();
			List<ContatosBean>lista=cd.listarContatos();
			System.out.println("Lista Servlet: "+lista);
		    request.setAttribute("lista", lista);
		    System.out.println(lista);
		    
		    RequestDispatcher saida = request.getRequestDispatcher("listarcontatos.jsp");
			saida.forward(request, response);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    try {
			execute(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	    try {
			execute(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
