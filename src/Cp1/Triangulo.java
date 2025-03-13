package Cp1;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor dos tres lados do triangulo: ");
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Equilatero");
        } else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("Isosceles");
        } else{
            System.out.println("Escaleno");
        }
    }
}
