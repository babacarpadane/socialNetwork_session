package it.objectmethod.social.network;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StampaECreazioneDati extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public List<Account> listaProfili = new ArrayList<Account>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Utente persona = new Utente();
		persona.setNome(request.getParameter("name"));
		persona.setCognome(request.getParameter("surname"));
		persona.setSoprannome(request.getParameter("nickname"));
		persona.setEmail(request.getParameter("e-mail"));

		// creazione codice alfanumerico dell'account
		char s[] = new char[5];
		char num[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		char car[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		Random rand = new Random();
		do {
			s[0] = car[rand.nextInt(25)];
			s[1] = car[rand.nextInt(25)];
			s[2] = car[rand.nextInt(25)];
			s[3] = num[rand.nextInt(9)];
			s[4] = num[rand.nextInt(9)];
		} while (false);

		Account profilo = new Account();
		profilo.setUsername(request.getParameter("username"));
		profilo.setPassword(request.getParameter("password"));
		profilo.setCodice(s);
		profilo.setProprietario(persona);

		// aggiungo l'account appena creato alla lista
		listaProfili.add(profilo);

		request.setAttribute("numeroAccount", String.valueOf(profilo.getCodice()));
		request.setAttribute("nome", profilo.getProprietario().getNome());
		request.setAttribute("cognome", profilo.getProprietario().getCognome());
		request.setAttribute("lista", listaProfili.toString());
		request.getRequestDispatcher("index.jsp").forward(request, response);

		// PrintStream stream= new PrintStream(System.out);
		/*
		 * response.getWriter() .write("\r\r\n" + listaProfili.toString());
		 */

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// controllo che l'emai e la password inseriti corrispondano ad un account
		// esistente

		Account e = new Account();
		Utente eu = new Utente();

		e.setUsername(request.getParameter("usernameSicurezza"));
		e.setPassword(request.getParameter("passwordSicurezza"));
		eu.setNome(request.getParameter("nameModificato"));
		eu.setCognome(request.getParameter("surnameModificato"));
		eu.setSoprannome(request.getParameter("nicknameModificato"));
		eu.setEmail(request.getParameter("e-mailModificato"));

		for (int i = 0; i < listaProfili.size(); i++) {
			if (listaProfili.get(i).getUsername().equals(e.getUsername())
					&& listaProfili.get(i).getPassword().equals(e.getPassword())) {
				// se sono tutti e due V allora l'account è presente in memoria
				if ("".equals(eu.getNome())) {

				} else {
					listaProfili.get(i).getProprietario().setNome(eu.getNome());
					listaProfili.get(i).getProprietario().setCognome(listaProfili.get(i).getProprietario().getCognome());
				}
				if ("".equals(eu.getCognome())) {

				} else {
					listaProfili.get(i).getProprietario().setCognome(eu.getCognome());
					listaProfili.get(i).getProprietario().setNome(listaProfili.get(i).getProprietario().getNome());
				}
				if ("".equals(eu.getSoprannome())) {

				} else {
					listaProfili.get(i).getProprietario().setSoprannome(eu.getSoprannome());
				}
				if ("".equals(eu.getEmail())) {

				} else {
					listaProfili.get(i).getProprietario().setEmail(eu.getEmail());
				}
			}
		}

		request.setAttribute("tour", listaProfili.toString());
		request.getRequestDispatcher("confermaSicurezza.jsp").forward(request, response);

	}

}
