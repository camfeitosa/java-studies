package Cp2.Ex4;

public class Main {
    public static void main(String[] args) {
        VooDomestico rio = new VooDomestico("Rio de Janeiro", "São Paulo", "20/10/2025", 100.00);
        rio.exibirVoo();

        System.out.println();

        VooInternacional londres = new VooInternacional("Bahia", "Londres - UK", "10/12/2025", 8000);
        londres.exibirVoo();

    }
}
