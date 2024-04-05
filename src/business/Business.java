package business;

import java.util.Scanner;

import model.RazoesFinanceiras;

public class Business {
	 public static RazoesFinanceiras calcularRazoesFinanceiras(double ativosCirculantes, double passivosCirculantes, double inventario, double lucroLiquido, double patrimonioLiquido, double dividaTotal) {
	        double razaoAtual = ativosCirculantes / passivosCirculantes;
	        double razaoRapida = (ativosCirculantes - inventario) / passivosCirculantes;
	        double roe = lucroLiquido / patrimonioLiquido;
	        double razaoEndividamento = dividaTotal / patrimonioLiquido;

	        return new RazoesFinanceiras(razaoAtual, razaoRapida, roe, razaoEndividamento);
	    }
	
	 public static void analisarBalanco(RazoesFinanceiras razoes, double[] benchmark) {
	        System.out.println("Análise de Balanço:");

	        // Comparando as razões financeiras com os benchmarks
	        System.out.println("Comparação com benchmarks:");
	        if (razoes.getRazaoAtual() > benchmark[0]) {
	            System.out.println(" - Razão Atual está acima do benchmark.");
	        } else {
	            System.out.println(" - Razão Atual está abaixo do benchmark.");
	        }

	        if (razoes.getRazaoRapida() > benchmark[1]) {
	            System.out.println(" - Razão Rápida está acima do benchmark.");
	        } else {
	            System.out.println(" - Razão Rápida está abaixo do benchmark.");
	        }

	        if (razoes.getROE() > benchmark[2]) {
	            System.out.println(" - ROE está acima do benchmark.");
	        } else {
	            System.out.println(" - ROE está abaixo do benchmark.");
	        }

	        if (razoes.getRazaoEndividamento() > benchmark[3]) {
	            System.out.println(" - Razão de Endividamento está acima do benchmark.");
	        } else {
	            System.out.println(" - Razão de Endividamento está abaixo do benchmark.");
	        }

	        // Análise qualitativa
	        System.out.println("\nAnálise qualitativa:");
	        if (razoes.getRazaoAtual() > 2.0) {
	            System.out.println(" - A empresa possui boa capacidade de liquidez.");
	        } else if (razoes.getRazaoAtual() > 1.0) {
	            System.out.println(" - A empresa possui uma capacidade de liquidez razoável.");
	        } else {
	            System.out.println(" - A empresa pode enfrentar dificuldades para pagar suas dívidas de curto prazo.");
	        }

	        if (razoes.getROE() > 0.15) {
	            System.out.println(" - A empresa está gerando um retorno sólido sobre o seu patrimônio.");
	        } else if (razoes.getROE() > 0.10) {
	            System.out.println(" - O retorno sobre o patrimônio líquido da empresa é aceitável.");
	        } else {
	            System.out.println(" - O retorno sobre o patrimônio líquido da empresa é baixo.");
	        }

	        if (razoes.getRazaoEndividamento() < 0.5) {
	            System.out.println(" - A empresa tem uma boa estrutura de capital, com baixo endividamento.");
	        } else if (razoes.getRazaoEndividamento() < 1.0) {
	            System.out.println(" - O endividamento da empresa está dentro de limites razoáveis.");
	        } else {
	            System.out.println(" - A empresa está altamente alavancada, o que pode representar riscos.");
	        }
	    }
	 public static double getDoubleInput(Scanner scanner, String message) {
	        System.out.println(message);
	        while (!scanner.hasNextDouble()) {
	            System.out.println("Por favor, insira um valor numérico válido.");
	            scanner.next(); // Limpa o buffer do scanner
	        }
	        return scanner.nextDouble();
	    }


}
