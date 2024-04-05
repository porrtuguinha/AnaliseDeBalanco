package main;

import java.util.Scanner;

import business.Business;
import model.RazoesFinanceiras;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ativosCirculantes = Business.getDoubleInput(scanner, "Digite o valor dos Ativos Circulantes:");
        double passivosCirculantes = Business.getDoubleInput(scanner, "Digite o valor dos Passivos Circulantes:");
        double inventario = Business.getDoubleInput(scanner, "Digite o valor do Inventário:");
        double lucroLiquido = Business.getDoubleInput(scanner, "Digite o valor do Lucro Líquido:");
        double patrimonioLiquido = Business.getDoubleInput(scanner, "Digite o valor do Patrimônio Líquido:");
        double dividaTotal = Business.getDoubleInput(scanner, "Digite o valor da Dívida Total:");

        // Solicitando os valores dos benchmarks
        double benchmarkACPC = Business.getDoubleInput(scanner, "Digite o valor do benchmark para a Razão Ativo Circulante / Passivo Circulante:");
        double benchmarkLiquidez = Business.getDoubleInput(scanner, "Digite o valor do benchmark para a Razão de Liquidez:");
        double benchmarkLiquidezImediata =Business.getDoubleInput(scanner, "Digite o valor do benchmark para a Razão de Liquidez Imediata:");
        double benchmarkEndividamento = Business.getDoubleInput(scanner, "Digite o valor do benchmark para a Razão de Endividamento:");

        scanner.close();

        // Definindo os benchmarks em um array
        double[] benchmark = {benchmarkACPC, benchmarkLiquidez, benchmarkLiquidezImediata, benchmarkEndividamento}; 

        // Calculando as razões financeiras
        RazoesFinanceiras razoes = Business.calcularRazoesFinanceiras(ativosCirculantes, passivosCirculantes, inventario, lucroLiquido, patrimonioLiquido, dividaTotal);

        // Realizando a análise de balanço
        Business.analisarBalanco(razoes, benchmark);
    }

   
}



