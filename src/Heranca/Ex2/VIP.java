package Heranca.Ex2;

public class VIP extends Ingresso {
    public double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    protected void imprimeValor(){
        super.imprimeValor();

        System.out.println("Valor do ingresso VIP: " + valor + valorAdicional);
    }
}
