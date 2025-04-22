package Cp2.Ex3;

public class Eletronico extends Produto{
    protected double desconto;

    public Eletronico(String nome, double precoBase) {
        super(nome, precoBase);
        this.desconto = 0.10;
    }

    @Override
    public void exibeInformacoes(){
        System.out.println("Eletrônico: ");
        super.exibeInformacoes();
        System.out.println("Preço com desconto: " + (getPreco() - (getPreco() * desconto) ));
    }

}
