package exercicoIncremental1;
// por enquanto não é necessario a classe,
public class Carro {
    private char categoria;
    private double km;


    public Carro(char categoria, double valorLocacao){
        this.categoria = categoria;
        this.km = 200;
        this.valorLocacao = valorLocacao;
    }
    public Carro(char categoria, double km, double valorLocacao){
        this.categoria = categoria;
        this.km = 200;
        this.valorLocacao = valorLocacao;
    }
    public void setCategoria(char categoria){
        this.categoria = categoria;
    }
    public char getCategoria(){
        return this.categoria;
    }
    public void setKm(double km){
        this.km = km;
    }
    public void getKm(){
        return this.km;
    }
    public void setValorLocacao(double valorLocacao){
        this.valorLocacao = valorLocacao;
    }
    public double getValorLocacao(){
        return this.valorLocacao;
    }
}
