package Cp2.Ex1;

public class Figura {
    private int quantidadeLados;

    public Figura(int quantidadeLados) {
        this.quantidadeLados = quantidadeLados;
    }

    public void calcularArea(){
        System.out.println("Calculando area...");
    }

    public void calcularPerimetro(){
        System.out.println("Calculando periemetro...");
    }

    public int getQuantidadeLados() {
        return quantidadeLados;
    }

    public void setQuantidadeLados(int quantidadeLados) {
        this.quantidadeLados = quantidadeLados;
    }
}

