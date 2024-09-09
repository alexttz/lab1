package Caderno;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Caderno
        Caderno meuCaderno = new Caderno("Azul", "Tilibra", 200);

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1. Tomar notas");
            System.out.println("2. Organizar");
            System.out.println("3. Informações do caderno");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    meuCaderno.tomarNotas();
                    break;
                case 2:
                    meuCaderno.organizar();
                    break;
                case 3:
                    System.out.println(meuCaderno);
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
