package datiSocialNetwork;

import java.util.ArrayList;
import java.util.List;

public class ListaAccountUtenti {
	List<Account> lista=new ArrayList<Account>();

	public List<Account> getLista() {
		return lista;
	}

	@Override
	public String toString() {
		return "Lista degli account utenti: " + lista;
	}

}
