package model;

public class Carta {
	private String naipe;
	private String numero;

	public Carta(String np, String num) {
		naipe = np.toUpperCase();
	    numero = num;
	}

	public String getnaipe() {
	    return naipe;
	}

	public String getNumero() {
	    return numero;
	}

	protected void setnaipe(String np) {
		naipe = np.toUpperCase();
	}

	protected void setNumero(String num) {
	    numero = num;
	}
}