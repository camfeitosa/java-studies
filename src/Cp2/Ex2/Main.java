package Cp2.Ex2;

public class Main {
    public static void main(String[] args) {
        Comum func = new Comum(1200.00, "Luiza");
        Gerente chefe = new Gerente(1200.00, "Roberta");
        Diretor ceo = new Diretor(5000.00, "Juliana", 1200.00);

        chefe.imprimeValor();
        System.out.println();
        func.imprimeValor();
        System.out.println();
        ceo.imprimeValor();
    }
}
