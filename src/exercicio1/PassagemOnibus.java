package exercicio1;

public class PassagemOnibus {
    private String cidadeOrigem;
    private String cidadeDestino;
    private String dataInicial;
    private String dataFinal;
    private int quantPassageiros;
    private int quantPassageirosMenor;

    public PassagemOnibus(String cidadeOrigem, String cidadeDestino, String dataInicial, String dataFinal, int quantPassageiros, int quantPassageirosMenor) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.quantPassageiros = quantPassageiros;
        this.quantPassageirosMenor = quantPassageirosMenor;
    }

    public String getCidadeOrigem() {
        return this.cidadeOrigem;
    }

    public String getCidadeDestino() {
        return this.cidadeDestino;
    }

    public String getDataInicial() {
        return this.dataInicial;
    }

    public String getDataFinal() {
        return this.dataFinal;
    }

    public int getQuantPassageiros() {
        return this.quantPassageiros;
    }

    public int getQuantPassageirosMenor() {
        return this.quantPassageirosMenor;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public void setQuantPassageiros(int quantPassageiros) {
        this.quantPassageiros = quantPassageiros;
    }

    public void setQuantPassageirosMenor(int quantPassageirosMenor) {
        this.quantPassageirosMenor = quantPassageirosMenor;
    }
}
