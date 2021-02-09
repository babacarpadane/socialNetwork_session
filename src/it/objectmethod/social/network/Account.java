package it.objectmethod.social.network;

public class Account {
	private String username;
	private String password;
	private char[] codice;
	private Utente proprietario;

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

	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", codice=" + String.valueOf(codice)
				+ ", proprietario=" + proprietario + "]\r\r\n";
	}

}
