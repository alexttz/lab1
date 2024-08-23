import java.util.Scanner;

class Aluno {
    private double p1;
    private double e1;
    private double e2;
    private double api;
    private double x;
    private double sub;

    // Construtor
    public Aluno(double p1, double e1, double e2, double api, double x, double sub) {
        this.p1 = p1;
        this.e1 = e1;
        this.e2 = e2;
        this.api = api;
        this.x = x;
        this.sub = sub;
    }

    // Método para calcular a média de LP1
    public double calcularMediaLP1() {
        double notaP1 = p1 * 0.6;
        double notaE = ((e1 + e2) / 2) * 0.4;
        double notaTotal = notaP1 + notaE;

        double ajuste = Math.max(notaTotal - 5.9, 0);
        double divisor = notaTotal - 5.9;
        double fatorAjuste = divisor != 0 ? ajuste / divisor : 0;

        double mediaLP1 = (notaTotal * 0.5) + (fatorAjuste * (api * 0.5)) + x + (sub * 0.2);

        return mediaLP1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados
        System.out.print("Digite a nota da P1: ");
        double p1 = scanner.nextDouble();

        System.out.print("Digite a nota da E1: ");
        double e1 = scanner.nextDouble();

        System.out.print("Digite a nota da E2: ");
        double e2 = scanner.nextDouble();

        System.out.print("Digite a nota da API: ");
        double api = scanner.nextDouble();

        System.out.print("Digite a nota X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite a nota SUB: ");
        double sub = scanner.nextDouble();

        // Criação do objeto Aluno
        Aluno aluno = new Aluno(p1, e1, e2, api, x, sub);

        // Cálculo e exibição da média
        double mediaLP1 = aluno.calcularMediaLP1();
        System.out.printf("A média de LP1 do aluno é: %.2f%n", mediaLP1);

        scanner.close();
    }
}
