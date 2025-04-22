package Cp2.Ex4;

public class Voo {
    protected String origem;
    protected String destino;
    protected String dataVoo;
    private double distancia;

    public Voo(String origem, String destino, String dataVoo, double distancia) {
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public void exibirVoo(){
        System.out.println("Informações do voo...");
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Data Voo: " + dataVoo);
    }
}
