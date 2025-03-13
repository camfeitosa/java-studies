package Cp1;
import java.util.Scanner;

public class InicioFim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de inicio: ");

        int inicio = sc.nextInt();

        System.out.println("Digite um numero de fim: ");
        int fim = sc.nextInt();

        // enquanto o valor de inicio for menor que fim imprima os números de inicio = i
        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }

    }
}