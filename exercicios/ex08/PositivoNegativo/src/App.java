// Classe para representar o valor e verificar se é positivo ou negativo
class Verificador {
    // Atributo para armazenar o valor
    private int valor;

    // Construtor para inicializar o valor
    public Verificador(int valor) {
        this.valor = valor;
    }

    // Método para verificar se o valor é positivo ou negativo
    public void verificarPositivoNegativo() {
        if (valor >= 0) {
            System.out.println("O valor é POSITIVO!");
        } else {
            System.out.println("O valor é NEGATIVO!");
        }
    }
}

// Classe principal para executar o programa
public class App {
    public static void main(String[] args) {
        // Exemplo: Definindo um valor diretamente
        int valorLido = -5;  // Substitua -5 pelo valor que você deseja testar

        // Criação de um objeto Verificador e verificação do valor
        Verificador verificador = new Verificador(valorLido);
        verificador.verificarPositivoNegativo();
    }
}
