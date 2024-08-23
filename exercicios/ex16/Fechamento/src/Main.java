// Classe para calcular as despesas do trimestre
class DespesaTrimestral {
    // Atributos para armazenar as despesas de cada mês
    private double gastoJaneiro;
    private double gastoFevereiro;
    private double gastoMarco;

    // Construtor para inicializar os gastos dos meses
    public DespesaTrimestral(double gastoJaneiro, double gastoFevereiro, double gastoMarco) {
        this.gastoJaneiro = gastoJaneiro;
        this.gastoFevereiro = gastoFevereiro;
        this.gastoMarco = gastoMarco;
    }

    // Método para calcular a despesa total do trimestre
    public double calcularDespesaTotal() {
        return gastoJaneiro + gastoFevereiro + gastoMarco;
    }

    // Método para calcular a média mensal de gastos
    public double calcularMediaMensal() {
        return calcularDespesaTotal() / 3;
    }

    // Método para exibir a despesa total e a média mensal
    public void exibirResultados() {
        double despesaTotal = calcularDespesaTotal();
        double mediaMensal = calcularMediaMensal();
        System.out.println("Despesa total do trimestre: R$ " + String.format("%.2f", despesaTotal));
        System.out.println("Média mensal de gastos: R$ " + String.format("%.2f", mediaMensal));
    }
}

// Classe principal para executar o programa
public class Main {
    public static void main(String[] args) {
        // Valores das despesas para cada mês
        double gastoJaneiro = 15000.0;  // Despesa de janeiro
        double gastoFevereiro = 23000.0;  // Despesa de fevereiro
        double gastoMarco = 17000.0;  // Despesa de março

        // Criação de um objeto DespesaTrimestral e exibição dos resultados
        DespesaTrimestral despesa = new DespesaTrimestral(gastoJaneiro, gastoFevereiro, gastoMarco);
        despesa.exibirResultados();
    }
}
