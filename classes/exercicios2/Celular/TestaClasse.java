public class TestaClasse {
    public static void main(String[] args) {
        // Criando um objeto Celular
        Celular meuCelular = new Celular("Azul", 6.0, "Modelo Y", 2023);

        // Chamando métodos da classe Celular
        meuCelular.ligar();          // Método para ligar o celular
        meuCelular.tocarMusica();    // Método para tocar música

        // Exibindo as informações do celular
        System.out.println(meuCelular);
    }
}
