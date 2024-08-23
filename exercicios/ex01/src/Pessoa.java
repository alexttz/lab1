
public class Pessoa {
    // Atributos para armazenar ano, mês e dia
    int ano;
    int mes;
    int dia;

    // Construtor da classe Pessoa, que inicializa os atributos ano, mes e dia
    public Pessoa(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    // Método para mostrar os detalhes da pessoa
    public void mostrarDetalhes() {
        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Dia: " + dia);
    }

    // Método para calcular o total de dias considerando ano, mês e dia
    public int calculo() {
        // Assumimos que cada mês tem 30 dias para simplificação
        return (ano * 365 + mes * 30) + dia;
    }

    // Método main para executar o código
    public static void main(String[] args) {
        // Criação de um objeto Pessoa com ano=27, mês=10, dia=21
        Pessoa pessoa1 = new Pessoa(27, 10, 21);

        // Exibe os detalhes da pessoa
        pessoa1.mostrarDetalhes();
        
        // Exibe o total de dias calculado
        System.out.println("Total de dias: " + pessoa1.calculo());
    }
}

