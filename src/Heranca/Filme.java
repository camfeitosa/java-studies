package Heranca;

public class Filme {
    protected String nome;
    protected String diretor;
    protected double avaliacao;


    public Filme(String nome, String diretor){
        this.nome = nome;
        this.diretor = diretor;
        this.avaliacao = 0.0;
    }

    protected void exibirInfo(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Nome do diretor: " + diretor);
        System.out.println("Avaliações: " + avaliacao);
    }

    public void avaliarFilme(double avaliacao){
        if (avaliacao >= 0 && avaliacao <= 5){
            System.out.println("O filme foi avaliado com a nota: " + avaliacao + "/5");
        } else{
            System.out.println("Por favor insira um valo válido");
        }
    }


}
