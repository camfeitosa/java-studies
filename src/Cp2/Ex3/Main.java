package Cp2.Ex3;

public class Main {
    public static void main(String[] args) {
        Eletronico celular = new Eletronico("Galaxy M31", 1200.00);
        celular.exibeInformacoes();

        System.out.println();

        Livro harryPotter = new Livro("Harry Potter", 50.00);
        harryPotter.exibeInformacoes();

        System.out.println();

        Roupa blusa = new Roupa("Cropped", 70.00);
        blusa.exibeInformacoes();
    }
}
