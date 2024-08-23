// Classe para calcular a duração de um jogo de xadrez
class JogoXadrez {
    // Atributos para armazenar a hora de início e a hora de fim
    private int horaInicio;
    private int horaFim;

    // Construtor para inicializar as horas
    public JogoXadrez(int horaInicio, int horaFim) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    // Método para calcular a duração do jogo
    public int calcularDuracao() {
        // Se o jogo termina no mesmo dia
        if (horaFim >= horaInicio) {
            return horaFim - horaInicio;
        } 
        // Se o jogo termina no dia seguinte
        else {
            return (24 - horaInicio) + horaFim;
        }
    }

    // Método para exibir a duração do jogo
    public void exibirDuracao() {
        int duracao = calcularDuracao();
        System.out.println("Duração do jogo: " + duracao + " hora(s)");
    }
}

// Classe principal para executar o programa
public class App {
    public static void main(String[] args) {
        // Exemplo: Definindo as horas diretamente
        int horaInicio = 22;  // Substitua 22 pela hora de início do jogo
        int horaFim = 2;      // Substitua 2 pela hora de fim do jogo

        // Criação de um objeto JogoXadrez e exibição da duração do jogo
        JogoXadrez jogo = new JogoXadrez(horaInicio, horaFim);
        jogo.exibirDuracao();
    }
}

