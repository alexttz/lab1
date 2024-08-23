public class Carro {

    private double custoFabrica;
    private static final double percentualDistribuidor = 0.28;
    private static final double percentualImpostos = 0.45;

    //Construtor
    public Carro(double custoFabrica){
        this.custoFabrica = custoFabrica;
    }
    // Método que calcula o valor do Distribuidor
    private double calcularValorDistribuidor(){
        return custoFabrica * percentualDistribuidor;
    }
    //Método que calcula o valor dos impostos
    private double calcularValorImpostos(){
        return custoFabrica * percentualImpostos;
    }
    //Método para calcular o custo final
    public double calcularValorFinal(){
        double valorDistribuidor = calcularValorDistribuidor();
        double valorImpostos = calcularValorImpostos();
        return custoFabrica + valorDistribuidor + valorImpostos;
    }
    //Exibir o custo final
    public void exibirCustoFinal(){
        double custoFinal = calcularValorFinal();
        System.out.println("O custo total para o consumidor foi de: R$"+ custoFinal);
    }

    //Aplicação Principal

    public static void main(String[] args) {
        double custoFabrica = 1000;

        Carro carro = new Carro(custoFabrica);

        carro.exibirCustoFinal();
    }


}
