package Cp2.Teatro;

class Ingresso{
    protected double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }

    public void imprimeValor(){
        System.out.println("Valor do ingresso: R$ "+ valor);
    }

}