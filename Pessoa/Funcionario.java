package Pessoa;

public class Funcionario extends Pessoa {

	private int codigoFuncionario;


	public Funcionario(String nome, String telefone, int diaNasc, int mesNasc, int anoNasc, Endereco endereco,
			int codigoFuncionario) {
		super(nome, telefone, diaNasc, mesNasc, anoNasc, endereco);
		this.codigoFuncionario = codigoFuncionario;
	}

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	
}
