package Cp1;

import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        boolean condicao = (idade >= 18) ? true : false;

        if(condicao) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
