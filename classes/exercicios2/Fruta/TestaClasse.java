package Fruta;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Fruta
        Fruta minhaFruta = new Fruta("Verde", "Redonda", "Azeda");

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1. Amadurecer");
            System.out.println("2. Cair");
            System.out.println("3. Informações da fruta");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    minhaFruta.amadurecer();
                    break;
                case 2:
                    minhaFruta.cair();
                    break;
                case 3:
                    System.out.println(minhaFruta);
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

