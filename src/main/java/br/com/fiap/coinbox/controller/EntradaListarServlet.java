package br.com.fiap.coinbox.controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.coinbox.dao.EntradaDAO;
import br.com.fiap.coinbox.model.Entrada;

@WebServlet("/entrada-listar")

public class EntradaListarServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Entrada> listaEntradas = EntradaDAO.listar();

		request.setAttribute("Entradas", listaEntradas);

		request.getRequestDispatcher("/coinbox/index.jsp").forward(request, response);
	}

}
