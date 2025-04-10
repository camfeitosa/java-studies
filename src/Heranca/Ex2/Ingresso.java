package Heranca.Ex2;

public class Ingresso {
    public double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    protected void imprimeValor(){
        System.out.println("Valor: " + valor);
    }
}
