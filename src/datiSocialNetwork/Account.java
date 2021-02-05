package datiSocialNetwork;

public class Account {
	String username;
	String password;
	char[] codice;
	Utente proprietario;

	public Account() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Utente getProprietario() {
		return proprietario;
	}

	public void setProprietario(Utente proprietario) {
		this.proprietario = proprietario;
	}
	
	public char[] getCodice() {
		return codice;
	}

	public void setCodice(char[] c) {
		this.codice = c;
	}
	

}
