package Caderno;

public class Caderno {
    // Atributos
    private String cor;
    private String marca;
    private int numeroDePaginas;

    // Construtor
    public Caderno(String cor, String marca, int numeroDePaginas) {
        this.cor = cor;
        this.marca = marca;
        this.numeroDePaginas = numeroDePaginas;
    }

    // Método para tomar notas
    public void tomarNotas() {
        System.out.println("Notas estão sendo tomadas no caderno.");
    }

    // Método para organizar o caderno
    public void organizar() {
        System.out.println("O caderno está sendo organizado.");
    }

    // Métodos getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Caderno [cor=" + cor + ", marca=" + marca + ", número de páginas=" + numeroDePaginas + "]";
    }
}

