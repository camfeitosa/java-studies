package Cp2.Ex4;

public class VooDomestico extends Voo {
    protected double taxaDomestico;

    public VooDomestico(String origem, String destino, String dataVoo, double distancia) {
        super(origem, destino, dataVoo, distancia);
        this.taxaDomestico = 5.00;
    }

    public double CalculaPreco(){
      return getDistancia() * taxaDomestico;
    }

    @Override
    public void exibirVoo(){
        super.exibirVoo();
        System.out.println("Preço da passagem: " + CalculaPreco());
    }

}
