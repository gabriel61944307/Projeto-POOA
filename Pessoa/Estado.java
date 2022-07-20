package Pessoa;

public class Estado {
	
	private String nomeEstado;
	private String siglaEstado;
	private Pais pais;
	
	public Estado() {
		
	}
	
	public Estado(String nomeEstado, String siglaEstado, Pais pais) {
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
		this.pais = pais;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
