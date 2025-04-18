package POOIntro;

// Ler ou alterar um atributo encapsulado pode ser feito a partir de getters e setters

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

// declarando método construtor
    // public nomeDoArquivo(atributos)

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // método GET
    public String getNome(){
        return nome;
    }

    // método SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade(){
        return nome;
    }

    public void setIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        }
    }

    public String getAltura(){
        return nome;
    }

    public void setAltura(double altura) {
        if (altura > 0 ){
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
}
