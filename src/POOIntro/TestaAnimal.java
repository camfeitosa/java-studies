package POOIntro;

public class TestaAnimal {
    public static void main(String[] args) {
        // instanciando o objeto leao
        Animal leao = new Animal();

        leao.nome = "Mufasa";
        leao.especie = "Africano";
        leao.peso = 190.0;
        leao.altura = 1.20;
        leao.idade = 19;

        Animal macaco = new Animal();

        macaco.nome = "Jorge";
        macaco.especie = "Mico-leão-dourado";
        macaco.peso = 20.0;
        macaco.altura = 0.75;
        macaco.idade = 3;

        // print no atributo nome do leão
        System.out.println("Nome do leão: " + leao.nome);

        // chama o metodo andar para o objeto Leão
        leao.andar();

        System.out.println("\nIdade do macaco: " + macaco.idade);
        macaco.emitirSom();

    }
}
