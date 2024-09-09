package Animal;

public class Animal {
    // Atributos
    private String cor;
    private double tamanho; // Tamanho em metros
    private String habitat;
    private String especie;

    // Construtor
    public Animal(String cor, double tamanho, String habitat, String especie) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.habitat = habitat;
        this.especie = especie;
    }

    // Métodos
    public void comer() {
        System.out.println("O animal está comendo...");
    }

    public void nadar() {
        System.out.println("O animal está nadando...");
    }

    public void escalar() {
        System.out.println("O animal está escalando...");
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

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal [cor=" + cor + ", tamanho=" + tamanho + " metros, habitat=" + habitat + ", espécie=" + especie + "]";
    }
}

