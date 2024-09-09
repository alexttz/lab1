import java.util.Scanner;

public class Celular {
    // Atributos
    private String cor;
    private double tamanho; // Tamanho em polegadas
    private String modelo;
    private int ano;

    // Construtor
    public Celular(String cor, double tamanho, String modelo, int ano) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos
    public void ligar() {
        System.out.println("O celular está ligando...");
    }

    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    public void exibirVideo() {
        System.out.println("Exibindo vídeo...");
    }

    // Métodos getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Celular [cor=" + cor + ", tamanho=" + tamanho + ", modelo=" + modelo + ", ano=" + ano + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Celular
        Celular meuCelular = new Celular("Preto", 6.5, "Modelo X", 2024);

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1. Ligar celular");
            System.out.println("2. Tocar música");
            System.out.println("3. Exibir vídeo");
            System.out.println("4. Informações do celular");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    meuCelular.ligar();
                    break;
                case 2:
                    meuCelular.tocarMusica();
                    break;
                case 3:
                    meuCelular.exibirVideo();
                    break;
                case 4:
                    System.out.println(meuCelular);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
