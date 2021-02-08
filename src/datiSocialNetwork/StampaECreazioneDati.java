package datiSocialNetwork;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StampaECreazioneDati extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * request.setAttribute("parametre_username", nomeutente);
		 * request.setAttribute("parametre_password", pass_word);
		 * request.setAttribute("parametre_name", nome);
		 * request.setAttribute("parametre_surname", cognome);
		 * request.setAttribute("parametre_nickname", soprannome);
		 * request.setAttribute("parametre_email", email);
		 */

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
		ListaAccountUtenti listDaStampare = new ListaAccountUtenti();
		listDaStampare.lista.add(profilo);

		// request.getRequestDispatcher("htmlSocialNetwork.jsp").forward(request,
		// response);
		// PrintStream stream= new PrintStream(System.out);
		response.getWriter()
				.write("Creato account numero " + String.valueOf(profilo.getCodice()) + " associato a: "
						+ persona.getCognome() + " " + persona.getNome() + "\r\r" + "Riepilogo dati account:\r\r\n"
						+ "      Username: " + profilo.getUsername() + "\r\n" + "      Password: "
						+ profilo.getPassword() + "\r\n" + "      \r\n" + "Riepilogo dati personali:\r\r\n"
						+ "     Nome:      " + persona.getNome() + "\r\n" + "     Cognome:   " + persona.getCognome()
						+ "\r\n" + "     Nickname:  " + persona.getSoprannome() + "\r\n" + "     e-mail:    "
						+ persona.getEmail() + "\r\r\n" + listDaStampare);

	}

	/*
	 * protected void doPost (HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException{}
	 */

}
