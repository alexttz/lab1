package Lápis;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Lapiz
        Lapiz meuLapiz = new Lapiz("Amarelo", 18.0, "Faber-Castell", "Hexagonal");

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1. Escrever");
            System.out.println("2. Desenhar");
            System.out.println("3. Informações do lápis");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    meuLapiz.escrever();
                    break;
                case 2:
                    meuLapiz.desenhar();
                    break;
                case 3:
                    System.out.println(meuLapiz);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

