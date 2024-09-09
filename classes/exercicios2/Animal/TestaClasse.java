package Animal;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Animal
        Animal meuAnimal = new Animal("Verde", 1.5, "Floresta", "Macaco");

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1. Comer");
            System.out.println("2. Nadar");
            System.out.println("3. Escalar");
            System.out.println("4. Informações do animal");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    meuAnimal.comer();
                    break;
                case 2:
                    meuAnimal.nadar();
                    break;
                case 3:
                    meuAnimal.escalar();
                    break;
                case 4:
                    System.out.println(meuAnimal);
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
