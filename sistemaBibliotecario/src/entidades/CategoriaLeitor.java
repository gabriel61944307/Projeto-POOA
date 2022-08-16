package entidades;

public class CategoriaLeitor {

	private int codigoCatLeitor;
	private int maximoDiasEmprestimo;
	private String descricao;
	
	public CategoriaLeitor(int codigoCatLeitor, int maximoDiasEmprestimo, String descricao) {
		this.codigoCatLeitor = codigoCatLeitor;
		this.maximoDiasEmprestimo = maximoDiasEmprestimo;
		this.descricao = descricao;
	}
	
	public int getCodigoCatLeitor() {
		return codigoCatLeitor;
	}
	public void setCodigoCatLeitor(int codigoCatLeitor) {
		this.codigoCatLeitor = codigoCatLeitor;
	}
	public int getMaximoDiasEmprestimo() {
		return maximoDiasEmprestimo;
	}
	public void setMaximoDiasEmprestimo(int maximoDiasEmprestimo) {
		this.maximoDiasEmprestimo = maximoDiasEmprestimo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
