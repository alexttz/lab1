// Classe para calcular o salário de um funcionário, incluindo horas extras
class Funcionario {
    // Atributos para armazenar as horas trabalhadas e o salário por hora
    private int horasTrabalhadas;
    private double salarioPorHora;
    private static final int HORAS_SEMANAIS = 40;
    private static final int SEMANAS_NO_MES = 4;

    // Construtor para inicializar as horas trabalhadas e o salário por hora
    public Funcionario(int horasTrabalhadas, double salarioPorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }

    // Método para calcular o salário total, incluindo horas extras se houver
    public double calcularSalarioTotal() {
        int horasNormaisMensais = HORAS_SEMANAIS * SEMANAS_NO_MES;
        double salarioTotal;

        if (horasTrabalhadas > horasNormaisMensais) {
            int horasExtras = horasTrabalhadas - horasNormaisMensais;
            double valorHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (horasNormaisMensais * salarioPorHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        }

        return salarioTotal;
    }

    // Método para exibir o salário total
    public void exibirSalarioTotal() {
        double salarioTotal = calcularSalarioTotal();
        System.out.printf("Salário total do funcionário: R$ %.2f%n", salarioTotal);
    }
}

// Classe principal para executar o programa
public class App {
    public static void main(String[] args) {
        // Exemplo: Definindo as horas trabalhadas e o salário por hora diretamente
        int horasTrabalhadas = 180;  // Substitua 180 pelo número de horas trabalhadas no mês
        double salarioPorHora = 20.0;  // Substitua 20.0 pelo salário por hora do funcionário

        // Criação de um objeto Funcionario e exibição do salário total
        Funcionario funcionario = new Funcionario(horasTrabalhadas, salarioPorHora);
        funcionario.exibirSalarioTotal();
    }
}
