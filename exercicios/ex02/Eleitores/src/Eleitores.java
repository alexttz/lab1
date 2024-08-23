// Classe Eleitores
public class Eleitores {

    // Atributos para armazenar a quantidade de votos brancos, nulos e válidos
    int brancos;
    int nulos;
    int validos;

    // Método Construtor
    // Inicializa os atributos com os valores fornecidos
    public Eleitores(int brancos, int nulos, int validos) {
        this.brancos = brancos;
        this.nulos = nulos;
        this.validos = validos;
    }

    // Método da Classe
    // Exibe a quantidade de votos brancos, nulos e válidos, além do total de votos
    public void mostrarResultado() {
        System.out.println("Votos Brancos: " + brancos);
        System.out.println("Votos Nulos: " + nulos);
        System.out.println("Votos Válidos: " + validos);

        // Calcula o total de votos
        int resultado = brancos + nulos + validos;
        System.out.println("Total: " + resultado);
    }

    // Classe Main para executar o código
    public static void main(String[] args) {
        // Criação de um objeto Eleitores com 20 votos brancos, 4 nulos e 300 válidos
        Eleitores eleitor1 = new Eleitores(20, 4, 300);

        // Exibe o resultado dos votos
        eleitor1.mostrarResultado();
    }
}
