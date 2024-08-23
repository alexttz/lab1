public class Funcionario {

    //Atributos da Classe
    double numeroCarros;
    double totalVendas;
    double salarioFixo;
    double salarioFinal;

    //Método Construtor
    public Funcionario(double numeroCarros, double totalVendas, double salarioFixo){
        this.numeroCarros = numeroCarros;
        this.totalVendas = totalVendas;
        this.salarioFixo = salarioFixo;
    }

    //Método da Classe

    public void mostrarResultado(){

        double comissao = numeroCarros * totalVendas;

        salarioFinal = salarioFixo + comissao;

        System.out.println("Salário Final; "+salarioFinal);
    }
    
}
