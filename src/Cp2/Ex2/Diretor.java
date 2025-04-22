package Cp2.Ex2;

public class Diretor extends Funcionario{
    double particapacaoLucros;

    public Diretor(double salario, String nome, double particapacaoLucros) {
        super(salario, nome);
        this.particapacaoLucros = particapacaoLucros;
    }

    @Override
    public void imprimeValor(){
        System.out.println("Diretor...");
        super.imprimeValor();
        System.out.println("Salário final: " + (salario + particapacaoLucros));
    }
}
