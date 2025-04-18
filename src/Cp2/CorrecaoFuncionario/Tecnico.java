package Cp2.CorrecaoFuncionario;

public class Tecnico extends Assistente{
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int matricula, double bonusSalarial){
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
        bonusSalarial = 5000;
    }

    @Override
    public void exibeDados(){
        System.out.println("Cargo: Técnico");
        super.exibeDados();
        System.out.println("Bônus Salarial: " + bonusSalarial);
        System.out.println("Salário com Bõnus: " + (salario + bonusSalarial));
    }
}
