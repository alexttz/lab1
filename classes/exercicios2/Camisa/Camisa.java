package Camisa;

public class Camisa {
    // Atributos
    private String cor;
    private String tamanho;
    private String forma;
    private String estilo;

    // Construtor
    public Camisa(String cor, String tamanho, String forma, String estilo) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.forma = forma;
        this.estilo = estilo;
    }

    // Método para vestir a camisa
    public void vestir() {
        System.out.println("A camisa está sendo vestida.");
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

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Camisa [cor=" + cor + ", tamanho=" + tamanho + ", forma=" + forma + ", estilo=" + estilo + "]";
    }
}
