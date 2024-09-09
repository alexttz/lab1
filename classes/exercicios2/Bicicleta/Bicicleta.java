package Bicicleta;

public class Bicicleta {
    // Atributos
    private String cor;
    private String tamanho;
    private String marca;
    private String forma;

    // Construtor
    public Bicicleta(String cor, String tamanho, String marca, String forma) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
        this.forma = forma;
    }

    // Método para andar
    public void andar() {
        System.out.println("A bicicleta está andando.");
    }

    // Método para correr
    public void correr() {
        System.out.println("A bicicleta está correndo.");
    }

    // Método para estacionar
    public void estacionar() {
        System.out.println("A bicicleta está estacionada.");
    }

    // Métodos getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
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
        return "Bicicleta [cor=" + cor + ", tamanho=" + tamanho + ", marca=" + marca + ", forma=" + forma + "]";
    }
}

