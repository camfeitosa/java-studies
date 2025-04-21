package Cp2.Ex2;

public class Gerente extends Funcionario {
    private double bonusAdicional;

    public Gerente(double salario, String nome, double bonusAdicional) {
        super(salario, nome);
        this.bonusAdicional = bonusAdicional;
    }

    @Override
    public void imprimeValor(){
        super.imprimeValor();
        System.out.println("Bonus adicional: " + bonusAdicional);
        System.out.println("Salário final: " + salario + bonusAdicional);
    }
}
