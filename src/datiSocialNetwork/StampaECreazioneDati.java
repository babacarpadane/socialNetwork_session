package datiSocialNetwork;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StampaECreazioneDati extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) 
	               throws ServletException, IOException{
		
		String nomeutente=request.getParameter("username");
		String pass_word=request.getParameter("password");
		String nome=request.getParameter("name");
		String cognome=request.getParameter("surname");
		String soprannome=request.getParameter("nickname");
		String email=request.getParameter("e-mail");
		
		request.setAttribute("parametre_username", nomeutente);
		request.setAttribute("parametre_password", pass_word);
		request.setAttribute("parametre_name", nome);
		request.setAttribute("parametre_surname", cognome);
		request.setAttribute("parametre_nickname", soprannome);
		request.setAttribute("parametre_email", email);
		
		Account profilo=new Account();
		        profilo.setUsername(nomeutente);
		        profilo.setPassword(pass_word);
		        profilo.proprietario.setNome(nome);
		        profilo.proprietario.setCognome(cognome);
		        profilo.proprietario.setSoprannome(soprannome);
		        profilo.proprietario.setEmail(email);
		        
		     
		
		//request.getRequestDispatcher("htmlSocialNetwork.jsp").forward(request, response);
		
		response.getWriter().write("Riepilogo dati account:\r\r\n"
				+ "      Username: "+nomeutente+"\r\n"
				+ "      Password: "+pass_word+"\r\n"
				+ "      \r\n"
				+ "Riepilogo dati personali:\r\r\n"
				+ "      Username: "+nome+"\r\n"
				+ "      Password: "+cognome+"\r\n"
				+ "      Username: "+soprannome+"\r\n"
				+ "      Password: "+email);
	}
	
	
	
	/*protected void doPost (HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{}*/

}
