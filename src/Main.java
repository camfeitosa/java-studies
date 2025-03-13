//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // recebe input do usuário

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!"); // new line para ir para próx linha
        System.out.print("Teste");
        
        int numero1;
        int numero2;
        int soma;

        // Declaraçã do objeto Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        numero1 = sc.nextInt(); // nextLine -> string nextInt -> int

        System.out.println("Digite o segundo número inteiro");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.println("O valor da soma é: " + soma);

    }
}