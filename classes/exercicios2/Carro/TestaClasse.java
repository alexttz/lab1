package Carro;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um objeto Carro
        Carro meuCarro = new Carro("Vermelho", 4.5, "Fusca", 2020);

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1. Andar");
            System.out.println("2. Estacionar");
            System.out.println("3. Correr");
            System.out.println("4. Buzinar");
            System.out.println("5. Informações do carro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    meuCarro.andar();
                    break;
                case 2:
                    meuCarro.estacionar();
                    break;
                case 3:
                    meuCarro.correr();
                    break;
                case 4:
                    meuCarro.buzinar();
                    break;
                case 5:
                    System.out.println(meuCarro);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}

