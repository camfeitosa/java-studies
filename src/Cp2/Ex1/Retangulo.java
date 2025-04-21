package Cp2.Ex1;

public class Retangulo extends Figura {
    private double altura;
    private double base;

    public Retangulo(int quantidadeLados, double altura, double base) {
        super(quantidadeLados);
        this.altura = altura;
        this.base = base;
    }

    public void calcularArea(){
        System.out.println("Área: " + base * altura / 2);
    }

    public void calcularPerimetro(){
        System.out.println("Periemetro: " + 2 * ( base + altura));
    }


    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.base = largura;
    }
}
