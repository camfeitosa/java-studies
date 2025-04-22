package Cp2.Ex3;

public class Produto {
    protected String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double getPreco(){
        return precoBase;
    }

    public void exibeInformacoes(){
        System.out.println("Nome do produto: " + nome + "\n Preço base: " + precoBase);
    }
}
