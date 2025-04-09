package Heranca;

public class FilmeTerror extends Filme {
    private int numero_sustos;
    public FilmeTerror(String nome, String diretor, int numero_sustos){
        super(nome, diretor); // atributos da classe mãe

        this.numero_sustos = numero_sustos;
    }

    @Override// sobrescrita do metodo
    protected void exibirInfo(){
        super.exibirInfo(); // metodo da classe mãe
        System.out.println("Numero de sustos: " + numero_sustos);
    }

}
