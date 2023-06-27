public class Piloto {

    private String nome;
    private String cpf;
    private int registro;

    public Piloto(String nome, String cpf, int registro) {
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Piloto(){}

}
