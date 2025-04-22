package Cp2.Ex3;

public class Livro extends Produto{
    protected double descontoCapa;

    public Livro(String nome, double precoBase) {
        super(nome, precoBase);
        this.descontoCapa = 0.20;
    }

    @Override
    public void exibeInformacoes(){
        System.out.println("Livro:");
        super.exibeInformacoes();
        System.out.println("Desconto de capa: " + (getPreco() - (getPreco() * descontoCapa)));
    }
}
