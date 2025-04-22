package Cp2.Teatro;

public class TicketTester {
    public static void main(String[] args) {
       // Ingresso ingresso = new Ingresso(15.0);
       // ingresso.imprimeValor();
        Normal ingressoNormal = new Normal(15.0);

        ingressoNormal.imprimeTipo();
        ingressoNormal.imprimeValor();

        Vip ingressoVip = new Vip(15.0,45.0);
        System.out.println("Valor do ingresso VIP: R$ " + ingressoVip.getValorVip());

        CamaroteInferior camaroteInferior = new CamaroteInferior(15.0,60.0,"Setor A - Poltrona 17");
        camaroteInferior.imprimeLocalizacao();

        System.out.println("Valor do camarote Inferior: R$ "+camaroteInferior.getValorVip());

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(15.0,50.0);
        System.out.println("Valor do camarote Superior: R$ "+ camaroteSuperior.getValorIngresso());

    }
}
