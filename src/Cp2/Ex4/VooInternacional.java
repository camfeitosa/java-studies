package Cp2.Ex4;

public class VooInternacional extends Voo {
    private double fatorInternacional;
    private double taxaConversao;

    public VooInternacional(String origem, String destino, String dataVoo, double distancia) {
        super(origem, destino, dataVoo, distancia);
        this.fatorInternacional = 1.50;
        this.taxaConversao = 1.20;
    }

    @Override
    public double calcularPreco(){
        double preco = getDistancia() * fatorInternacional;
        if (preco > 5000.00){
            preco *= taxaConversao;
        }
        return preco;
    }

    @Override
    public void exibirVoo(){
        super.exibirVoo();
        System.out.println("Preço da passagem: R$ " + calcularPreco());
    }


}
