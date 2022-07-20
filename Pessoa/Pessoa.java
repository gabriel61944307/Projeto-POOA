package Pessoa;

public abstract class Pessoa {
	private String nome;
	private String telefone;
	private int diaNasc;
	private int mesNasc;
	private int anoNasc;
	private Endereco endereco;
	
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String telefone, int diaNasc, int mesNasc, int anoNasc, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.diaNasc = diaNasc;
		this.mesNasc = mesNasc;
		this.anoNasc = anoNasc;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getDiaNasc() {
		return diaNasc;
	}

	public void setDiaNasc(int diaNasc) {
		if(diaNasc > 0 && diaNasc <= 31)
			this.diaNasc = diaNasc;
	}

	public int getMesNasc() {
		return mesNasc;
	}

	public void setMesNasc(int mesNasc) {
		if(mesNasc > 0 && mesNasc <= 12)
			this.mesNasc = mesNasc;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		if(anoNasc > 0)
			this.anoNasc = anoNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
