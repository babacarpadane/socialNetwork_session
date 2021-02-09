package it.objectmethod.socialnetwork.session;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Reimposta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		ArrayList<Account> tuttiProfili = (ArrayList<Account>) session.getAttribute("tuttiprofili");

		Account e = new Account();
		Utente eu = new Utente();

		e.setUsername(request.getParameter("username"));
		e.setPassword(request.getParameter("password"));
		eu.setNome(request.getParameter("name"));
		eu.setCognome(request.getParameter("surname"));
		eu.setSoprannome(request.getParameter("nickname"));
		eu.setEmail(request.getParameter("e-mail"));

		for (int i = 0; i < tuttiProfili.size(); i++) {
			if (tuttiProfili.get(i).getUsername().equals(e.getUsername())
					&& tuttiProfili.get(i).getPassword().equals(e.getPassword())) {
				// se sono tutti e due V allora l'account è presente in memoria
				if ("".equals(eu.getNome())) {

				} else {
					tuttiProfili.get(i).getProprietario().setNome(eu.getNome());
					tuttiProfili.get(i).getProprietario()
							.setCognome(tuttiProfili.get(i).getProprietario().getCognome());
				}
				if ("".equals(eu.getCognome())) {

				} else {
					tuttiProfili.get(i).getProprietario().setCognome(eu.getCognome());
					tuttiProfili.get(i).getProprietario().setNome(tuttiProfili.get(i).getProprietario().getNome());
				}
				if ("".equals(eu.getSoprannome())) {

				} else {
					tuttiProfili.get(i).getProprietario().setSoprannome(eu.getSoprannome());
				}
				if ("".equals(eu.getEmail())) {

				} else {
					tuttiProfili.get(i).getProprietario().setEmail(eu.getEmail());
				}
			}
		}

		request.setAttribute("lista", tuttiProfili.toString());
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

}
