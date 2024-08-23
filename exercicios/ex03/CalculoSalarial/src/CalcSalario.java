public class CalcSalario {

    // Atributos para armazenar o salário atual e a porcentagem de reajuste
    public float salarioAtual;
    public float porcent;

    // Método Construtor
    // Inicializa os atributos com os valores fornecidos
    public CalcSalario(float salarioAtual, float porcent) {
        this.salarioAtual = salarioAtual;
        this.porcent = porcent;
    }

    // Método para calcular e mostrar o resultado do reajuste salarial
    public void mostraResultado() {
        // Calcula o novo salário com base no reajuste percentual
        float novoSalario = salarioAtual * (porcent / 100);
        novoSalario = novoSalario + salarioAtual;

        // Exibe o salário atual, a porcentagem de reajuste e o novo salário
        System.out.println("Salário Atual: " + salarioAtual);
        System.out.println("Porcentagem de reajuste: " + porcent);
        System.out.println("Novo salário: " + novoSalario);
    }

    // Classe Main para executar o código
    public static void main(String[] args) {
        // Criação de um objeto CalcSalario com salário de 2000 e reajuste de 10%
        CalcSalario salario1 = new CalcSalario(2000, 10);
        
        // Exibe o resultado do cálculo do salário
        salario1.mostraResultado();
    }
}
