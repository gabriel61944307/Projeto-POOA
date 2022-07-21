package Obras;

public class CopiaObrasLiterarias {

	private int numeroSequencial;
	private int situacao;
	
	public CopiaObrasLiterarias() {
		
	}

	public CopiaObrasLiterarias(int numeroSequencial, int situacao) {
		super();
		this.numeroSequencial = numeroSequencial;
		this.situacao = situacao;
	}

	public int getNumeroSequencial() {
		return numeroSequencial;
	}

	public void setNumeroSequencial(int numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	
	
	
}
