package exercicio1;

import java.io.PrintStream;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    private int anosServico;

    public Funcionario(String nome, String cpf, double salarioBase, int anosServico) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.anosServico = anosServico;
    }

    public double calcularSalario() {
        double salario;
        if (this.anosServico > 5) {
            salario = this.salarioBase + (1000 * this.anosServico);
        }
        if (this.anosServico >= 3 && this.anosServico <= 5) {
            salario = this.salarioBase * (1 + 0.04) * this.anosServico;
        } else {
            salario = this.salarioBase;
        }
        return salario;
    }

    public double calcularSalarioComFaltas(int nFaltas) {
        if (nFaltas > 0 && nFaltas < 30) {
            double salario = this.calcularSalario();

            while (nFaltas > 0) {
                salario = (salario * 0.03) - salario;
                nFaltas -= 1;
            }
            return salario;
        }
        return calcularSalario();
    }
}
