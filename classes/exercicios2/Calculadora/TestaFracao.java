package Calculadora;

import java.util.Scanner;

public class TestaFracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a fração 1 (numerador e denominador): ");
        int num1 = scanner.nextInt();
        int den1 = scanner.nextInt();
        Fracao fracao1 = new Fracao(num1, den1);

        System.out.println("Digite a fração 2 (numerador e denominador): ");
        int num2 = scanner.nextInt();
        int den2 = scanner.nextInt();
        Fracao fracao2 = new Fracao(num2, den2);

        int opcao;
        do {
            // Exibindo o menu
            System.out.println("\nMenu:");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma: " + fracao1.somar(fracao2));
                    break;
                case 2:
                    System.out.println("Resultado da subtração: " + fracao1.subtrair(fracao2));
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: " + fracao1.multiplicar(fracao2));
                    break;
                case 4:
                    try {
                        System.out.println("Resultado da divisão: " + fracao1.dividir(fracao2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
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
