package Cp2.Ex5;

public class Produto {
    protected String nome;
    protected double precoUnitario;
    protected int estoque;

    public Produto(String nome, double precoUnitario, int estoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.estoque = estoque;
    }

    public double calcularPreco(int quantidadeVendida) { // como é algo que vai ser igual nas classes, adiciona o parametro e o cálcculo
        return precoUnitario * quantidadeVendida;
    }

    public void imprimir(int quantidadeVendida) { // parametro que representa um atributo na classe filha (ainda não existente)
        System.out.println("Produto: " + nome);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Quantidade em estoque: " + estoque);
        System.out.println("Preço Total: R$ " + calcularPreco(quantidadeVendida));
    }


}
