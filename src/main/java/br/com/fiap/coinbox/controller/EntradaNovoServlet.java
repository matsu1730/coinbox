package br.com.fiap.coinbox.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.coinbox.dao.EntradaDAO;
import br.com.fiap.coinbox.model.Entrada;

@WebServlet("/nova-entrada")
public class EntradaNovoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("coinbox/nova-entrada.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Long idEntrada = Long.valueOf(request.getParameter("idEntrada"));
		String nomeEntrada = request.getParameter("nomeEntrada");
		String idData = request.getParameter("idData");
		String valorEntrada = request.getParameter("valorEntrada");
		String descricaoEntrada = request.getParameter("descricaoEntrada");

		Entrada entrada = new Entrada(idEntrada, nomeEntrada, idData, valorEntrada, descricaoEntrada);

		EntradaDAO.cadastrar(entrada);

		List<Entrada> listaEntradas = EntradaDAO.listar();

		request.setAttribute("entradas", listaEntradas);

		response.sendRedirect(request.getContextPath() + "/entrada-listar");
	}
}
