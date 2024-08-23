// Classe para representar uma temperatura
public class Temperatura {
    // Atributo para armazenar o valor em Fahrenheit
    private double fahrenheit;

    // Construtor para inicializar o valor em Fahrenheit
    public Temperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    // Método para converter Fahrenheit para Celsius
    public double converterParaCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Método para exibir o valor em Celsius
    public void exibirCelsius() {
        double celsius = converterParaCelsius();
        System.out.println(fahrenheit + "°F é equivalente a " + celsius + "°C");
    }
}
