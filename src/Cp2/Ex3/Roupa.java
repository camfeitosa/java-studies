package Cp2.Ex3;

public class Roupa extends Produto{
    protected double desconto;

    public Roupa(String nome, double precoBase) {
        super(nome, precoBase);
        this.desconto = 0.05;
    }

    @Override
    public void exibeInformacoes(){
        System.out.println("Roupas...");
        super.exibeInformacoes();

        System.out.println("Preço com desconto: " + (getPreco() - (getPreco() * desconto) ));

    }
}
