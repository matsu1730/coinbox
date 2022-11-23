package br.com.fiap.coinbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.coinbox.dao.SaidaDAO;
import br.com.fiap.coinbox.model.Saida;

@WebServlet("/saida-editar")
public class SaidaEditarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long idSaida = Long.valueOf(request.getParameter("id"));

		Saida saida = SaidaDAO.buscar(idSaida);

		request.setAttribute("saida", saida);

		request.getRequestDispatcher("/coinbox/saida-editar.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long idSaida = Long.valueOf(request.getParameter("idSaida"));
		String nomeSaida = request.getParameter("nomeSaida");
		String idData = request.getParameter("idData");
		String valorSaida = request.getParameter("valorSaida");
		String descricaoSaida = request.getParameter("descricaoSaida");

		Saida saida = new Saida(idSaida, nomeSaida, idData, valorSaida, descricaoSaida);

		SaidaDAO.editar(saida);

		response.sendRedirect(request.getContextPath() + "/saida-listar");
	}
	
}
