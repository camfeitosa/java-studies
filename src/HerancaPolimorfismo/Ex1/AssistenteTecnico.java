package HerancaPolimorfismo.Ex1;

public class AssistenteTecnico extends Assistente {
    public double bonusSalarial;

    public AssistenteTecnico(String Nome, int Idade, int numeroMatricula, double bonusSalarial) {
        super(Nome, Idade, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    protected void exibirDados() {
        super.exibirDados();
        System.out.println("Bonus Salarial: " + bonusSalarial);
    }
}
