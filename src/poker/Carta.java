package poker;

public class Carta {

	private String valor;
	private boolean enBaraja;

	// método parametrizado
	public Carta(String valor, boolean enBaraja) {
		this.valor = valor;
		this.enBaraja = true;
	}

	// getters y setters
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean isEnBaraja() {
		return enBaraja;
	}

	public void setEnBaraja(boolean enBaraja) {
		this.enBaraja = enBaraja;
	}

}
