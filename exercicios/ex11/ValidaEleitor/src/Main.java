// Classe para representar uma pessoa e verificar se ela pode votar
class Pessoa {
    // Atributos para armazenar o ano atual e o ano de nascimento
    private int anoAtual;
    private int anoNascimento;

    // Construtor para inicializar os anos
    public Pessoa(int anoAtual, int anoNascimento) {
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
    }

    // Método para calcular a idade
    public int calcularIdade() {
        return anoAtual - anoNascimento;
    }

    // Método para verificar se a pessoa pode votar
    public void verificarSePodeVotar() {
        int idade = calcularIdade();
        System.out.println("Idade: " + idade);

        if (idade >= 16) {
            System.out.println("Você pode votar este ano!");
        } else {
            System.out.println("Você NÃO pode votar este ano!");
        }
    }
}

// Classe principal para executar o programa
public class Main {
    public static void main(String[] args) {
        // Exemplo: Definindo o ano atual e o ano de nascimento diretamente
        int anoAtual = 2024;  // Substitua pelo ano atual
        int anoNascimento = 2008;  // Substitua pelo ano de nascimento da pessoa

        // Criação de um objeto Pessoa e verificação se pode votar
        Pessoa pessoa = new Pessoa(anoAtual, anoNascimento);
        pessoa.verificarSePodeVotar();
    }
}
