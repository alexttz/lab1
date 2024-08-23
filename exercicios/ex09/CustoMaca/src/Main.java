// Classe para representar a compra de maçãs e calcular o custo total
class CompraMacas {
    // Atributo para armazenar a quantidade de maçãs
    private int quantidade;

    // Construtor para inicializar a quantidade de maçãs
    public CompraMacas(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para calcular o custo total da compra
    public double calcularCustoTotal() {
        double precoPorMaca;
        
        // Verifica o preço com base na quantidade de maçãs
        if (quantidade < 12) {
            precoPorMaca = 1.30;
        } else {
            precoPorMaca = 1.00;
        }

        // Calcula o custo total
        return quantidade * precoPorMaca;
    }

    // Método para exibir o custo total
    public void exibirCustoTotal() {
        double custoTotal = calcularCustoTotal();
        System.out.println("O custo total da compra é R$ " + custoTotal);
    }
}

// Classe principal para executar o programa
public class Main {
    public static void main(String[] args) {
        // Exemplo: Definindo a quantidade de maçãs diretamente
        int quantidadeMacas = 15;  // Substitua 15 pela quantidade que você deseja testar

        // Criação de um objeto CompraMacas e cálculo do custo total
        CompraMacas compra = new CompraMacas(quantidadeMacas);
        compra.exibirCustoTotal();
    }
}
