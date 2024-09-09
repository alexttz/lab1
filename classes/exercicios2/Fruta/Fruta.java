package Fruta;

public class Fruta {
    // Atributos
    private String cor;
    private String forma;
    private String sabor;

    // Construtor
    public Fruta(String cor, String forma, String sabor) {
        this.cor = cor;
        this.forma = forma;
        this.sabor = sabor;
    }

    // Método para amadurecer
    public void amadurecer() {
        System.out.println("A fruta está amadurecendo.");
    }

    // Método para cair
    public void cair() {
        System.out.println("A fruta está caindo.");
    }

    // Métodos getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Fruta [cor=" + cor + ", forma=" + forma + ", sabor=" + sabor + "]";
    }
}

