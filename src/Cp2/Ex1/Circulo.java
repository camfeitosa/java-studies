package Cp2.Ex1;

public class Circulo extends Figura{

    private double raio;
    private double pi = 3.14;

    public Circulo(int quantidadeLados) {
        super(quantidadeLados);
    }

    @Override
    public void calcularArea() {
        System.out.println("Area = " + pi * Math.pow(raio, 2));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perimetro = " + 2 * pi * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }
}
