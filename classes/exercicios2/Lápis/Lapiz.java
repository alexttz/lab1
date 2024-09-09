package Lápis;

public class Lapiz {
    // Atributos
    private String cor;
    private double tamanho; // Tamanho em centímetros
    private String marca;
    private String forma;

    // Construtor
    public Lapiz(String cor, double tamanho, String marca, String forma) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
        this.forma = forma;
    }

    // Método para escrever
    public void escrever() {
        System.out.println("O lápis está escrevendo.");
    }

    // Método para desenhar
    public void desenhar() {
        System.out.println("O lápis está desenhando.");
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

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Lápis [cor=" + cor + ", tamanho=" + tamanho + " cm, marca=" + marca + ", forma=" + forma + "]";
    }
}

