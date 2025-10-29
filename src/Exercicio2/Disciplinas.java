package Exercicio2;

public class Diciplinas {
    private long codigo;
    private String nome;
    private boolean tipo;

    public Disciplinas(long codigo, String nome, boolean tipo){
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
    }
    public Disciplina(long codigo, String nome, true){
        this(codigo, nome, true);
    }

    public boolean tipoDisciplina(boolean tipo){
        if (this.tipo ){
            return "Obrigatória";
        }
        return "Optativa";
    }
    public long getCodigo(){
        return this.codigo;
    }
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

}
