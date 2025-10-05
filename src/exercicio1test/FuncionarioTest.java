package exercicio1test;

import exercicio1.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("jose","85",789,9);

        System.out.printf("Salário: "+  f1.calcularSalario());

    }
}
