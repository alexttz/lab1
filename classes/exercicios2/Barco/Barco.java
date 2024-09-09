package Barco;

public class Barco {
    // Atributos
    private String cor;
    private double tamanho; // Tamanho em metros
    private int ano;
    private double velocidade; // Velocidade em km/h

    // Construtor
    public Barco(String cor, double tamanho, int ano, double velocidade) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    // Método para velejar
    public void velejar() {
        System.out.println("O barco está velejando a " + velocidade + " km/h.");
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Barco [cor=" + cor + ", tamanho=" + tamanho + " metros, ano=" + ano + ", velocidade=" + velocidade + " km/h]";
    }
}
