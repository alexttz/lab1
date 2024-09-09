package Bandeiras;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Bandeira
        Bandeira minhaBandeira = new Bandeira("Retângulo", "Verde e Amarelo", "Brasil");

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1. Astiar a bandeira");
            System.out.println("2. Simbolizar a bandeira");
            System.out.println("3. Informações da bandeira");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    minhaBandeira.astiar();
                    break;
                case 2:
                    minhaBandeira.simbolizar();
                    break;
                case 3:
                    System.out.println(minhaBandeira);
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
