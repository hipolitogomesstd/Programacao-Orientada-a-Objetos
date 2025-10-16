package exercicoIncremental1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AluguelCarro {
    private String cidadeDestino;
    private LocalDate datasInicial;
    private LocalDate dataFinal;
    private LocalTime horaRetirada;
    private LocalTime horaDevolucao;
    private double km;

    public AluguelCarro(Carro categoria, String cidadeDestino, LocalDate datasInicial, LocalDate dataFinal, LocalTime horaRetirada, LocalTime horaDevolucao){
        this.cidadeDestino = cidadeDestino;
        this.datasInicial = datasInicial;
        this.dataFinal = dataFinal;
        this.horaRetirada = horaRetirada;
        this.horaDevolucao = horaDevolucao;
        this.km = 200;
    }
    public AluguelCarro(Carro categoria, String cidadeDestino, LocalDate datasInicial, LocalDate dataFinal, LocalTime horaRetirada km){
        this.cidadeDestino = cidadeDestino;
        this.datasInicial = datasInicial;
        this.dataFinal = dataFinal;
        this.horaRetirada = horaRetirada;
        this.horaDevolucao = horaRetirada;
        this.km = km;
    }

    public double ValorAlocacao(LocalDate datasInicial, LocalDate dataFinal, char categoria){
        int a = 350;
        int b = 250;
        int c = 150;
        double valor;
        long dias = ChronoUnit.DAYS.between(this.dataFinal,this.datasInicial);
        if (categoria =='A'){
            valor = 350 * dias;
        }
        else if (categoria =='B'){
            valor = 250 * dias;
        }
        else if (categoria =='C'){
            valor  = 150 * dias;
        }
        return valor;
    }
    public long KmAcumulado(LocalDate datasInicial, LocalDate dataFinal){
        long dias = ChronoUnit.DAYS.between(this.dataFinal,this.datasInicial);
        long total = 200 * dias;
        return total;
    }
    public double KmAdicional(double km, char categoria){
        double valor;
        if (categoria =='A'){
            valor = 0.3 * km;
        }
        else if (categoria =='B'){
            valor = 0.25 * km;
        }
        else if (categoria =='C'){
            valor  = 0.2 * km;
        }
    }

    public double ilimitada(LocalDate datasInicial, LocalDate dataFinal, char categoria){
        double valor;
        long dias = ChronoUnit.DAYS.between(this.dataFinal,this.datasInicial);
        if (categoria =='A'){
            valor = 70 * dias;
        }
        else if (categoria =='B'){
            valor = 60 * dias;
        }
        else if (categoria =='C'){
            valor = 50 * dias;
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
