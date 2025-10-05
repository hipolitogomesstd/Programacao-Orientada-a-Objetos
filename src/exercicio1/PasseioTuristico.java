package exercicio1;

public class PasseioTuristico {
    private String cidadeDestino;
    private String datasInicial;
    private String dataFinal;

    public PasseioTuristico(String cidadeDestino, String datasInicial, String dataFinal){
        this.cidadeDestino = cidadeDestino;
        this.datasInicial = datasInicial;
        this.dataFinal = dataFinal;
    }

    public String getCidadeDestino() {
        return this.cidadeDestino;
    }
    public String getDatasInicial(){
        return this.datasInicial;
    }
    public String getDataFinal(){
        return this.dataFinal;
    }
    public void setCidadeDestino(String cidadeDestino){
        this.cidadeDestino = cidadeDestino;
    }
    public void setDatasInicial(String datasInicial){
        this.datasInicial = datasInicial;
    }
    public void setDataFinal(String dataFinal){
        this.dataFinal = dataFinal;
    }
}
