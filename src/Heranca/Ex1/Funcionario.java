package Heranca.Ex1;

public class Funcionario {

    public String Nome;
    private int Idade;


    public Funcionario(String Nome, int idade){
        this.Nome = Nome;
        this.Idade = idade;
    }

    protected void exibirDados() {
        System.out.println("Nome: " + Nome + "\nIdade: " + Idade);
    }
}
