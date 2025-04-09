package Heranca.Ex1;

public class Assistente extends Funcionario {
    private int numeroMatricula;

    public Assistente(String Nome, int Idade, int numeroMatricula) {
        super(Nome, Idade);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    protected void exibirDados() {
        super.exibirDados();
        System.out.println("Número da Matricula: " + this.numeroMatricula);
    }
}
