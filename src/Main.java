public class Main {
    public static void main(String[] args) {
        // Construindo balões
        Balao b1 = new Balao();
        // Chamando o método voar()
        String resultado = b1.voar(new Combustivel());
        // Exibindo resultado do voo
        System.out.println(resultado);
    }
}