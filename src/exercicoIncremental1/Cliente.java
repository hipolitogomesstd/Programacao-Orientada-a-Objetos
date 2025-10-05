package exercicoIncremental1;

public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;

    public Cliente(String nome, String telefone, String cpf){ // Construtor
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    //metodos
    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone( String telefone){
        this.telefone = telefone;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
