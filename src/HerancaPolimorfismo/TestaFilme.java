package HerancaPolimorfismo;

public class TestaFilme {
    public static void main(String[] args) {
        FilmeTerror filme1 = new FilmeTerror("Corra", "Jordan Peele", 0);
        FilmeComedia filme2 = new FilmeComedia("As branquelas","Keenen", 100);

        filme1.avaliarFilme(5);
        filme2.avaliarFilme(5);

        filme1.exibirInfo();
        filme2.exibirInfo();
    }
}
