package br.com.fiap.coinbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.coinbox.dao.SaidaDAO;

@WebServlet("/saida-remover")
public class SaidaRemoverServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idSaida = Long.valueOf(request.getParameter("id"));
		
		SaidaDAO.remover(idSaida);
		
		response.sendRedirect(request.getContextPath() + "/saida-listar");
	}
}
