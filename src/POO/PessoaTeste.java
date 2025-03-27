package POO;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("camila", 18, 1.60);
        System.out.println("Informações iniciais: ");
        pessoa1.exibirInformacoes();

        //Usando os setters
        pessoa1.setNome("Agatha");
        pessoa1.setIdade(21);
        pessoa1.setAltura(1.90);
        pessoa1.exibirInformacoes();

        // usando get
        System.out.println(pessoa1.getNome());
    }
}
