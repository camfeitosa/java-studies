package HerancaPolimorfismo.Ex1;

public class AssistenteAdministrativo extends Assistente{
    public String turno;

    public AssistenteAdministrativo(String Nome, int Idade, int numeroMatricula, String turno ) {
        super(Nome, Idade, numeroMatricula);
        this.turno = turno;
    }

    @Override
    protected void exibirDados() {
        super.exibirDados();
        System.out.println("Turno: " + turno);
    }
}
