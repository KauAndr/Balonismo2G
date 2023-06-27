public class Main {
    public static void main(String[] args) {
        // Construindo balões
        Balao b1 = new Balao();
        Balao b2 = new Balao(2, "48", "vermelho", "redondo", 5.00, 80.00, "forte", 14);

        System.out.println(b2.getId() + "," + b2.getRegistro());


        // Chamando o método voar()
        String resultado = b1.voar(new Combustivel());
        // Exibindo resultado do voo
        System.out.println(resultado);
    }
}