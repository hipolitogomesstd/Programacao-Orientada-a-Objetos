package exercicoIncremental1;

import java.time.LocalDate;
import java.time.LocalTime;

public class AluguelCarro {
    private String cidadeDestino;
    private LocalDate datasInicial;
    private LocalDate dataFinal;
    private LocalTime horaRetirada;
    private LocalTime horaDevolucao;
    private char categoria;

    public AluguelCarro(String cidadeDestino, LocalDate datasInicial, LocalDate dataFinal, LocalTime horaRetirada, LocalTime horaDevolucao){
        this.cidadeDestino = cidadeDestino;
        this.datasInicial = datasInicial;
        this.dataFinal = dataFinal;
        this.horaRetirada = horaRetirada;
        this.horaDevolucao = horaDevolucao;
    }
    public AluguelCarro(String cidadeDestino, LocalDate datasInicial, LocalDate dataFinal, LocalTime horaRetirada){
        this.cidadeDestino = cidadeDestino;
        this.datasInicial = datasInicial;
        this.dataFinal = dataFinal;
        this.horaRetirada = horaRetirada;
        this.horaDevolucao = horaRetirada;
    }

    public double ValorAlocacao(LocalDate datasInicial, LocalDate dataFinal, char categoria){
        if (categoria =='A'){

        }
    }

    public String getCidadeDestino() {
        return this.cidadeDestino;
    }
    public LocalDate getDatasInicial(){
        return this.datasInicial;
    }
    public LocalDate getDataFinal(){
        return this.dataFinal;
    }
    public LocalTime getHoraRetirada(){
        return this.horaRetirada;
    }
    public LocalTime getHoraDevolucao(){
        return this.horaRetirada;
    }
    public void setCidadeDestino(String cidadeDestino){
        this.cidadeDestino = cidadeDestino;
    }
    public void setDatasInicial(LocalDate datasInicial){
        this.datasInicial = datasInicial;
    }
    public void setDataFinal(LocalDate dataFinal){
        this.dataFinal = dataFinal;
    }
    public void setHoraRetirada(LocalTime horaRetirada){
        this.horaRetirada = horaRetirada;
    }
    public void setHoraDevolucao(LocalTime horaDevolucao){
        this.horaDevolucao = horaDevolucao;
    }
}
