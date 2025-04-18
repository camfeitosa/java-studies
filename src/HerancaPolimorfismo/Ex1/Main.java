package HerancaPolimorfismo.Ex1;

public class Main {
    public static void main(String[] args) {
        AssistenteTecnico pessoa1 = new AssistenteTecnico("Julia", 21, 1334, 500.00);

        pessoa1.exibirDados();

        System.out.println();

        AssistenteAdministrativo pessoa2 = new AssistenteAdministrativo("Joana", 27, 1879, "manhã");
        pessoa2.exibirDados();
    }
}
