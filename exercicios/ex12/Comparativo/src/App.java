// Classe para comparar dois valores e determinar o maior
class Comparador {
    // Atributos para armazenar os dois valores
    private int valor1;
    private int valor2;

    // Construtor para inicializar os valores
    public Comparador(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Método para determinar e exibir o maior valor
    public void exibirMaiorValor() {
        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }
    }
}

// Classe principal para executar o programa
public class App {
    public static void main(String[] args) {
        // Exemplo: Definindo os valores diretamente
        int valor1 = 15;  // Substitua 15 pelo primeiro valor que deseja testar
        int valor2 = 10;  // Substitua 10 pelo segundo valor que deseja testar

        // Criação de um objeto Comparador e exibição do maior valor
        Comparador comparador = new Comparador(valor1, valor2);
        comparador.exibirMaiorValor();
    }
}
