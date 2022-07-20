package Pessoa;

public class Autor extends Pessoa{

	private int codigoAutor;


	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Autor(String nome, String telefone, int diaNasc, int mesNasc, int anoNasc, Endereco endereco,
			int codigoAutor) {
		super(nome, telefone, diaNasc, mesNasc, anoNasc, endereco);
		this.codigoAutor = codigoAutor;
	}

	public int getCodigoAutor() {
		return codigoAutor;
	}

	public void setCodigoAutor(int codigoAutor) {
		this.codigoAutor = codigoAutor;
	}

}
