package sistema;

import java.util.Scanner;

import model.Calculo;
import model.Conta;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			menu();
			int opcao = sc.nextInt();
			switch (opcao) {
			case 1: {
				Conta conta = new Conta();
				System.out.println("");
				System.out.print("Salário Bruto (em R$): ");
				conta.setSalarioBruto(sc.nextDouble());
				System.out.print("Valor do Vale Refeição (VR) (em R$): ");
				conta.setRefeicao(sc.nextDouble());
				System.out.print("Valor do Vale Transporte (VT) (em R$): ");
				conta.setTransporte(sc.nextDouble());
				System.out.print("Valor do Vale Alimentação (VA) (em R$): ");
				conta.setAlimentacao(sc.nextDouble());
				System.out.print("Valor do plano de saúde por dependente (em R$): ");
				conta.setPlanoSaude(sc.nextDouble());
				System.out.print("Número de dependente: ");
				conta.setDependente(sc.nextDouble());
				System.out.println("");
				
				Calculo cal = new Calculo();
				System.out.println("--------------------------------");
				System.out.println("Salario Bruto: " + conta.getSalarioBruto());
				System.out.println("");
				System.out.println("Descontos:");
				double salMenosImp = cal.salarioLiquido(conta.getSalarioBruto(), cal.calculoIrrf(conta.getSalarioBruto(), conta.getDependente()), cal.calculoInss(conta.getSalarioBruto()));
				double salLiquido = salMenosImp - (conta.getRefeicao() + conta.getTransporte() + conta.getAlimentacao()) - (conta.getPlanoSaude() * conta.getDependente());
				System.out.println(" Refeição: " + conta.getRefeicao());
				System.out.println(" Tranporte: " + conta.getTransporte());
				System.out.println(" Alimentação: " + conta.getAlimentacao());
				System.out.println(" Plano de Saúde: " + conta.getPlanoSaude());
				System.out.println("");
				System.out.println("Salario Liquido: " + salLiquido);
				System.out.println("---------------------------------");
				
				
				break;
			}
			case 9: {
				System.exit(0);
				break;
			}
			default:
				System.out.println("Opção invalida...");
				System.out.println("");
				break;
			}
		} while (true);
	}

	public static void menu() {
		System.out.println("Calculo de salario Liquido");
		System.out.println("");
		System.out.println("1 - Novo Calculo");
		System.out.println("9 - Sair");
	}

}
