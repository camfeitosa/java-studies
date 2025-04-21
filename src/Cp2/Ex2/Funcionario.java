package Cp2.Ex2;

public class Funcionario {
    protected double salario;
    protected String nome;

    public Funcionario(double salario, String nome){
        this.salario = salario;
        this.nome = nome;
    }

    public void imprimeValor(){
        System.out.println("Salário fixo: " + salario);
    }

    public void getSalario(){
        System.out.println(salario);
    }
}
