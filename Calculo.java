package model;

public class Calculo {

	public double calculoInss(double salarioBruto) {
		double inss = 0;

		if (salarioBruto <= 1320) {
			inss = (salarioBruto * 0.075);
		} else if (salarioBruto > 1320 && salarioBruto <= 2571.29) {
			inss = (salarioBruto * 0.09);
		} else if (salarioBruto > 2571.29 && salarioBruto <= 3856.94) {
			inss = (salarioBruto * 0.12);
		} else if (salarioBruto > 3856.94) {
			inss = (salarioBruto * 0.14);
		}
		System.out.println(" INSS: " + inss);
		return inss;
	}

	public double calculoIrrf(double salarioBruto, double dependente) {
		double irrf = 0;
		double baseCalculo = salarioBruto - (189.59 * dependente);

		if (baseCalculo < 2112.00) {
			irrf = (0);
		} else if (baseCalculo > 2112 && baseCalculo <= 2826.65) {
			irrf = (salarioBruto * 0.075);
		} else if (baseCalculo > 2826.65 && baseCalculo <= 3751.05) {
			irrf = (salarioBruto * 0.15);
		} else if (baseCalculo > 3751.05 && baseCalculo <= 4664.68) {
			irrf = (salarioBruto * 0.22);
		} else if (baseCalculo > 4664.68) {
			irrf = (salarioBruto * 0.27);
		}
		System.out.println(" IRRF: " + irrf);
		return irrf;
	}
	
	

	public double salarioLiquido(double salarioBruto, double inss, double irrf) {

		double calculoInss = salarioBruto - inss ;
		double salarioLiquido = calculoInss - irrf;
		return salarioLiquido;
	}

}
