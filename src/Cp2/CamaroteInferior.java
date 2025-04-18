package Cp2;

public class CamaroteInferior extends Vip {
    private String localizacao;

    public CamaroteInferior(double valor, double valorAdicional, String localizacao){
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao(){
        System.out.println("Localização do Ingresso: " + localizacao);
    }

}
