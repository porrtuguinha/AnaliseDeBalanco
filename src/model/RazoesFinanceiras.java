package model;

public class RazoesFinanceiras {
    private double razaoAtual;
    private double razaoRapida;
    private double ROE;
    private double razaoEndividamento;

    public RazoesFinanceiras(double razaoAtual, double razaoRapida, double ROE, double razaoEndividamento) {
        this.razaoAtual = razaoAtual;
        this.razaoRapida = razaoRapida;
        this.ROE = ROE;
        this.razaoEndividamento = razaoEndividamento;
    }

    // Métodos getters para acessar as razões financeiras
    public double getRazaoAtual() {
        return razaoAtual;
    }

    public double getRazaoRapida() {
        return razaoRapida;
    }

    public double getROE() {
        return ROE;
    }

    public double getRazaoEndividamento() {
        return razaoEndividamento;
    }
}