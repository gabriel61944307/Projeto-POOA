package Pessoa;

public class Leitor extends Pessoa { 
	
	private String email;
	private String cpf;
	private CategoriaLeitor categoriaLeitor;
	
	
	public Leitor(String nome, String telefone, int diaNasc, int mesNasc, int anoNasc, Endereco endereco, String email,
			String cpf, CategoriaLeitor categoriaLeitor) {
		super(nome, telefone, diaNasc, mesNasc, anoNasc, endereco);
		this.email = email;
		this.cpf = cpf;
		this.categoriaLeitor = categoriaLeitor;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public CategoriaLeitor getCategoriaLeitor() {
		return categoriaLeitor;
	}
	public void setCategoriaLeitor(CategoriaLeitor categoriaLeitor) {
		this.categoriaLeitor = categoriaLeitor;
	}
	
	
}
