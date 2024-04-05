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
	        System.out.println("Digite o valor do benchmark para a Razão Ativo Circulante / Passivo Circulante:");
	        double benchmarkACPC = scanner.nextDouble();

	        System.out.println("Digite o valor do benchmark para a Razão de Liquidez:");
	        double benchmarkLiquidez = scanner.nextDouble();

	        System.out.println("Digite o valor do benchmark para a Razão de Liquidez Imediata:");
	        double benchmarkLiquidezImediata = scanner.nextDouble();

	        System.out.println("Digite o valor do benchmark para a Razão de Endividamento:");
	        double benchmarkEndividamento = scanner.nextDouble();

	        scanner.close();

	        // Definindo os benchmarks em um array
	        double[] benchmark = {benchmarkACPC, benchmarkLiquidez, benchmarkLiquidezImediata, benchmarkEndividamento}; 

	        // Calculando as razões financeiras
	        RazoesFinanceiras razoes = Business.calcularRazoesFinanceiras(ativosCirculantes, passivosCirculantes, inventario, lucroLiquido, patrimonioLiquido, dividaTotal);

	        // Realizando a análise de balanço
	        Business.analisarBalanco(razoes, benchmark);
	    }
	}



