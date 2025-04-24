package Cp2.Ex4;

public class VooDomestico extends Voo {
    private double taxaDomestico;

    public VooDomestico(String origem, String destino, String dataVoo, double distancia) {
        super(origem, destino, dataVoo, distancia);
        this.taxaDomestico = 02.00;
    }

    @Override
    public double calcularPreco(){
        super.calcularPreco();
        return getDistancia() * taxaDomestico;
    }

    @Override
    public void exibirVoo(){
        super.exibirVoo();
        System.out.println("Preço da passagem: R$ " + calcularPreco());
        System.out.printf("Voo R$ %.2f\n", calcularPreco());
    }

}
