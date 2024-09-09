package Bandeiras;

public class Bandeira {
    // Atributos
    private String formas;
    private String cores;
    private String pais;

    // Construtor
    public Bandeira(String formas, String cores, String pais) {
        this.formas = formas;
        this.cores = cores;
        this.pais = pais;
    }

    // Método para astiar (levantar) a bandeira
    public void astiar() {
        System.out.println("A bandeira está sendo astiada.");
    }

    // Método para simbolizar a bandeira
    public void simbolizar() {
        System.out.println("A bandeira simboliza o país: " + pais + " com formas: " + formas + " e cores: " + cores + ".");
    }

    // Métodos getters e setters
    public String getFormas() {
        return formas;
    }

    public void setFormas(String formas) {
        this.formas = formas;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Bandeira [formas=" + formas + ", cores=" + cores + ", pais=" + pais + "]";
    }
}
