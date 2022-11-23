package br.com.fiap.coinbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.coinbox.dao.EntradaDAO;

@WebServlet("/entrada-remover")
public class EntradaRemoverServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idEntrada = Long.valueOf(request.getParameter("id"));
		
		EntradaDAO.remover(idEntrada);
		
		response.sendRedirect(request.getContextPath() + "/entrada-listar");
	}
}
