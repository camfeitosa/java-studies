import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;

        // Declaraçã do objeto Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        numero1 = sc.nextInt(); // nextLine -> string | nextInt -> int

        System.out.println("Digite o segundo número inteiro"); // printa na tela
        numero2 = sc.nextInt(); // exibe o input do usuário

        System.out.println("Digite o terceiro número inteiro");
        numero3 = sc.nextInt();

        int menor, medio, maior;

        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
            if (numero2 > numero3){
                medio = numero2;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero2;
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
            if (numero1 > numero3){
                medio = numero1;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero1;
            }
        } else {
            maior = numero3;
            if (numero1 > numero2){
                medio = numero1;
                menor = numero2;
            } else {
                medio = numero2;
                menor = numero1;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O número do meio é: " + medio); 
        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}
