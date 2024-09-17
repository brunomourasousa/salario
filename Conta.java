package model;

public class Conta {
	private double salarioBruto;
	private double refeicao;
	private double transporte;
	private double alimentacao;
	private double planoSaude;
	private double dependente;

	public double getDependente() {
		return dependente;
	}

	public void setDependente(double dependente) {
		this.dependente = dependente;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(double refeicao) {
		this.refeicao = refeicao;
	}

	public double getTransporte() {
		return transporte;
	}

	public void setTransporte(double transporte) {
		this.transporte = transporte;
	}

	public double getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(double alimentacao) {
		this.alimentacao = alimentacao;
	}

	public double getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(double planoSaude) {
		this.planoSaude = planoSaude;
	}

}
