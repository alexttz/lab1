// Classe para organizar dois valores em ordem crescente
class Ordenador {
    // Atributos para armazenar os dois valores
    private int valor1;
    private int valor2;

    // Construtor para inicializar os valores
    public Ordenador(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    // Método para exibir os valores em ordem crescente
    public void exibirOrdemCrescente() {
        if (valor1 < valor2) {
            System.out.println("Ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Ordem crescente: " + valor2 + ", " + valor1);
        }
    }
}

// Classe principal para executar o programa
public class App {
    public static void main(String[] args) {
        // Exemplo: Definindo os valores diretamente
        int valor1 = 20;  // Substitua 20 pelo primeiro valor que deseja testar
        int valor2 = 10;  // Substitua 10 pelo segundo valor que deseja testar

        // Criação de um objeto Ordenador e exibição dos valores em ordem crescente
        Ordenador ordenador = new Ordenador(valor1, valor2);
        ordenador.exibirOrdemCrescente();
    }
}
