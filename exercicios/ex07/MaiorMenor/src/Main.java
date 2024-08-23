// Classe para representar o valor e verificar se é maior que 10
class Verificador {
    // Atributo para armazenar o valor
    private int valor;

    // Construtor para inicializar o valor
    public Verificador(int valor) {
        this.valor = valor;
    }

    // Método para verificar se o valor é maior que 10
    public void verificarValor() {
        if (valor > 10) {
            System.out.println("Maior que 10!");
        } else {
            System.out.println("Menor que 10!");
        }
    }
}

// Classe principal para executar o programa
public class Main {
    public static void main(String[] args) {
        // Exemplo: Definindo um valor diretamente
        int valorLido = 15;  // Substitua 15 pelo valor que você deseja testar

        // Criação de um objeto Verificador e verificação do valor
        Verificador verificador = new Verificador(valorLido);
        verificador.verificarValor();
    }
}
