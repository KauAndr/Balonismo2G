public class Balao {
    // Atributos
    int id;
    String registro;
    String cor;
    String tipo;
    double altura;
    double peso;
    String porte;
    int capacidadePessoas;
    // Métodos
    public String voar(Combustivel gasPropano){
        return "voando com " + gasPropano;
    }
}
