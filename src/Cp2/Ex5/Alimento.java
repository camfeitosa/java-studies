package Cp2.Ex5;

public class Alimento extends Produto{
    public Alimento(String nome, double precoUnitario, int estoque) {
        super(nome, precoUnitario, estoque);
    }

    @Override
    public double calcularPreco(int quantidadeVendida){
        return precoUnitario * quantidadeVendida;
    }
}



