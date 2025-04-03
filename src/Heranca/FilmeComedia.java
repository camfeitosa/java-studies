package Heranca;

public class FilmeComedia extends Filme{
    public int risadas;

    public FilmeComedia(String nome, String diretor, int risadas){
        super(nome, diretor);
        this.risadas = risadas;
    }


    @Override
    protected void exibirInfo(){
        super.exibirInfo();
        System.out.println("Número de risadas no filme" + risadas);
    }

    public void contarPiada(){
        System.out.println("Piada do filme: " + nome + "Piada aqui");
    }
}
