package Servicos;
import Pessoa.*;

public class Reserva {

	private int diaReserva;
	private int mesReserva;
	private int anoReserva;
	private int diaRetirada;
	private int mesRetirada;
	private int anoRetirada;
	private int diaPrevistaDevolucao;
	private int mesPrevistaDevolucao;
	private int anoPrevistaDevolucao;
	private Funcionario funcionarioResponsavel;
	private Leitor leitor;
	
	public Reserva() {
		
	}

	public Reserva(int diaReserva, int mesReserva, int anoReserva, int diaRetirada, int mesRetirada, int anoRetirada,
			int diaPrevistaDevolucao, int mesPrevistaDevolucao, int anoPrevistaDevolucao,
			Funcionario funcionarioResponsavel, Leitor leitor) {
		super();
		this.diaReserva = diaReserva;
		this.mesReserva = mesReserva;
		this.anoReserva = anoReserva;
		this.diaRetirada = diaRetirada;
		this.mesRetirada = mesRetirada;
		this.anoRetirada = anoRetirada;
		this.diaPrevistaDevolucao = diaPrevistaDevolucao;
		this.mesPrevistaDevolucao = mesPrevistaDevolucao;
		this.anoPrevistaDevolucao = anoPrevistaDevolucao;
		this.funcionarioResponsavel = funcionarioResponsavel;
		this.leitor = leitor;
	}

	public int getDiaReserva() {
		return diaReserva;
	}

	public void setDiaReserva(int diaReserva) {
		this.diaReserva = diaReserva;
	}

	public int getMesReserva() {
		return mesReserva;
	}

	public void setMesReserva(int mesReserva) {
		this.mesReserva = mesReserva;
	}

	public int getAnoReserva() {
		return anoReserva;
	}

	public void setAnoReserva(int anoReserva) {
		this.anoReserva = anoReserva;
	}

	public int getDiaRetirada() {
		return diaRetirada;
	}

	public void setDiaRetirada(int diaRetirada) {
		this.diaRetirada = diaRetirada;
	}

	public int getMesRetirada() {
		return mesRetirada;
	}

	public void setMesRetirada(int mesRetirada) {
		this.mesRetirada = mesRetirada;
	}

	public int getAnoRetirada() {
		return anoRetirada;
	}

	public void setAnoRetirada(int anoRetirada) {
		this.anoRetirada = anoRetirada;
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

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	
	
	
}
