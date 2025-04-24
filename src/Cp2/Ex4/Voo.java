package Cp2.Ex4;

public class Voo {
    protected String origem; // protected pois serão usadas nas classes filhas
    protected String destino;
    protected String dataVoo;
    private double distancia; // poderia ser protected

    public Voo(String origem, String destino, String dataVoo, double distancia) {
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;
        this.distancia = distancia;
    }

    public double getDistancia() {
        return distancia;
    }

    public double calcularPreco(){ // criar na classe mãe pois é usada em todas as outras
        return 0.0;
    }

    public void exibirVoo(){
        System.out.println("Informações do voo...");
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Data Voo: " + dataVoo);
    }
}
