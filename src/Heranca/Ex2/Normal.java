package Heranca.Ex2;

public class Normal extends Ingresso{
    public Normal(double valor){
        super(valor);
    }

    @Override
    protected void imprimeValor(){
        super.imprimeValor();
        System.out.println("Ingresso normal: " + valor);
    }
}
