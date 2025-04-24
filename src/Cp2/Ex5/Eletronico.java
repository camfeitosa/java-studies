package Cp2.Ex5;

public class Eletronico extends Produto{
    private double desconto;

    public Eletronico(String nome, double precoUnitario, int estoque, double desconto) {
        super(nome, precoUnitario, estoque);
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco(int quantidadeVendida) {
        double precoComDesconto = precoUnitario * (1-desconto/100);
        return precoComDesconto * quantidadeVendida;
    }


}
