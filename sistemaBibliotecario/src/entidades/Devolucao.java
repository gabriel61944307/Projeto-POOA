package entidades;

public class Devolucao {

	private CopiaObrasLiterarias copiaDevolvida;
	private int diaDevolucao;
	private int mesDevolucao;
	private int anoDevolucao;

	public Devolucao(CopiaObrasLiterarias copiaDevolvida, int diaDevolucao, int mesDevolucao, int anoDevolucao) {
		this.copiaDevolvida = copiaDevolvida;
		this.diaDevolucao = diaDevolucao;
		this.mesDevolucao = mesDevolucao;
		this.anoDevolucao = anoDevolucao;
	}

	public CopiaObrasLiterarias getCopiaDevolvida() {
		return copiaDevolvida;
	}

	public void setCopiaDevolvida(CopiaObrasLiterarias copiaDevolvida) {
		this.copiaDevolvida = copiaDevolvida;
	}

	public int getDiaDevolucao() {
		return diaDevolucao;
	}

	public void setDiaDevolucao(int diaDevolucao) {
		this.diaDevolucao = diaDevolucao;
	}

	public int getMesDevolucao() {
		return mesDevolucao;
	}

	public void setMesDevolucao(int mesDevolucao) {
		this.mesDevolucao = mesDevolucao;
	}

	public int getAnoDevolucao() {
		return anoDevolucao;
	}

	public void setAnoDevolucao(int anoDevolucao) {
		this.anoDevolucao = anoDevolucao;
	}
	
	
}
