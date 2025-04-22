package Cp2.Ex2;

public class Gerente extends Funcionario {
    private double bonusAdicional;

    public Gerente(double salario, String nome) {
        super(salario, nome);
        this.bonusAdicional = 5000.00;
    }

    @Override
    public void imprimeValor(){
        double salarioFinal = salario + bonusAdicional;
        System.out.println("Gerente...");
        super.imprimeValor();
        System.out.println("Bonus adicional: " + bonusAdicional);
        System.out.println("Salário final: " + salarioFinal );
    }
}
