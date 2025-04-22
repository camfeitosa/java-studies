package Cp2.Ex4;

public class VooInternacional extends Voo {
    protected double fatorInternacional;

    public VooInternacional(String origem, String destino, String dataVoo, double distancia) {
        super(origem, destino, dataVoo, distancia);
        this.fatorInternacional = 03.00;
    }

    public double CalculaPreco(){
        return getDistancia() * fatorInternacional;
    }

    @Override
    public void exibirVoo(){
        super.exibirVoo();
        System.out.println("Preço da passagem: " + CalculaPreco());
    }


}
