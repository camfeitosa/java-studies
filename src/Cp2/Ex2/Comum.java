package Cp2.Ex2;

public class Comum extends Funcionario{
    public Comum(double salario, String nome){
        super(salario, nome);
    }

    @Override
    public void imprimeValor() {
        System.out.println("Funcionário comum...");
        super.imprimeValor();
    }
}
