package br.com.fiap.coinbox.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.coinbox.dao.SaidaDAO;
import br.com.fiap.coinbox.model.Saida;

public class SaidaNovoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("saida/novo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long idSaida = Long.valueOf(request.getParameter("idSaida"));
		String nomeSaida = request.getParameter("nomeSaida");
		String idData = request.getParameter("idData");
		String valorSaida = request.getParameter("valorSaida");
		String descricaoSaida = request.getParameter("descricaoSaida");

		Saida saida = new Saida(idSaida, nomeSaida, idData, valorSaida, descricaoSaida);

		SaidaDAO.cadastrar(saida);

		List<Saida> listaSaidas = SaidaDAO.listar();

		request.setAttribute("saidas", listaSaidas);

		response.sendRedirect(request.getContextPath() + "/saida-listar");
	}
}
