package Obras;

public class CategoriaObrasLiterarias {
	
	private int codigo;
	private String descricao;
	private int maximoDiasEmprestimo;
	private double taxaDiariaMulta;
	
	public CategoriaObrasLiterarias() {
		
	}

	public CategoriaObrasLiterarias(int codigo, String descricao, int maximoDiasEmprestimo, double taxaDiariaMulta) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.maximoDiasEmprestimo = maximoDiasEmprestimo;
		this.taxaDiariaMulta = taxaDiariaMulta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getMaximoDiasEmprestimo() {
		return maximoDiasEmprestimo;
	}

	public void setMaximoDiasEmprestimo(int maximoDiasEmprestimo) {
		this.maximoDiasEmprestimo = maximoDiasEmprestimo;
	}

	public double getTaxaDiariaMulta() {
		return taxaDiariaMulta;
	}

	public void setTaxaDiariaMulta(double taxaDiariaMulta) {
		this.taxaDiariaMulta = taxaDiariaMulta;
	}
	
	
}
