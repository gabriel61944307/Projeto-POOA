package entidades;

public class Emprestimo {

	private int diaEmprestimo;
	private int mesEmprestimo;
	private int anoEmprestimo;
	private int diaPrevistaDevolucao;
	private int mesPrevistaDevolucao;
	private int anoPrevistaDevolucao;
	private Funcionario funcionarioResponsavel;
	private CopiaObrasLiterarias copiaEmprestada;
	private Leitor leitor;

	public Emprestimo(int diaEmprestimo, int mesEmprestimo, int anoEmprestimo, int diaPrevistaDevolucao,
			int mesPrevistaDevolucao, int anoPrevistaDevolucao, Funcionario funcionarioResponsavel,
			CopiaObrasLiterarias copiaEmprestada, Leitor leitor) {
		this.diaEmprestimo = diaEmprestimo;
		this.mesEmprestimo = mesEmprestimo;
		this.anoEmprestimo = anoEmprestimo;
		this.diaPrevistaDevolucao = diaPrevistaDevolucao;
		this.mesPrevistaDevolucao = mesPrevistaDevolucao;
		this.anoPrevistaDevolucao = anoPrevistaDevolucao;
		this.funcionarioResponsavel = funcionarioResponsavel;
		this.copiaEmprestada = copiaEmprestada;
		this.leitor = leitor;
	}

	public int getDiaEmprestimo() {
		return diaEmprestimo;
	}

	public void setDiaEmprestimo(int diaEmprestimo) {
		this.diaEmprestimo = diaEmprestimo;
	}

	public int getMesEmprestimo() {
		return mesEmprestimo;
	}

	public void setMesEmprestimo(int mesEmprestimo) {
		this.mesEmprestimo = mesEmprestimo;
	}

	public int getAnoEmprestimo() {
		return anoEmprestimo;
	}

	public void setAnoEmprestimo(int anoEmprestimo) {
		this.anoEmprestimo = anoEmprestimo;
	}

	public int getDiaPrevistaDevolucao() {
		return diaPrevistaDevolucao;
	}

	public void setDiaPrevistaDevolucao(int diaPrevistaDevolucao) {
		this.diaPrevistaDevolucao = diaPrevistaDevolucao;
	}

	public int getMesPrevistaDevolucao() {
		return mesPrevistaDevolucao;
	}

	public void setMesPrevistaDevolucao(int mesPrevistaDevolucao) {
		this.mesPrevistaDevolucao = mesPrevistaDevolucao;
	}

	public int getAnoPrevistaDevolucao() {
		return anoPrevistaDevolucao;
	}

	public void setAnoPrevistaDevolucao(int anoPrevistaDevolucao) {
		this.anoPrevistaDevolucao = anoPrevistaDevolucao;
	}

	public Funcionario getFuncionarioResponsavel() {
		return funcionarioResponsavel;
	}

	public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
		this.funcionarioResponsavel = funcionarioResponsavel;
	}

	public CopiaObrasLiterarias getCopiaEmprestada() {
		return copiaEmprestada;
	}

	public void setCopiaEmprestada(CopiaObrasLiterarias copiaEmprestada) {
		this.copiaEmprestada = copiaEmprestada;
	}

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	
	
}
