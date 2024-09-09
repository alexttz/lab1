package Bicicleta;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Bicicleta
        Bicicleta minhaBicicleta = new Bicicleta("Vermelha", "M", "Caloi", "Mountain");

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1. Andar");
            System.out.println("2. Correr");
            System.out.println("3. Estacionar");
            System.out.println("4. Informações da bicicleta");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    minhaBicicleta.andar();
                    break;
                case 2:
                    minhaBicicleta.correr();
                    break;
                case 3:
                    minhaBicicleta.estacionar();
                    break;
                case 4:
                    System.out.println(minhaBicicleta);
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

