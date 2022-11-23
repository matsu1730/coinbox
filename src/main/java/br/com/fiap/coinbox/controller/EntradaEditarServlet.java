package br.com.fiap.coinbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.coinbox.dao.EntradaDAO;
import br.com.fiap.coinbox.model.Entrada;

@WebServlet("/entrada-editar")
public class EntradaEditarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		long idEntrada = Long.valueOf(request.getParameter("id"));

		Entrada entrada = EntradaDAO.buscar(idEntrada);

		request.setAttribute("entrada", entrada);

		request.getRequestDispatcher("/coinbox/entrada-editar.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long idEntrada = Long.valueOf(request.getParameter("idEntrada"));
		String nomeEntrada = request.getParameter("nomeEntrada");
		String idData = request.getParameter("idData");
		String valorEntrada = request.getParameter("valorEntrada");
		String descricaoEntrada = request.getParameter("descricaoEntrada");

		Entrada entrada = new Entrada(idEntrada, nomeEntrada, idData, valorEntrada, descricaoEntrada);

		EntradaDAO.editar(entrada);

		response.sendRedirect(request.getContextPath() + "/animal-listar");
	}
}
