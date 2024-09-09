package Carro;

public class Carro {
    // Atributos
    private String cor;
    private double tamanho; // Tamanho em metros
    private String marca;
    private int ano;

    // Construtor
    public Carro(String cor, double tamanho, String marca, int ano) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
        this.ano = ano;
    }

    // Métodos
    public void andar() {
        System.out.println("O carro está andando.");
    }

    public void estacionar() {
        System.out.println("O carro está estacionado.");
    }

    public void correr() {
        System.out.println("O carro está correndo.");
    }

    public void buzinar() {
        System.out.println("O carro está buzinando: Beep beep!");
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro [cor=" + cor + ", tamanho=" + tamanho + " metros, marca=" + marca + ", ano=" + ano + "]";
    }
}

