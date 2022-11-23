package br.com.fiap.coinbox.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.coinbox.dao.SaidaDAO;
import br.com.fiap.coinbox.model.Saida;

@WebServlet("/saida-listar")
public class SaidaListarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Saida> listaSaidas = SaidaDAO.listar();

		request.setAttribute("Saidas", listaSaidas);

		request.getRequestDispatcher("/coinbox/index.jsp").forward(request, response);
	}
	
}
