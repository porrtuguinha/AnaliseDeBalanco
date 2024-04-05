package main;

import java.util.Scanner;

import business.Business;
import model.RazoesFinanceiras;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor dos Ativos Circulantes:");
	        double ativosCirculantes = scanner.nextDouble();

	        System.out.println("Digite o valor dos Passivos Circulantes:");
	        double passivosCirculantes = scanner.nextDouble();

	        System.out.println("Digite o valor do Inventário:");
	        double inventario = scanner.nextDouble();

	        System.out.println("Digite o valor do Lucro Líquido:");
	        double lucroLiquido = scanner.nextDouble();

	        System.out.println("Digite o valor do Patrimônio Líquido:");
	        double patrimonioLiquido = scanner.nextDouble();

	        System.out.println("Digite o valor da Dívida Total:");
	        double dividaTotal = scanner.nextDouble();

	        scanner.close();

	        // Definindo os benchmarks para comparação
	        double[] benchmark = {1.17, 1.0, 0.15, 0.5}; 

	        // Calculando as razões financeiras
	        RazoesFinanceiras razoes = Business.calcularRazoesFinanceiras(ativosCirculantes, passivosCirculantes, inventario, lucroLiquido, patrimonioLiquido, dividaTotal);

	        // Realizando a análise de balanço
	        Business.analisarBalanco(razoes, benchmark);
	    }
	}



