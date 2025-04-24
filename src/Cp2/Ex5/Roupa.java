package Cp2.Ex5;

public class Roupa extends Produto{
    public double quantidadeVendida;
    private double descontoPromocional;

    public Roupa(String nome, double precoUnitario, int estoque, double quantidadeVendida, double descontoPromocional) {
        super(nome, precoUnitario, estoque);
        this.quantidadeVendida = quantidadeVendida;
        this.descontoPromocional = descontoPromocional;
    }

    @Override
    public double calcularPreco(int quantidadeVendida) {
        double precoComDesconto = precoUnitario * (1-descontoPromocional/100);
        return precoComDesconto * quantidadeVendida;
    }

}
