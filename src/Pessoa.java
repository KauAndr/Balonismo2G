public class Pessoa {
    // Atributos
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private boolean assinaturaTermo;
    private String emergencia;
    private String endereco;

    public Pessoa(String nome, String cpf, String rg, String telefone, boolean assinaturaTermo, String emergencia, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.assinaturaTermo = assinaturaTermo;
        this.emergencia = emergencia;
        this.endereco = endereco;
    }

    public Pessoa(){}

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAssinaturaTermo() {
        return assinaturaTermo;
    }

    public void setAssinaturaTermo(boolean assinaturaTermo) {
        this.assinaturaTermo = assinaturaTermo;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Métodos
//    public Passeio buscaPasseio(){
//       return new Passeio();
//    }
}
