// Classe para representar as notas e calcular a média
class Aluno {
    // Atributos para armazenar as notas das avaliações
    private double nota1;
    private double nota2;

    // Construtor para inicializar as notas
    public Aluno(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método para calcular a média aritmética simples
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para verificar se o aluno foi aprovado
    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.println("Média: " + media);

        if (media >= 6.0) {
            System.out.println("Aluno APROVADO!");
        } else {
            System.out.println("Aluno REPROVADO!");
        }
    }
}

// Classe principal para executar o programa
public class Media {
    public static void main(String[] args) {
        // Exemplo: Definindo as notas diretamente
        double nota1 = 7.5;  // Substitua 7.5 pela nota da 1a. avaliação
        double nota2 = 5.5;  // Substitua 5.5 pela nota da 2a. avaliação

        // Criação de um objeto Aluno e verificação da aprovação
        Aluno aluno = new Aluno(nota1, nota2);
        aluno.verificarAprovacao();
    }
}
