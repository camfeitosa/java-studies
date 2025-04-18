package POOIntro;

// Criação da classe
public class Animal{

    // criação dos atributos
    String nome;
    String especie;
    double peso;
    double altura;
    int idade;

    // Métodos (Ações do objeto)

    // o this representa o objeto -> leao.andar()
    void andar(){
        System.out.println(Animal.this.nome + " está andando");
    }

    void emitirSom(){
        System.out.println(Animal.this.nome + " animal está emitido um som");
    }
}