package Cp1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoIdeal;

        System.out.println("Digite sua altura : ");
        double altura = sc.nextDouble();

        System.out.println("Digite seu sexo (F ou M): ");
        char sexo = sc.next().charAt(0);

        switch(sexo){
            case 'F':
                pesoIdeal = (72.7 * altura) - 58;
                System.out.println(pesoIdeal);
                break;
            case 'M':
                pesoIdeal = (62.1 * altura) / 44.7;
                System.out.println(pesoIdeal);
                break;

        }
    }
}
