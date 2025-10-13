public class Venda {
    private String filme;
    private double valor;
    private int ingresso;
    private String tipo;
    private int poltrona;
    private String lanche;

    public Venda(String filme, double valor, int ingresso, String tipo){
        this.filme = filme;
        this.valor = valor;
        this.ingresso = ingresso;
        this.tipo = tipo;
        if (tipo == "Meia" || tipo == "meia"){
            valor = valor/2;
        }

    }
    public Venda(String filme, int ingresso, String lanche){
        this.filme = filme;
        this.ingresso = ingresso;
        this.lanche = lanche;

    }
    public Venda(String filme, int ingresso, int poltrona){
        this.filme = filme;
        this.ingresso = ingresso;
        this.poltrona = poltrona;
    }
    public void setFilme(String filme){
        this.filme = filme;
    }
    public String getFilme(){
        return this.filme;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }

    public void setIngresso(int ingresso){
        this.ingresso = ingresso;
    }
    public int getIngresso(){
        return this.ingresso;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setPoltrona(int poltrona){
        this.poltrona = poltrona;
    }
    public int getPoltrona(){
        return this.poltrona;
    }
    public void setLanche(String lanche){
        this.lanche = lanche;
    }
    public String getLanche(){
        return this.lanche;
    }
}
