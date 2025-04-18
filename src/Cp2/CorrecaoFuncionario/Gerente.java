package Cp2.CorrecaoFuncionario;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome,salario);
    }

    @Override
    public void exibeDados(){
        System.out.println("Cargo: gerente");
        super.exibeDados();
    }
}
